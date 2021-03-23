import javax.swing.JOptionPane;

public class Exercício5 {
	public static void main(String[] args) {
	int n, x, z;
	n = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de testes a serem feitos"));
	    if(n>=1 && n<=1000) 
	    {
		    for(int i=0; i<n; i++)
	    	{
			z=0;
			x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
			for(int o=2; o<x; o++)
			{
				if(x%o==0)
				{
					z = z + 1;
				}
			}
			if(z==0) 
			{
				JOptionPane.showMessageDialog(null, x + " é primo");
			}
			else
			{
				JOptionPane.showMessageDialog(null, x + " não é primo");
			}
	    	}
	    }
    }
}
