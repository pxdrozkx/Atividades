import javax.swing.JOptionPane;

public class Solucao12 {
    public static void main(String[] args) {
        int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento:"));
        int anoAtual = 2024; // Substitua pelo ano atual
        int idade = anoAtual - anoNascimento;
        JOptionPane.showMessageDialog(null, "A idade da pessoa é: " + idade + " anos.");
    }
}