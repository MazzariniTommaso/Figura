package Figure;

public class Triangolo extends Figura
{
	private double c1, c2, b;
	public 	Triangolo(String nome, double b, double c1, double c2) 
	{
		super(nome);
		this.c1 = c1;
		this.c2 = c2;
		this.b = b;
	}

	public double Perimetro() 
	{
		return this.c1 + this.c2 + this.b;
	}	
	public double TrovaAltezza (double c1 ,double c2 ,double b)
	{
		return Math.sqrt(Math.pow(c2, 2)-Math.pow((Math.pow(c2, 2)- Math.pow(c1, 2)+Math.pow(b, 2))/(2*b),2));
	}
	
	public double Area() 
	{
		return (this.b * TrovaAltezza (c1 ,c2 ,b))/2;
	}

}
