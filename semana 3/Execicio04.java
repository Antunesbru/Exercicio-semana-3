import javax.swing.JOptionPane;
public class Execicio04{
	public static void main(String [] args){
		String S1 = JOptionPane.showInputDialog ("Digite a primeira: ");
		String S2 = JOptionPane.showInputDialog("Digite a segunda: ");
		String S3 = JOptionPane.showInputDialog("Digite a terceira: ");

		int soma = S1.length() + S2.length() + S3.length();
		JOptionPane.showMessageDialog(null, "Resultado : " + soma);	



  }

}

