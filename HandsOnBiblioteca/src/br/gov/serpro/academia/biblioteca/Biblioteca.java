package br.gov.serpro.academia.biblioteca;

import java.util.ArrayList;
import java.util.Collection;

public class Biblioteca {

	private Collection<Usuario> usuariosRegistrados;
	private Collection<Livro> livrosRegistrados;
	
	public Biblioteca() {
		this.usuariosRegistrados = new ArrayList<>();
		this.livrosRegistrados = new ArrayList<>();
		
	}
	
	public void registraUsuario(Usuario usuario) {
		usuariosRegistrados.add(usuario);
		
	}
	
	public void adcionaLivroAoCatalogo(Livro livro) {
		livrosRegistrados.add(livro);
		
	}	
	
	public int quantidadeDeUsuariosRegistrados () {
		return usuariosRegistrados.size();
	}
	
	public int quantidadeDeLivrosRegistrados () {
		return livrosRegistrados.size();
	}
	
	public void emprestaLivro(Livro livro, Usuario usuario) {
		
		 
	}
	
    public void devolveLivro() {
		
	}
    
    public void exibeLivrosDisponiveisEmprestimo () {
    	
    }
    
    public void exibeLivrosIndisponiveisEmprestimo () {
    	
    }
    
    
	
	
	
	
	
	
}
