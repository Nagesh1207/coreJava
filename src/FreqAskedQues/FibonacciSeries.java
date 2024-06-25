package FreqAskedQues;

public class FibonacciSeries {
    public static void main(String[] args){
        FibonacciSeries fs = new FibonacciSeries();
        fs.fibonacci(11);
    }
    public void fibonacci(int num){
        int num1=0;
        int num2=1;

        for(int i=0;i<=num;i++){
            System.out.print(num1 + " , ");
            int num3= num2+num1; //swap
            num1=num2;
            num2=num3;
        }
    }
}
