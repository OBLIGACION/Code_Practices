//INTEG PROG ACTIVITY(TASK 4 )
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num = 0;
		System.out.print("Enter a number: ");
		num = in.nextInt();
		for(int i =1; i<=num; i++){
		    for(int j=num; j>=i; j--){
		        System.out.print(" ");
		    }
		    for(int k=1; k<=i; k++)
		    {
		        System.out.print(num + " ");
		    }
		    System.out.print("\n");
		}
	}
	}
