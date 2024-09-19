import javax.swing.JOptionPane;

public class Solucao9 {
    public static void main(String[] args) {
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));
        int anoAtual = 2023; // Substitua pelo ano atual
        int anoVirada = 2100;
        int idadeNoSeculo = (anoVirada - anoAtual) + idade;
        JOptionPane.showMessageDialog(null, "Sua idade na virada do próximo século será: " + idadeNoSeculo);
    }
}