import java.util.Scanner;
public class Pattern {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i,j,n;
		System.out.println("Enter the no of Rows");
		n=sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			System.out.print("*");	
			System.out.println("");
		}
		
	}

}
