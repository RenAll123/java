package A1113308_0331;
class animal {
    String name;
    double height;
    int weight,speed;
    animal(String name,double height,int weight,int speed){
        this.name=name;
        this.height=height;
        this.weight=weight;
        this.speed=speed;
    }
    void show(){
        System.out.printf("姓名:%s\n身高:%.1f\n體重:%d\n速度:%d\n",name,height,weight,speed);
    }
    double distance(int x,double y){
        return x*y*speed;
    }  
    double distance(int x){
        return x*speed;
    }
    static void showinfo(){
        System.out.println("歡迎進入冰雪奇緣系統");
    }    
}
