import javax.swing.JOptionPane;

public class Solucao {
    public static void main(String[] args) {
        double base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do triângulo:"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do triângulo:"));
        double area = (base * altura) / 2;
        JOptionPane.showMessageDialog(null, "A área do triângulo é: " + area);
    }
}