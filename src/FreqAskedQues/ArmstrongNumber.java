package FreqAskedQues;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args){
        ArmstrongNumber am = new ArmstrongNumber();
        am.amstronNum();
    }

    public void amstronNumUsingWhileLoop(){
        int sum=0;
        int reminder;
        int temp;
        int num;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        num=sc.nextInt(); // It is the number to check Armstrong temp = num;
        temp=num;
        while (temp>0){
            reminder =temp%10;
            temp =temp/10;
            sum=sum+(reminder*reminder*reminder);
        }
        if (num==sum){
            System.out.println(num + " is armstrong number");
        }
        else {
            System.out.println(num + " is Not armstrong number");
        }
    }


    public void amstronNum(){
        // Number to check
        int number = 1634;
        // Variables to store original number, remainder, result, and count of digits
        int originalNumber, remainder, result = 0, n = 0;

        // Save the original number
        originalNumber = number;

        // Count the number of digits in the number
        for (;originalNumber != 0; originalNumber /= 10, ++n);

        // Reset originalNumber to the original number
        originalNumber = number;

        // Calculate the sum of the digits raised to the power of n
        for (;originalNumber != 0; originalNumber /= 10) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
        }

        // Check if the result is equal to the original number
        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}

