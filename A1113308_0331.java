package A1113308_0331;
import java.util.*;
public class A1113308_0331 {
    public static void main(String []argv){
        animal.showinfo();
        int i,x;
        double y=0;
        Scanner input=new Scanner(System.in);
        animal[] animals=new animal[2];
        animals[0]=new animal("雪寶", 1.1, 52, 100);
        animals[1]=new animal("驢子", 1.5, 99, 200);
        animals[0].show();
        animals[1].show();
        human[] people= new human[3];
        people[0]=new human("阿克",1.9,80,150,"男");
        people[1]=new human("漢斯",1.8,78,130,"男");
        people[2]=new human("安那",1.7,48,120,"女");
        people[0].show();
        people[1].show();
        people[2].show();
        snow[] queen=new snow[1];
        queen[0]=new snow("愛沙",1.7,50,120,"女","Yes");
        queen[0].show();
        System.out.println("請輸入時間(分鐘)和加速度(輸入0則為默認不輸入):");
        for(i=0;i<6;i++){
            x=input.nextInt();
            y=input.nextDouble();
            if(i>4){
                if(y==0){
                    System.out.printf("%s奔跑距離:%.2f\n",queen[i-5].name,queen[i-5].distance(x));
                }else{
                    System.out.printf("%s奔跑距離:%.2f\n",queen[i-5].name,queen[i-5].distance(x,y));
                }
            }else if(i>1){
                if(y==0){
                    System.out.printf("%s奔跑距離:%.2f\n",people[i-2].name,people[i-2].distance(x));
                }else{
                    System.out.printf("%s奔跑距離:%.2f\n",people[i-2].name,people[i-2].distance(x,y));
                }
            }else{
                if(y==0){
                    System.out.printf("%s奔跑距離:%.2f\n",animals[i].name,animals[i].distance(x));
                }else{
                    System.out.printf("%s奔跑距離:%.2f\n",animals[i].name,animals[i].distance(x,y));
                }
            }
        }
    }
}
