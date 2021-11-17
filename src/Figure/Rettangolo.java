package Figure;

public class Rettangolo  extends Figura
{
	double a, b;
	public Rettangolo(String nome,double b, double a )
	{
		super (nome);
		this.b = b;
		this.a = a;
	}
	
	public double Area()
	{
		return a * b;
	}
	public double Perimetro()
	{
		return (a*2) + (b*2);
	}

	

}
