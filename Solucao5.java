import javax.swing.JOptionPane;

public class Solucao5 {
   public static void main(String[] args) {
      double base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do retângulo:"));
      double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do retângulo:"));
      double area = base * altura;
      JOptionPane.showMessageDialog(null, "A área do retângulo é: " + area);
   }
}