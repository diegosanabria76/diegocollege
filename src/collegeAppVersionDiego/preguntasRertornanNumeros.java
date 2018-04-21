package collegeAppVersionDiego;

import java.util.Scanner;

public class preguntasRertornanNumeros {
	Scanner input = new Scanner(System.in);
	
	public double numeroToiquetesAcomprar()
	{
		
		double totalEntradas=0;
		try{
			System.out.println("Cuantyas entradas quieres comprar");
		
			totalEntradas = input.nextDouble();
			
		}catch (Exception e) {
			System.out.println("tipo de dato invalido, ");
			e.printStackTrace();
		}
		
			return totalEntradas*10;
		
	}
	
	public double camisetas(){
		double precioCamiseta = 3;
		System.out.println("Cuantas camisetas quieres comprar?");
	double 	cantidadCamisetas = input.nextDouble();
	double totalCamisetas = cantidadCamisetas * precioCamiseta;
	
	return totalCamisetas;
		
		
		}
	
	public double total(){
		
		double total = numeroToiquetesAcomprar()+camisetas();
		
		return total;
		
	}

}
