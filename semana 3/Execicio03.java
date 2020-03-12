import javax.swing.JOptionPane;
public class Execicio03{
	public static void main (String [] args){
		double numero = Double.parseDouble(JOptionPane.showInputDialog ("Digite o numero: "));

		double resultado = Math.pow(numero, 2);
		JOptionPane.showMessageDialog(null, "resultado: " + resultado); 

  }	

}
