package program;

import java.util.Scanner;

public class Operations {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		CalculatorOperations cp = new CalculatorOperations();
		char operator;
		int count;
		System.out.println("Choose Operator :+,-,*,/");
		operator =s.next().charAt(0);
		System.out.println("Enter the count of numbers");
		count = s.nextInt();
		double[] arr = new double[count];
		//user to enter the number
		for(int i=0;i<count;i++) {
			System.out.println("Enter Number "+(i+1));
			arr[i]=s.nextDouble();
		}
		switch (operator) {
		case '+':
			if(count ==2) {
				cp.setP(arr[0]);
				cp.setQ(arr[1]);
				System.out.println("Result is "+cp.add(cp.getP(),cp.getQ()));

			}
			else if(count ==3) {
				cp.setP(arr[0]);
				cp.setQ(arr[1]);
				cp.setR(arr[2]);
				System.out.println("Result is "+cp.add(cp.getP(),cp.getQ(),cp.getR()));
			}
			break;
		case '-' :
			if(count ==2) {
				cp.setP(arr[0]);
				cp.setQ(arr[1]);
				System.out.println("Result is "+cp.sub(cp.getP(),cp.getQ()));

			}
			else if(count ==3) {
				cp.setP(arr[0]);
				cp.setQ(arr[1]);
				cp.setR(arr[2]);
				System.out.println("Result is "+cp.sub(cp.getP(),cp.getQ(),cp.getR()));
			}
			break;
		case '*' :
			if(count ==2) {
				cp.setP(arr[0]);
				cp.setQ(arr[1]);
				System.out.println("Result is "+cp.mul(cp.getP(),cp.getQ()));

			}
			else if(count ==3) {
				cp.setP(arr[0]);
				cp.setQ(arr[1]);
				cp.setR(arr[2]);
				System.out.println("Result is "+cp.mul(cp.getP(),cp.getQ(),cp.getR()));
			}
			break;
		case '/':
			if(count ==2) {
				cp.setP(arr[0]);
				cp.setQ(arr[1]);
				System.out.println("Result is "+cp.div(cp.getP(),cp.getQ()));
			}
			else if(count ==3) {
				cp.setP(arr[0]);
				cp.setQ(arr[1]);
				cp.setR(arr[2]);
				System.out.println("Result is "+cp.div(cp.getP(),cp.getQ(),cp.getR()));
			}
			break;
		}
	}
}
