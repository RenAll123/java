import java.util.Scanner;

public class homeworkA111330802{
    public static void main(String [] argv){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter degrees Celsius:");
        float c=input.nextFloat();
        float f=0;
	f=c*(9/5)+32;
	System.out.printf("degrees Fahrenheit is %.2f.",f);
    }
}