package A1113308_0331;

class snow extends human{
    String ice_skills;
    snow(String name, double height, int weight, int speed, String gender,String ice_skills) {
        super(name, height, weight, speed, gender);
        //TODO Auto-generated constructor stub
        this.ice_skills=ice_skills;
    }
    void show(){
        System.out.printf("姓名:%s\n身高:%.1f\n體重:%d\n速度:%d\n性別:%s\n冰凍技能:%s\n",name,height,weight,speed,gender,ice_skills);
    }
    double distance(int x,double y){
        return x*y*speed*2;
    }  
    double distance(int x){
        return x*speed*2;
    }
}
