package de_21_a_30;

public class Ex29 {

	public static void main(String[] args) {
		int i = 1;
		int j = 7;
		
		for(int k = 0; k < 6; k++) {
			if(k == 3) {
				i = 3;
				j = 7;
			}
			
			System.out.println("I = " + i + " J = " + j);
			j--;
		}
	}

}
