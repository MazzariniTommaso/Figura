import java.util.Scanner;
import Figure.*;

public class UsaFigure 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner (System.in);
		int input;
		Figura f;
		do 
		{
			do 
			{
				System.out.println('\n' + "_MENU");
				System.out.println(" Per calcolare l'area o il perimetro della figura premere:");
				System.out.println(" 1) Rettangolo");
				System.out.println(" 2) Quadrato");
				System.out.println(" 3) Triangolo ");
				System.out.println(" 4) Triangolo rettangolo ");
				System.out.println(" 5) Cerchio ");
				System.out.println(" 0) ESCI ");
				input = in.nextInt();
				if (!verifica(input)) System.out.println("_[Carattere non consentito]");
			}while(!verifica(input));
			
			switch (input)
			{
			case 0:return;
			case 1:
				{
					System.out.println('\n' + " Inserire base e altezza del Rettangolo");
					f = new Rettangolo("Rettangolo",in.nextDouble() ,in.nextDouble());
					f.visualizza();
				};break;
			case 2:
				{
					System.out.println('\n' + " Inserire lato del Quadrato");
					f = new Quadrato("Quadrato",in.nextDouble());
					f.visualizza();
				};break; 
			case 3:
				{
					System.out.println('\n' + " Inserire la base e i due cateti del triangolo");
					f = new Triangolo("Triangolo",in.nextDouble(),in.nextDouble(),in.nextDouble());
					f.visualizza();
				};break;
			case 4:
				{
					System.out.println('\n' + " Inserire la base, l'altezza e l'ipotenusa del triangolo rettangolo ");
					f = new TriangoloRettangolo("TriangoloRettangolo",in.nextDouble(),in.nextDouble(),in.nextDouble());
					f.visualizza();
				};break;
			case 5:
				{
					System.out.println('\n' + " Inserire il raggio del Cerchio");
					f = new Cerchio("Cerchio",in.nextDouble());
					f.visualizza();
				};break;
			}
		}while(true);

	}
	
	public static boolean verifica(int i)
	{
		if (i == 0 || i == 1 || i == 2 || i == 3 || i == 4 || i == 5) return true;
		return false;
	}

}
