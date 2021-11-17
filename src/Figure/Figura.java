package Figure;

public abstract class Figura 
{
	private String nome;
	
	public Figura (String nome)
	{
		this.nome = nome;
	}
	
	public abstract double Area();
    public abstract double Perimetro();
	
	public void visualizza()
	{
		System.out.println("___Nome: " + nome + '\n' +
						   "___Area " + Area() + '\n' +
						   "___Perimetro " + Perimetro() + '\n');
	}

}
