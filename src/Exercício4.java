import javax.swing.JOptionPane;

public class Exercício4 {
	public static void main(String[] args) {
		int Comb=0, Alc=0, Gas=0, Di=0;
		while(Comb!=4)
		{
			Comb = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do combustivel \n 1.Álcool \n 2.Gasolina \n 3.Diesel \n 4.Fim"));
			while(Comb<1 || Comb>4)
			{
				Comb = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do combustivel \n 1.Álcool \n 2.Gasolina \n 3.Diesel \n 4.Fim"));
			}		
			if(Comb==1)
			{
				Alc = Alc + 1;
			}
			if(Comb==2)
			{
				Gas = Gas + 1;
			}
			if(Comb==3)
			{
				Di = Di + 1;
			}	
		}
		JOptionPane.showMessageDialog(null, "Obrigado!" + "\nAlcool: " + Alc + "\nGasolina: " + Gas + "\nDiesel: " + Di);
	}
}
