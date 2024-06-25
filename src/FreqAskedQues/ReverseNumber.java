package FreqAskedQues;

public class ReverseNumber {
    public static void main(String[] args){
        ReverseNumber rn = new ReverseNumber();
        rn.palindromNum(12221);
    }

    public void revNumber(int num){
        int rem;
        int rev=0;
        int temp=num;
        while (temp>0){
            rem=temp%10;
            rev=(rev*10)+rem;
            temp=temp/10;
        }
        System.out.println(rev);
    }

    public void palindromNum(int num){
        int rev=0;
        int rem;
        int temp=num;
        while(temp>0)
        {
            rem=temp%10;
            rev=(rev*10)+rem;
            temp=temp/10;
        }

        if (rev==num){
            System.out.println(rev +" it's palindrome number");
        }
        else{
            System.out.println(rev +" it's not a palindrome number");
        }
    }
}
