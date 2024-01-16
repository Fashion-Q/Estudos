import javax.swing.JOptionPane;

public class Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String leitura = JOptionPane.showInputDialog("Digite seu peso: ");
		
		float peso = Float.parseFloat(leitura);
		
		leitura = JOptionPane.showInputDialog("Digite sua altura: ");
		
		float altura = Float.parseFloat(leitura);
		
		JOptionPane.showMessageDialog(null,"Seu IMC é: \n"+ (peso/(altura*altura)));

	}

}
