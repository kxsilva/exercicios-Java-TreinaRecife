package de_01_a_10;

import java.util.Locale;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("- "); 
		double n1 = sc.nextDouble();
		System.out.print("- ");
		double n2 = sc.nextDouble();
		
		System.out.println("MEDIA = " + (n1*3.5 + n2*7.5)/11);
	}
}
