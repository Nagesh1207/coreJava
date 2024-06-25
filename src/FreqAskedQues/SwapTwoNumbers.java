package FreqAskedQues;

public class SwapTwoNumbers {
    public static void main (String[] args){
        SwapTwoNumbers stn = new SwapTwoNumbers();
        stn.usingXOR();
    }
    public void usingThirdVariable(){
        int a=100;
        int b= 200;

        int temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping a="+a+" :b="+b);
    }
    public void usingTwoVariable(){
        int a=100;
        int b=200;

        a= a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping a="+a+" :b="+b);
    }
    public void usingXOR(){
        int a=100;
        int b=200;

        a=a^b;
        System.out.println(a);
        b=a^b;
        a=a^b;
        System.out.println("After swapping a="+a+" :b="+b);
    }
}
