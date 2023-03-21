import java.util.*;
public class A1113308_0317_1{
    public static void main(String [] argv) {
        Scanner input=new Scanner(System.in);
        int n,m,i,j;
        System.out.println("請輸入n和m的值:");
        n=input.nextInt();
        m=input.nextInt();
        int[][] secondArray=new int[n][m];
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                secondArray[i][j]=(i+1)*(j+1);
            }
        }
        for(int[] a:secondArray){
            for(int b:a){
                System.out.print(b+" ");
            }
            System.out.println();
        }
    }
}