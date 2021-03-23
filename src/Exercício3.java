import javax.swing.JOptionPane;

public class Exercício3 {
	public static void main(String[] args) {
		int x;
		String QuadCub="";
		x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		if ( x>1 && x<1000)
		{
			for(int i=0; i<=x; i++)
			{
				QuadCub = (QuadCub + "\n" + i +" "+ i*i + " " + i*i*i);
			}
			JOptionPane.showMessageDialog(null, QuadCub);
		}
	}
}
