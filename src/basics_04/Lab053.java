package src.basics_04;

import java.util.Scanner;

public class Lab053 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Score: ");
		int score = sc.nextInt();
		
		if(score >= 90 && score <= 100) {
			System.out.println("A");
		}
		if(score >= 80 && score <= 89) {
			System.out.println("B");
		}
		if(score >= 70 && score <= 79) {
			System.out.println("C");
		}
		if(score >= 60 && score <= 69) {
			System.out.println("D");
		}
		if(score >= 0 && score <= 59) {
			System.out.println("F");
		}
		sc.close();
	}

}
