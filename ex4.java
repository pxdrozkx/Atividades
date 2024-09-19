import javax.swing.JOptionPane;
  public class ex4{
  public static void main(String[] args) {
float v1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Qual seu salario atual"));
double v2 = v1*0.05;
double v3 = v1*0.07;
double v4 = v1+v2-v3;
JOptionPane.showMessageDialog(null,"Seu salario final: " +v4);
JOptionPane.showMessageDialog(null,"seu imposto foi de: " +v3);
JOptionPane.showMessageDialog(null,"sua bonificação é de: " +v2);
}
}
