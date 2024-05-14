public class StringVaziaException extends Exception {
    // Importante caso a exceção seja serializada
    private static final long serialVersionUID = 1149241039409861914L;

    // Constrói um objeto StringVaziaException com a mensagem passada por parâmetro
    public StringVaziaException(String msg) {
        super(msg);
    }

    // Constrói um objeto StringVaziaException com mensagem e a causa dessa exceção,
    // utilizado para encadear exceptions
    public StringVaziaException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
