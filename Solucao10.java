import javax.swing.JOptionPane;

public class Solucao10 {
    public static void main(String[] args) {
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota:"));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota:"));
        double mediaPonderada = (nota1 * 2 + nota2 * 3) / 5;
        JOptionPane.showMessageDialog(null, "A média ponderada é: " + mediaPonderada);
    }
}