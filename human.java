package A1113308_0331;

class human extends animal {
    String gender;
    human(String name, double height, int weight, int speed,String gender) {
        super(name, height, weight, speed);
        //TODO Auto-generated constructor stub
        this.gender=gender;
    }
    void show(){
        System.out.printf("姓名:%s\n身高:%.1f\n體重:%d\n速度:%d\n性別:%s\n",name,height,weight,speed,gender);
    }
}
