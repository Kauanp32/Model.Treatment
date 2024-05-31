package Model.Treatment;

// Declaração da classe DomainException que estende RuntimeException
public class DomainException extends RuntimeException {
    // Define um ID de serialização único para a classe
    private static final long serialVersionUID = 1L;

    // Construtor que aceita uma mensagem e a passa para o construtor da superclasse
    public DomainException(String msg) {
        super(msg);
    }
}