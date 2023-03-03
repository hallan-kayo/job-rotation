package quesiton2com.jobrotation.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int num1 = 0, num2 = 1, aux, number;
		
		System.out.println("Informe o número que quer buscar:");
		number = input.nextInt();
		while(num2 <= number) {
			System.out.println(num1);
			aux = num1;
			num1 += num2;
			num2 = aux;
			if(num2 == number) {
				System.out.println("O número pertence à sequência");
				return;
			}
		}
		System.out.println("O número não pertence à sequência");
	}

}
