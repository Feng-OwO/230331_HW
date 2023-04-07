import java.util.*;

//------導入套件>>>設定數值------------------------------------------------------------------------
public class A1113313_0331_1{
    public static void main(String[] argv){

        animal.showInfo();

        animal[] animals = new animal[2];
        animals[0]=new animal("雪寶", 1.1, 52, 100);
        animals[1]=new animal("驢子", 1.5,99,200);
        for(int i=0;i<animals.length;i++){
            animals[i].show();
        }
        human[] humans=new human[3];
        humans[0]=new human("阿克", 1.9, 80, 150,"男");
        humans[1]=new human("漢斯", 1.8, 78, 130,"男");
        humans[2]=new human("安娜", 1.7, 48, 120,"女");
        for(int i=0;i<humans.length;i++){
            humans[i].show();
        }
        
        snow queen=new snow("愛沙", 1.7, 50, 120, "女", true);
        queen.show();

//------設定數值>>>輸入t、a-----------------------------------------------------------------------
        Scanner input = new Scanner(System.in);
        double[][] animalsData= new double[2][2];
        for(int i=0;i<animals.length;i++){
            System.out.printf("請輸入%s的時間 : ",animals[i].name);
            animalsData[i][0]=input.nextDouble();
            System.out.printf("請輸入%s的加速度(若無則輸入0) : ",animals[i].name);
            animalsData[i][1]=input.nextDouble();

            if(animalsData[i][1]!=0){
                System.out.printf("%s 的奔跑距離為 %f 公尺\n",animals[i].name,animals[i].distance(animalsData[i][0],animalsData[i][1]));
            }else{
                System.out.printf("%s 的奔跑距離為 %f 公尺\n",animals[i].name,animals[i].distance(animalsData[i][0]));
            }
        }

        double[][] humansData= new double[3][2];
        for(int i=0;i<humans.length;i++){
            System.out.printf("請輸入%s的時間 : ",humans[i].name);
            humansData[i][0]=input.nextDouble();
            System.out.printf("請輸入%s的加速度(若無則輸入0) : ",humans[i].name);
            humansData[i][1]=input.nextDouble();

            if(humansData[i][1]!=0){
                System.out.printf("%s 的奔跑距離為 %f 公尺\n",humans[i].name,humans[i].distance(humansData[i][0],humansData[i][1]));
            }else{
                System.out.printf("%s 的奔跑距離為 %f 公尺\n",humans[i].name,humans[i].distance(humansData[i][0]));
            }
        }
        
        double[][] queenData= new double[1][2];
        for(int i=0;i<1;i++){
            System.out.printf("請輸入%s的時間 : ",queen.name);
            queenData[i][0]=input.nextDouble();
            System.out.printf("請輸入%s的加速度(若無則輸入0) : ",queen.name);
            queenData[i][1]=input.nextDouble();

            if(queenData[i][1]!=0){
                System.out.printf("%s 的奔跑距離為 %f 公尺\n",queen.name,queen.distance(queenData[i][0],queenData[i][1]));
            }else{
                System.out.printf("%s 的奔跑距離為 %f 公尺\n",queen.name,queen.distance(queenData[i][0]));
            }
        }
    }
}
