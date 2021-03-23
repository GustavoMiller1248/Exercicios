import javax.swing.JOptionPane;

public class Exercício1 {
	public static void main(String[] args) {
	int x, y, z;
	int Imp=0;
	x = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
	y = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));
	
	if(x>y)
	{
		z=x; x=y; y=z;
	}
	
	for ( int i=x+1; i<y; i++) 
	{
		if(i%2==1 || i%2==-1)
		{
			Imp=Imp+i;
		}
	}

	JOptionPane.showMessageDialog(null, "A soma dos ímpares entre os dois números é: " +Imp);
	}
}
