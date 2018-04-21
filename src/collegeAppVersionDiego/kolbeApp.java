 package collegeAppVersionDiego;

import java.util.Scanner;

public class kolbeApp {
public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		String nombre = obtenerNombre();
		imprimirTotal(nombre);
		

	}
	
	public static String  obtenerNombre()
	{
		System.out.println("Cuals es tu nombre : ");
		String name = input.nextLine();
		return name;
	}
	public static void imprimirTotal(String nombre)
	{
		double total =0;
		if(preguntarEdad(nombre))
		{
			total = calcularTotal(costoViviendaCota(),  libros(),  Restaurante(),  costoLudicas());
		}
		else
		{
			total =calcularTotal(libros(),  Restaurante(),  costoLudicas());
		}
		
		String year = obtenerAno();
		if(year.equalsIgnoreCase("other"))
			System.out.printf("The total cost for " +nombre+ "is $%7.2f", total);
		else
			System.out.printf("The total cost for "+nombre+ " as a "+year+
					" is $%7.2f", total);
		System.out.println();
			
		
		
		
	}
	
	
	public static String obtenerAno()
	{	
	
		System.out.println("Aque nivel, se va a matricular el estudiante: ( Prescolar, Primaria,"
				+"Media Academica,Bachillerato, Otro )");
		String ano = input.nextLine();
		return ano;
		}
	
	
	public static boolean preguntarEdad(String nombre)
	{
		boolean respuestaInvalida = true;
		do {
			System.out.println("Cual es tu edad : ");
			int edad = input.nextInt();
			if(edad<3 || edad>20)
			{
				System.out.println("Lo sentimos pero no estas dentro de nuestro rango de edad");
				System.out.println("Los estudiantes del Maximiliano Kolbe, estan entre los 3 y los 19 anos de edad.");
			}
			else if(edad>3 || edad<20)
			{
			
			return false;
			}
		} while (respuestaInvalida);
		return false;
		
	}
	public static double costoViviendaCota()
	{
		double total = 0;
		try {
			System.out.println("Cuantos mese de arriendo va a tomar el estudiante");
			String value = input.nextLine();
			int meses = Integer.parseInt(value);
			System.out.println("cual es el valor mesual estimado de gastos");
			value = input.nextLine();
			double gastosMensuales = Double.parseDouble(value);
			System.out.println("cual es el gasto de otros cobros por el ano escolar");
			value=input.nextLine();
			double cuartoTabla = Double.parseDouble(value);
			total = meses * gastosMensuales + cuartoTabla;
			
		} catch (Exception e) {
			System.out.println("has entrado un valor no valido");
			e.printStackTrace();
		}
		finally
		{
			return total;
		}
		
		
	}
	public static double libros()
	{
		System.out.println("Cual es el costo por libro que Dennis Barrera te dio ?");
		double unidad = input.nextDouble();
		System.out.println("Cuantos libros vas a comprar ?");
		double cantidadLibros = input.nextDouble();
		
		double total =  unidad * cantidadLibros;
		
		return total;
		
		
	}
	public static double Restaurante()
	{
		double restaurante = 100;
		System.out.println("Cuantos meses de almuerzo quieres tomar ?");
		double estudianteEleccion = input.nextDouble();
		return restaurante * estudianteEleccion;
		
		
	}
	public static int costoLudicas()
	{
		System.out.println("escoja una de las ludicas : ");
		System.out.println("1) Karate");
		System.out.println("2) Futbol");
		System.out.println("3) Culinaria");
		System.out.println("4) Programacion");
		System.out.println("5) MMA");
		
		int eleccion= 0;
		System.out.println("Please enter an option from the above menu");
		eleccion = input.nextInt();
		
		switch (eleccion) {
		case 1:
			System.out.println("Escogiste karate y te vale $10 cada mes");
			return eleccion=10;
			
			
		case 2:
			System.out.println("Escogiste futbol y te vale $20 cada mes");
			return eleccion = 20;
			
			
		case 3:
			System.out.println("Escogiste culinaria y te vale $15 cada mes");
			return 15;
			
		
		case 4:
			System.out.println("Escogiste programacion y te vale $12 cada mes");
			return 12;
			
	
		case 5:
			System.out.println("Escogiste MMA y te vale $8 cada mes, y pilas con las lesiones jejejejeje");
			return 8;
			
		

		default:
			return 0;
			
		}
		
		
		
		
		
		
	}public static double calcularTotal(double costoViviendaCota, double libros, double Restaurante, double costoLudicas)
	{
		return  costoViviendaCota + libros + Restaurante + costoLudicas;
		
	}
	public static double calcularTotal(double libros,double  Restaurante, double costoLudicas)
	{
		return   libros + Restaurante + costoLudicas;
		
	}

}
