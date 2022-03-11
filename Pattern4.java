import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int n ,i , s, j;
		System.out.println("Enter the no. of Rows");
		n = sc.nextInt();
		for(i=1; i<=n; i++)
		{
			for(s=1; s<n-i; s++)
				System.out.print(" ");
			for(j=1;j<=2*j-1;j++)
				System.out.print("*");
		
			System.out.println();
		}	
	
		n=n-1;
		
		System.out.println("Enter the no. of Rows");
		n = sc.nextInt();
		for(i=1; i<=n; i++)
		{
			for(s=1; s<=i; s++)
				System.out.print(" ");
			for(j=1;j<=2*(n-1)+1; j++)
				System.out.print("*");
		
			System.out.println();
	
		}
	}
}
