package fibonacci;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int menu = 3;
		long n = 0;
		Scanner input = new Scanner(System.in);
		while(menu != 0) {
			System.out.println("1. Fibonacci sequence with for cycle?");		
			System.out.println("2. Fibonacci sequence with recursion?");		
			System.out.println("0. Exit");
			System.out.println();
			System.out.print("What would it be?: ");
			menu = input.nextInt();
			System.out.println();
			if(menu == 1) {
				System.out.println("How many fibonacci numbers do you want me to show you?");
				n = input.nextInt();
				fibonacci(n);
				System.out.println();
			}else if(menu == 2) {
				System.out.println("How many fibonacci numbers do you want me to show you?");
				n = input.nextInt();
				for(long i = 0; i <= n; i++)
					System.out.println(fibonacciRecursion(i));
				System.out.println();
			}
		}
	}
	
	//Shows fibonacci numbers with recursion
	public static long fibonacciRecursion(long n) {
		if(n == 0) {
			return 0;
		}else if(n == 1) {
			return 1;
		}
		long f1 = 0, f2 = 0;
		f1 = fibonacciRecursion(n - 1);
		f2 = fibonacciRecursion(n - 2);
		long f = f1 + f2;
		return f;
	}
	
	// Shows fibonacci numbers with for cycle
	public static void fibonacci(long n) {
		long f1 = 0, f2 = 1, f = 0;
		for(long i = 0; i <= n; i++) {
			if(i == 0) {
				System.out.println(f1);
				continue;
			}else if(i == 1) {
				System.out.println(f2);
				continue;
			}
			f = f1 + f2;
			if(f < 0) {
				System.out.println("Limit reached");
				break;
			}
			f1 = f2;
			f2 = f;
			System.out.println(f);
		}
	}
}
