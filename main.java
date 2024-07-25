import java.util.Scanner;
public class main{
	public static void greet(){
		System.out.print("Enter Your Name :: ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("Welcome " + name);
	}
	public static int option(){
		System.out.println("1.Math Calcualator");
		System.out.println("2.Age Calculator");
		System.out.println("3.College List");
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Choose a option :: ");
		int user_option = sc.nextInt();
		return user_option;
	}	
	public static void calculator(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to maths calculator");
		System.out.print("Enter the first number :: ");
		int num1 = sc.nextInt();
		System.out.print("Enter the second number :: ");
		int num2 = sc.nextInt();
		System.out.println("The sum of two number is :: "+(num1+num2));
	}
	public static void agecalculator(){
		System.out.println("Welcome to age calculator");
		System.out.println("Work in progress will meet soon");
	}
	public static void main(String args[]){
		greet();
		int a = option();
		if (a == 1){
			calculator();
		}else if(a == 2){
			agecalculator();
		}else{
			System.out.println("Enter a valid option ");
		}
	}
}
