package calculadora;  

import java.util.Scanner;  

	/** @author Jan */
	/** @version 1.0 */
	
public class SumaNumeros {  
	
	/** Este programa te pide dos numeros y genera la suma de ellos */
	
	/** Cambio realizado desde rama feature-suma */
	
	/** Comentario después de realizar fusión  entre ramas */
	
	public static void main(String[] args) {  
		
	/** Instanciamos un scanner */
		Scanner scanner = new Scanner(System.in);  
	
	/** Pedimos el primer numero */
		System.out.print("Ingresa el primer número: ");  
		int numero1 = scanner.nextInt();  
		
	/** Pedimos el segundo numero */
		System.out.print("Ingresa el segundo número: ");  
		int numero2 = scanner.nextInt();  
		
	/** Damos valor a suma */
		int suma = numero1 + numero2;  
	
	/** Imprimimos el resultado de la suma */
		System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);  
	}  
}  