import java.util.Scanner;

public class homeworkA111330801{
    public static void main(String [] argv){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter integer:");
        int a=input.nextInt();
        if(a%2==0){
            System.out.printf("%d is even number.",a);
	}else{
	    System.out.printf("%d is odd number.",a);
	}
    }
}