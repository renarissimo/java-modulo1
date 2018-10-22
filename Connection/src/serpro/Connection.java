package serpro;

public interface Connection {
    void rollback();
    void commit();
    void connect();
}
