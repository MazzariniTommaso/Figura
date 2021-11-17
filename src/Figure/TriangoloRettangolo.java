package Figure;

public class TriangoloRettangolo extends Figura
{
	double b, h, c;
	public 	TriangoloRettangolo(String nome, double b, double h, double c) {
		super(nome);
		this.b = b;
		this.h = h;
		this.c = c;
	}
	public double Perimetro() 
	{
		return this.b + this.h + this.c;
	}
	
	public double Area() 
	{
		return (this.b * h)/2;
	}
}
