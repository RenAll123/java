import java.util.*;

class human{
    static void showWelcome(){
        System.out.println("***歡迎使用復仇者聯盟CP計算器***");
    }
    String Name;
    Boolean Gender;
    int Age;
    Boolean Avengers;
    human(String Name, Boolean Gender,int Age,Boolean Avengers){
        this.Name=Name;
        this.Gender=Gender;
        this.Age=Age;
        this.Avengers=Avengers;
    }
    void doshowinfo(){
        System.out.println("Name:"+Name);
        if(Gender){
            System.out.println("Gender:Male");
        }else{
            System.out.println("Gender:Female");
        }
        System.out.println("Age:"+Age);
        if(Avengers){
            System.out.println("Avengers:Yes");
        }else{
            System.out.println("Avengers:No");
        }
        System.out.println();
    }
}

class Avenger extends human{
    double Speed;
    Avenger(String Name, Boolean Gender, int Age,double Speed, Boolean Avengers) {
        super(Name, Gender, Age, Avengers);
        this.Speed=Speed;
    }
    void doshowinfo(){
        System.out.println("Name:"+Name);
        if(Gender){
            System.out.println("Gender:Male");
        }else{
            System.out.println("Gender:Female");
        }
        System.out.println("Age:"+Age);
        System.out.println("Speed:"+Speed);
        if(Avengers){
            System.out.println("Avengers:Yes");
        }else{
            System.out.println("Avengers:No");
        }
        System.out.println();
    }
    double goCP(){
        if(Gender){
            return (Speed*2)/Age;
        }else{
            return Speed/Age;
        }
    }
}

class NoAvenger extends human{
    NoAvenger(String Name, Boolean Gender, int Age, Boolean Avengers) {
        super(Name, Gender, Age, Avengers);
    }
    void noCP(double x){
        System.out.printf("%s的CP值:%.2f%n",Name,x/Age);
    }
    void noCP(double x,double y){
        System.out.printf("%s的CP值:%.2f%n",Name,x*y/Age);
    }
}

class SpecialAvenger extends Avenger{
    double Power;
    SpecialAvenger(String Name, Boolean Gender, int Age, double Power,double Speed, Boolean Avengers) {
        super(Name, Gender, Age, Speed, Avengers);
        this.Power=Power;
    }
    void doshowinfo(){
        System.out.println("Name:"+Name);
        if(Gender){
            System.out.println("Gender:Male");
        }else{
            System.out.println("Gender:Female");
        }
        System.out.println("Age:"+Age);
        System.out.println("Power:"+Power);
        System.out.println("Speed:"+Speed);
        if(Avengers){
            System.out.println("Avengers:Yes");
        }else{
            System.out.println("Avengers:No");
        }
        System.out.println();
    }
    double goCP(){
        if(Gender){
            return (Speed*2)/Age+Speed;
        }else{
            return Speed/Age+Speed;
        }
    }
}

public class mid2 {
    public static void main(String [] argv){
        human.showWelcome();
        Scanner input=new Scanner(System.in);
        int i;
        double x,y;
        NoAvenger people=new NoAvenger("Loki",true, 180, false);
        Avenger[] Avengers=new Avenger[2];
        Avengers[0]=new Avenger("Black Widow", false, 35, 17.2,true);
        Avengers[1]=new Avenger("Iron Man", true, 50,23.1,true);
        SpecialAvenger[] SpecialAvengers=new SpecialAvenger[3];
        SpecialAvengers[0]=new SpecialAvenger("Spider man", true, 18, 5.1, 22.7, true);
        SpecialAvengers[1]=new SpecialAvenger("Thor", true, 200, 9.5, 24.5, true);
        SpecialAvengers[2]=new SpecialAvenger("Hulk", true, 60, 12.3, 9.9, true);
        people.doshowinfo();
        Avengers[0].doshowinfo();
        Avengers[1].doshowinfo();
        SpecialAvengers[0].doshowinfo();
        SpecialAvengers[1].doshowinfo();
        SpecialAvengers[2].doshowinfo();
        for(i=0;i<5;i++){
            if(i>1){
                System.out.printf("%s的CP值:%.2f%n",SpecialAvengers[i-2].Name,SpecialAvengers[i-2].goCP());
            }else{
                System.out.printf("%s的CP值:%.2f%n",Avengers[i].Name,Avengers[i].goCP());
            }
        }
        System.out.println("計算NoAvergen的值");
        System.out.println("請輸入兩個數字(輸入0代表不輸入):");
        x=input.nextDouble();
        y=input.nextDouble();
        if(y==0){
            people.noCP(x);
        }else{
            people.noCP(x,y);
        }
    }
}
