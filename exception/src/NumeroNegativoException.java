import javax.swing.JOptionPane;

public class NumeroNegativoException extends Exception {
    public NumeroNegativoException(String msg) {
        super(msg);
    }

    public static void main(String[] args) {
        try {
            int x = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
            int y = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
            sumAndPrint(x, y);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, insira números válidos.");
        } catch (NumeroNegativoException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }
    

    static void sumAndPrint(int x, int y) throws NumeroNegativoException {
        if (x < 0 || y < 0) {
            throw new NumeroNegativoException("Números negativos não são permitidos.");
        }
        System.out.println("Soma: " + (x + y));
    }
}