import java.util.Scanner;
public class CalculatorThree {
public static void main(String[] args) {
	int a, b,c, ch;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a First Number");
	a = sc.nextInt();
		System.out.println("Enter a Second Number");
	b = sc.nextInt();
	    System.out.println("Enter a Third Number");
	c = sc.nextInt();
		System.out.println("1->Add,2->Subtract,3->Multiply,4->Divide");
	ch = sc.nextInt();
		if (ch == 1)
			System.out.println("Addition of Two num is:" + (a + b +c));
		else if (ch == 2)
			System.out.println("Subtraction of Two num is:" + (a - b - c));
		else if (ch == 3)
			System.out.println("Multiplication of Two num is:" + (a * b * c));
		else if (ch==4)
			System.out.println("Division of Two num is:" + (a / b / c));
		else
			System.out.println("It is Invalid number");
		}

}