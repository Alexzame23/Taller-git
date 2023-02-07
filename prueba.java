package Pack1;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Prueba1 {
	
	int valor1;
	int valor2;
	int suma;
	int resta;
	int multiplicacion;
	int division;
	
	private Scanner scanner;
	
	public void leerNumeros() {
		
		scanner = new Scanner(System.in);
		
		valor1 = Integer.parseInt(JOptionPane.showInputDialog("Escriba un numero: "));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog("Escriba un numero: "));
		
	}
	
	public void suma() {
		suma = valor1+valor2;
	}
	
	public void resta() {
		resta = valor1-valor2;
	}
	
	public void multiplicar() {
		multiplicacion = valor1*valor2;
	}
	
	public void dividir() {
		division = valor1/valor2;
	}
	
	public void mostrar() {
		System.out.println("\n El valor de la suma es: " +suma);
		System.out.println("\n El valor de la resta es: " +resta);
		System.out.println("\n El valor de la multiplicacion es: " +multiplicacion);
		System.out.println("\n El valor de la division es: " +division);
	}
	
}
