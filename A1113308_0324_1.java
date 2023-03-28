
import java.util.*;
class animal{
    String name;
    double height;
    int weight,speed;
    void show(){
        System.out.printf("姓名:%s\n身高:%.1f\n體重:%d\n速度:%d\n",name,height,weight,speed);
    }
    double distance(int x,double y){
        return x*y*speed;
    }  
    double distance(int x){
        return x*speed;
    }    
}

public class A1113308_0324_1{
    public static void main(String[]argv){
        int i,x;
        double y=0;
        Scanner input=new Scanner(System.in);
        animal[] animals=new animal[4];
        for(i=0;i<4;i++){
            animals[i]= new animal();
        }
        animals[0].name="雪寶";
        animals[0].height=1.1;
        animals[0].weight=52;
        animals[0].speed=100;

        animals[1].name="驢子";
        animals[1].weight=99;
        animals[1].height=1.5;
        animals[1].speed=200;

        animals[2].name="安那";
        animals[2].height=1.7;
        animals[2].weight=48;
        animals[2].speed=120;

        animals[3].name="愛沙";
        animals[3].height=1.7;
        animals[3].weight=50;
        animals[3].speed=120;
        
        for(i=0;i<4;i++){
            animals[i].show();
        }
        System.out.println("請輸入時間(分鐘)和加速度或只輸入時間(分鐘)和加速度輸入0:");
        for(i=0;i<4;i++){
            x=input.nextInt();
            y=input.nextDouble();
            if(y==0){
                System.out.printf("%s奔跑距離:%.2f\n",animals[i].name,animals[i].distance(x));
            }else{
                System.out.printf("%s奔跑距離:%.2f\n",animals[i].name,animals[i].distance(x,y));
            }
            
        }
    }
}