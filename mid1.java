import java.util.*;
class calMath{
    int i,j;
    double sum=0.0;
    double run(double a,double b){
        for(i=0;i<b;i++){
            sum+=(a*(i+1))/(b-i);
        }
        return sum;
    }
}

public class mid1{
    public static void main(String [] argv){
        double a,b,ans;
        calMath math=new calMath();
        Scanner input=new Scanner(System.in);
        System.out.println("請使用者輸入兩個數字(用空格隔開):");
        a=input.nextDouble();
        b=input.nextDouble();
        ans=math.run(a,b);
        System.out.println("計算結果是:"+ans);
    }
}