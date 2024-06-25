package coreJavavPractice;

public class ReverseString {

    public static void main(String[] arg){
        String s= "nagesh";
        String t = "";

        for (int i=s.length()-1;i>=0;i--){
           // System.out.print(s.charAt(i));
            t=t + s.charAt(i);
        }
        System.out.println(t);

        if (s.equals(t)){
            System.out.println(s+"="+t + ": is palendrom string");
        }
        else {
            System.out.println(s+"!="+t + ": is not pallendrom string");
        }
    }

}