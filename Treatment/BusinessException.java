package Model.Treatment;

// Declaração da classe BusinessException que estende RuntimeException
public class BusinessException extends RuntimeException {
    
	// Define um número de série para a classe
    private static final long serialVersionUID = 1L;

    // Construtor que aceita uma mensagem e a passa para o construtor da superclasse
    public BusinessException(String msg) {
        super(msg);
    }
}