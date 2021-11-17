package Figure;

public class Cerchio extends Figura
{
	double raggio;
	public Cerchio(String nome, double raggio)
	{
		super (nome);
		this.raggio = raggio;
	}
	
	public double Area()
	{
		return Math.PI * Math.pow(raggio, 2) ;
	}
	public double Perimetro()
	{
		return Math.PI * 2 * raggio;
	}

}
