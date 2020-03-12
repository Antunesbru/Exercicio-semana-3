import javax.swing.JOptionPane;
public class Execicio02{
	public static void main (String [] args){
		double base = Double.parseDouble(JOptionPane.showInputDialog ("Digite a Base: "));
		double altura = Double.parseDouble(JOptionPane.showInputDialog ("Digite a Altura: "));
       
		double area = base * altura;
		JOptionPane.showMessageDialog (null, "Resultado " + base * altura);



  }

}
