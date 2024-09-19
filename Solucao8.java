import javax.swing.JOptionPane;

public class Solucao8 {
    public static void main(String[] args) {
        double distancia = Double.parseDouble(JOptionPane.showInputDialog("Digite a distância percorrida (em km):"));
        double litrosPorKm = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de litros gastos por km:"));
        double totalLitros = distancia * litrosPorKm;
        JOptionPane.showMessageDialog(null, "Total de litros gastos: " + totalLitros);
    }
}