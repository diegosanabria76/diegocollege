package collegeAppVersionDiego;

import java.util.Scanner;

public class PreguntasVerdadFalso {
	Scanner input = new Scanner(System.in);
	public boolean equipoFavorito(String nombre)
	
	{	
		boolean respuestaInvalida = false;
		String response = "Millos";
		System.out.println("Cual es tu equipo favorito");
		String userAnswer = input.nextLine();
		if(userAnswer.equalsIgnoreCase(response))
				{
					return true;
			
				}else if(userAnswer.equalsIgnoreCase("nacional"))
				{
					System.out.println("Que mierda de equipo el que te gusta, largate de aqui");
					
				}
				else{
					System.out.println("Has intoducido una respuesta invalida. debes poner Millos");
					}while(respuestaInvalida);
					return false;
	
		
		
		
	}
	
	
	
	
}
