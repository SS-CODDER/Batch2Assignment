package Shyam.calc;

import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		ArithmeticOperations sc=new ArithmeticOperations();
		
		 Scanner scanner =new Scanner(System.in);
		  int input1=scanner.nextInt();
		  int input2=scanner.nextInt();
		  
			while (true) {
				System.out.println("Press 1 for addition");
				System.out.println("Press 2 for substraction");
				System.out.println("Press 3 for multiplication");
				System.out.println("Press 4 for divide");
				System.out.println("Press 5 for modeOperation");
				System.out.println("Press 6 for %");
				int n = scanner.nextInt();
				switch (n) {

				case 1:
				//	obj.input();
					
					System.out.println(sc.addition(input1, input2));
				//	sc.addition(input1, input2);
					break;

				case 2:
				//	obj.input();
					System.out.println(sc.substraction(input1, input2));
					break;

				case 3:
				//	obj.input();
					System.out.println(sc.multiplication(input1, input2));
					break;

				case 4:
				//	obj.input();
					System.out.println(sc.dividetion(input1, input2) );
					break;

				case 5:
				//	obj.input();
					System.out.println(sc.modulations(input1, input2));
					break;

				case 6:

				//	obj.input();
					System.out.println("%:" );
					break;
				}

			}
			  
			  

	}

}
