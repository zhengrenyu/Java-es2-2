package ex2;
import java.util.Scanner;
import java.util.Random;
public class ex2 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//建立掃描器
        //sop("請輸入幾顆骰子\n");//輸出請輸入幾顆骰子，換行
        //dice(sc.nextInt());//將掃描器的值傳入method dice中
        sop("請輸入要幾張牌\n");//輸出請輸入要幾張牌，換行
        poker(sc.nextInt());//將掃描器的值傳入method poker中
        sc.close();//關閉掃描器
        //majong();
    }
    static void sop(String s){//method sop 傳入值(字串s)
        System.out.print(s);//輸出傳入的 字串s
    }
    
    //撲克牌遊戲
    static void poker(int carnum){//method poker 傳入值(整數 carnum)
        Random ra = new Random();//設ra為新隨機
        String card[]={
            "黑桃A","黑桃2","黑桃3","黑桃4","黑桃5","黑桃6","黑桃7","黑桃8","黑桃9","黑桃10","黑桃J","黑桃Q","黑桃K",
            "紅心A","紅心2","紅心3","紅心4","紅心5","紅心6","紅心7","紅心8","紅心9","紅心10","紅心J","紅心Q","紅心K",
            "方塊A","方塊2","方塊3","方塊4","方塊5","方塊6","方塊7","方塊8","方塊9","方塊10","方塊J","方塊Q","方塊K",
            "梅花A","梅花2","梅花3","梅花4","梅花5","梅花6","梅花7","梅花8","梅花9","梅花10","梅花J","梅花Q","梅花K"
        };//設立牌庫
        int total=0,total1=0;//設total,total1為0
        for(int i = 0;i<carnum;i++){//for迴圈，從0~carnum-1，每次+1
            int card1 = ra.nextInt(52);//整數card1為隨機整數從0~51
            sop(card[card1]+" ");//輸出card[card1+" "]
            switch(card1%13){//switch card1 mod 13
                case 10://如果case為10
                    total+=10;//total+10
                    break;//跳出switch
                case 11://如果case為11
                    total+=10;//total+10
                    break;//跳出switch
                case 12://如果case為12
                    total+=10;//total+10
                    break;//跳出switch
                default://預設
                    total+=card1%13+1;//total + (card1 mod 13 + 1)
                    break;//跳出switch
                case 0://如果case為0
                    total+=(total+11>21)?1:11;//total+11>21為真的話total+1為否的話total+11
                    break;//跳出switch
            }
        }
        sop("your point is: "+total+"\n");//輸出"your point is: "+total+"換行，\n"
        for (int i = 0;i<carnum;i++){//for迴圈，從0~carnum-1，每次+1
            int card1 = ra.nextInt(52);//整數card1為隨機整數從0~51
            sop(card[card1]+" ");//輸出card[card1+" "]
            switch(card1%13){//switch card1 mod 13
                case 10://如果case為10
                    total1+=10;//total1+10
                    break;//跳出switch
                case 11://如果case為11
                    total1+=10;//total1+10
                    break;//跳出switch
                case 12://如果case為12
                    total1+=10;//total1+10
                    break;//跳出switch
                default://預設
                    total1+=card1%13+1;//total1 + (card1 mod 13 + 1)
                    break;//跳出switch
                case 0://如果case為0
                    total1+=(total1+11>21)?1:11;//total1+11>21為真的話total+1為否的話total+11
                    break;//跳出switch
            }
        }
        sop("boss point is: "+total1+"\n");//輸出"boss point is: "+total1+"換行，\n"
        if(total>total1){//如果total>total1
            sop("you win\n");//輸出"you win，換行\n"
        }else if(total<total1){//否則如果total<total1
            sop("you lose\n");//輸出"you lose，換行\n"
        }else{//其他
            sop("tie\n");//輸出"tie，換行\n"
        }
    }
   
}