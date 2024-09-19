import javax.swing.JOptionPane;

public class Solucao7 {
    public static void main(String[] args) {
        double perimetro = Double.parseDouble(JOptionPane.showInputDialog("Digite o perímetro do círculo:"));
        double raio = perimetro / (2 * Math.PI);
        double area = Math.PI * Math.pow(raio, 2);
        JOptionPane.showMessageDialog(null, "A área do círculo é: " + area);
    }
}