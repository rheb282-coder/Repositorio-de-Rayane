package Ejercicios;

import java.util.Scanner;

/**
 * Traducción a Java del algoritmo par_impar realizado en pseudocódigo
 */
public class ParImpar {

	public static void main(String[] args) {
		System.out.println("Introduce un número para ver si es par o impar");
        Scanner sc= new Scanner(system.in);
        int numero = sc.nextInt();
        if (numero % 2 == 0) {
        	System.out.println("El número introducido es par");
        } else {
        	System.out.println("El número introducido es impar");
        }
	}

}
