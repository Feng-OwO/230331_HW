public class animal{

    public static void showInfo(){
        System.out.println("歡迎進入冰雪奇緣系統\n");
    }
    String name;
    double height=0,weight=0,speed=0;

    animal(String name,double height,double weight,double speed){
        this.name=name;
        this.height=height;
        this.weight=weight;
        this.speed=speed;
    }
    void show(){
        System.out.printf("name : %s\nheight : %3.2f(m)\nweight : %4.1f(Kg)\nspeed : %5.2f(m/min)\n\n",this.name,this.height,this.weight,this.speed);
    
    }

    double distance(double x,double y){
        double result=0;
        result = x*y*this.speed;
        return result;
    }
    double distance(double x){
        double result = 0;
        result = x*this.speed;
        return result;
    }
}

class human extends animal{
    String sex;
    human(String name,double height,double weight,double speed,String sex){
        super(name,height,weight,speed);
        this.sex=sex;
    }

    void show(){
        System.out.printf("name : %s\nheight : %3.2f(m)\nweight : %4.1f(Kg)\nspeed : %5.2f(m/min)\nsex : %s\n\n",this.name,this.height,this.weight,this.speed,this.sex);
    }
}

class snow extends human{
    boolean skill;
    snow(String name,double height,double weight,double speed,String sex,boolean skill){
        super(name,height,weight,speed,sex);
        this.skill=skill;
    }

    void show(){
        System.out.printf("name : %s\nheight : %3.2f(m)\nweight : %4.1f(Kg)\nspeed : %5.2f(m/min)\nsex : %s\nskill : %b\n",this.name,this.height,this.weight,this.speed,this.sex,this.skill);

    }
    
    double distance(double x,double y){
        double result=0;
        result = x*y*this.speed*2;
        return result;
    }
    double distance(double x){
        double result = 0;
        result = x*this.speed*2;
        return result;
    }

}