package br.gov.serpro.caixa24h;

import br.gov.serpro.exception.OperacaoInvalidaException;
import br.gov.serpro.exception.SaldoInsuficienteException;
import br.gov.serpro.exception.TransferenciaInvalidaException;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.Assert.assertNull;

public class Caixa24hTest {

    private static final BancoMock BANCO = new BancoMock("XPTO", 1L);
    private static final ContaMock CONTA = new ContaMock(BigDecimal.ZERO,"123X");
    private static final ContaMock CONTADESTINO = new ContaMock(BigDecimal.ZERO, "4568");

    Caixa24h caixa;

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveCriarContaComBancoNulo() {
        caixa = new Caixa24h(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveCriarContaNulo() {
        caixa = new Caixa24h(BANCO);
    }

    @Test
    public void deveChamarDepositarDoMock()  throws OperacaoInvalidaException {
        caixa = new Caixa24h(BANCO);
        caixa.depositar(BigDecimal.ZERO, CONTA);
        // Apenas para testar se esta executando a chamada do mock  
    }

    @Test
    public void deveChamarSacarDoMock() throws Exception {
        caixa = new Caixa24h(BANCO);
        caixa.sacar(BigDecimal.ZERO, CONTA);
        // Apenas para testar se esta executando a chamada do mock
    }

    @Test
    public void deveChamarConsultarDoMock() throws  OperacaoInvalidaException {
        caixa = new Caixa24h(BANCO);
        assertNull(caixa.consultarSaldo(CONTA));
    }

    @Test
    public void deveChamarConsultarExtratoDoMock() throws  OperacaoInvalidaException {
        caixa = new Caixa24h(BANCO);
        LocalDate dataInicio = LocalDate.parse("2018-01-01");
        LocalDate dataFim = LocalDate.parse("2018-12-05");
        assertNull(caixa.consultaExtrato(CONTA, dataInicio, dataFim));
    }

    @Test
    public void deveChamarTransferirValorDoMock()
            throws TransferenciaInvalidaException, SaldoInsuficienteException, OperacaoInvalidaException {
        caixa = new Caixa24h(BANCO);
        caixa.transferirValor(BigDecimal.ZERO, CONTADESTINO, CONTA);
        // Apenas para testar se esta executando a chamada do mock
    }

}
