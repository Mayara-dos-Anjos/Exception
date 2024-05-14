import java.io.*;

public class ValidadorDeEndereco {

    public static void main(String[] args) {
        String caminho = "caminho/para/seu/arquivo.txt";
        boolean enderecoValido = isNewAddressValid(caminho, "SP");
        System.out.println("O endereço é válido? " + enderecoValido);
    }

    public static boolean isNewAddressValid(String PATH, String state) {
        File arquivo = new File(PATH);
        if (!arquivo.exists()) {
            return false;
        }

        try (BufferedReader leitor = new BufferedReader(new FileReader(arquivo))) {
            // Seu código para processar o arquivo vai aqui
            // Por exemplo, verificar se o estado está no arquivo
            String linha;
            while ((linha = leitor.readLine()) != null) {
                if (linha.contains(state)) {
                    return true;
                }
            }
            return false; // Estado não encontrado no arquivo
        } catch (IOException | IllegalArgumentException excecao) {
            // Aqui você pode tratar as exceções, se necessário
            return false; // Retorna falso se ocorrer uma exceção
        }
    }
}
