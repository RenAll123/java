
class IniMonkey{
    String color;
    int height;
    int weight;

    double run(int y,double z){
        int x=10;
        x*=this.height;
        //System.out.println("Speed:"+x);
        return x*y*z;
    }
}


public class Monkey{
    public static void main(String[] args) {
        //IniMonkey monkey1,monkey2,monkey3;
        IniMonkey[] monkeys=new IniMonkey[3];
        for(int i=0;i<3;i++){
            monkeys[i]=new IniMonkey();
            monkeys[i].color="yellow";
            monkeys[i].height=10*(i+1);
            monkeys[i].weight=60+((i+1)*20);
            System.out.println("Color:"+monkeys[i].color+"\nHeight:"+monkeys[i].height+"\nWeight:"+monkeys[i].weight);
        }
        /*monkey1=new IniMonkey();
        monkey2=new IniMonkey();
        monkey3=new IniMonkey();

        monkey1.color="Blue";
        monkey1.height=10;
        monkey1.weight=60;
        System.out.println("Color:"+monkey1.color+"\nHeight:"+monkey1.height+"\nWeight:"+monkey1.weight);
        System.out.println("Speed:"+monkey1.run(3,0.5));

        monkey2.color="Yellow";
        monkey2.height=20;
        monkey2.weight=80;
        System.out.println("Color:"+monkey2.color+"\nHeight:"+monkey2.height+"\nWeight:"+monkey2.weight);
        //monkey2.run();
        System.out.println("Speed:"+monkey2.run(7,1.11));


        monkey3.color="Green";
        monkey3.height=100;
        monkey3.weight=500;
        System.out.println("Color:"+monkey3.color+"\nHeight:"+monkey3.height+"\nWeight:"+monkey3.weight);
        //monkey3.run();
        */
    }
}
