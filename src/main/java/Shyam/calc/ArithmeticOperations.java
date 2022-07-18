package Shyam.calc;


class ArithmeticOperations implements Calculation {
 // static Scanner scanner=new Scanner(System.in);
   

	public int addition(int input1, int input2) {
		System.out.println("Addition of two Numbers:");
		int result=input1+input2;
		return result;	
		
	}


	public int  substraction(int input1, int input2) {
		System.out.println("substraction of two Numbers:");
		int result= input1-input2;
		return result;	
	}


	public int multiplication(int input1, int input2) {
		System.out.println("multiplication of two Numbers:");
		int result=input1*input2;
		return result;	
	}


	public double dividetion(int input1, int input2) {
		System.out.println("dividetion of two Numbers:");
		 double result= (input1/input2);
		return (double)result;	
	}
	public int modulations(int input1, int input2) {
	    System.out.println("Modulas of two no:");
	   int result=input1%input2;
		return result;
	}

}
