//INTEG PROG ACTIVITY(TASK 1)
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	System.out.print("Enter a number: ");
	int num = in.nextInt();
		      for(int m = 1;m<=num;m++){
		    for(int n = 1; n<=m; n++){
		        System.out.print(num);
		        if(n<m){
		        System.out.print("+"); 
		        }
		    }
		    System.out.println();
		    }
	}
}