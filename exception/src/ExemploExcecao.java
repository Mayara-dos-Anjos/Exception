public class ExemploExcecao {
    public static void main(String[] args) {
        String str = null;

        try {
            @SuppressWarnings("null")
            int length = str.length(); // Isso lança NullPointerException
            System.out.println("Tamanho da string: " + length);
        } catch (NullPointerException e) {
            System.out.println("Erro: Tentativa de acessar um objeto nulo.");
        }
    }
}
