import javax.swing.JOptionPane;
public class ex3{
public static void main(String[] args) {
 float v1 = Float.parseFloat(JOptionPane.showInputDialog("Qual seu salario atual"));
 double v2 = v1*1.25;
 JOptionPane.showMessageDialog(null,"O resultado: "+v2);
}
}

