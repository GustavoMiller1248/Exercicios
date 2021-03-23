import javax.swing.JOptionPane;

public class Exercício2 {

	public static void main(String[] args) {
		int x, y, z, Soma=0;
		String Seq="";
		x = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
		y = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));
		if(x<=0 || y<=0)
		{
			System.out.println("");
		}
		else
		{
			if(x<y)
			{
				z=x; x=y; y=z;
			}
			for(int i=y; i<=x; i++)
			{
				Seq = (Seq +" "+i);
				Soma = Soma + i;
			}
			JOptionPane.showMessageDialog(null, Seq + " Sum=" + Soma);
		}
	}

}
