package FreqAskedQues;

import java.util.Scanner;

public class OddEvenNum {
    public static void main(String[] args){
        OddEvenNum oen = new OddEvenNum();
        oen.oddOrEven();
    }
    public void oddOrEven(){
        // 1. Using Brute Forcew Approach
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number:");
        num=sc.nextInt();

        if (num%2==0){
            System.out.println(num + " it's an even number");
        }
        else {
            System.out.println(num+ " It's an odd number");
        }
    }
}
