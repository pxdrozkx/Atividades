import javax.swing.JOptionPane;

public class Solucao11 {
    public static void main(String[] args) {
        double salarioFixo = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário fixo:"));
        double vendas = Double.parseDouble(JOptionPane.showInputDialog("Digite o total vendido:"));
        double comissao = vendas * 0.04;
        double salarioFinal = salarioFixo + comissao;
        JOptionPane.showMessageDialog(null, "Comissão: " + comissao + "\nSalário final: " + salarioFinal);
    }
}