package FreqAskedQues;

public class FactorialNumber {
    public static void main(String[] args){
        //Factorial Program in Java: Factorial of n is the product of all positive descending integers.
        //Input = 5!
        //Output = 5! = 5*4*3*2*1 = 120
        FactorialNumber fs = new FactorialNumber();
        fs.factorial(4);
    }

    public void factorial(int num){
        int fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("factorial of "+num+"! = "+fact);
    }
}
