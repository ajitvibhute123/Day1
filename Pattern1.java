import java.util.Scanner;
public class Pattern1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n ,i , s, j;
		System.out.println("Enter the no. of Rows");
		n = sc.nextInt();
		for(i=1; i<=n; i++)
		{
			for(s=1; s<=n-i; s++)
				System.out.print(" ");
			for(j=1;j<=i;j++)
				System.out.print("*");
		
			System.out.println();
		}

	}

}
