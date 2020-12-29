package entidade.exceptions;

public class DomainExceptions extends Exception {
    private static final long serialVersionUID = 1L;

    public DomainExceptions(String mensagem){
        super(mensagem);
    }
}
