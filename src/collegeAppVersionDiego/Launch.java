package collegeAppVersionDiego;

import java.util.Scanner;

public class Launch {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		PreguntasVerdadFalso 	p1 = new PreguntasVerdadFalso();
		preguntasRertornanNumeros pn = new preguntasRertornanNumeros();
		String nombre;
		System.out.println("Cuals es tu nombre");
		nombre = input.nextLine();
		double total;
		if(p1.equipoFavorito(nombre))
		{
		System.out.println("El total de tu compra es de : " + pn.total());	
		
			
			
		}else
		{
			System.out.println("Lo sentimos pero si no eres de illos no puedes comprar aqui");
		}
	
	

	}

}
