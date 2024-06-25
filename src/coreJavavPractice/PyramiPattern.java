package coreJavavPractice;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PyramiPattern {


   //String currentDateTime;


    public String CurrenttimeGen(){
        Date currentDate = new Date();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");

        String currentDateTime = dateFormat.format(currentDate);
        //System.out.println("from same function: "+currentDateTime);
        return currentDateTime;
    }

    public void usageCTG(){
        System.out.println("from different function: "+CurrenttimeGen());
    }


    public static void main(String[] arg){
        PyramiPattern pp = new PyramiPattern();
        pp.usageCTG();


    }

    public void rightAngleTriangle(){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void reverseRightAngle(){
        for(int i=1;i<=4;i++){
            for(int j=4;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void combinationboth(){
        for(int i=1;i<=4;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=4;i++){
            for(int j=3;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    protected void leftRightAngleTriangle(){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();

        for (int i=1; i<=n;i++){
            for(int j=n-1;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

      private void revleftRightAngleTriangle(){
          Scanner sc = new Scanner(System.in);
          System.out.print("enter number :");
          int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for (int j=n;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
            for (int k=1;k<=i;k++){
                System.out.print(" ");
            }
        }
    }

      public void comboOfleftRiTriangle() {
        Scanner sc = new Scanner(System.in);
          System.out.println("enter number n :");
          int n= sc.nextInt();
          for (int i = 1; i <= n; i++) {
              for (int j = n-1; j >= i; j--) {
                  System.out.print(" ");
              }
              for (int k = 1; k <= i; k++) {
                  System.out.print("*");
              }
              System.out.println();
          }
          for (int i = 1; i <= n-1; i++) {
              for (int j = 1; j <= i; j++) {
                  System.out.print(" ");
              }
              for (int k = n-1; k >= i; k--) {
                  System.out.print("*");
              }
              System.out.println();
          }
      }

      public void pyramid(){
        Scanner sc =new Scanner(System.in);
          System.out.println("enter number :");
          int n=sc.nextInt();
        for (int i=1; i<=n;i++){
            for (int j=n-1; j>=i;j--){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++) {
                System.out.print("* ");
            }
            System.out.println();

        }
      }
      public void reversePyramid(){
        Scanner sc =new Scanner(System.in);
        System.out.print("please enter number :");
        int n= sc.nextInt();

        for (int i=1;i<=n;i++){
            for (int j=n;j>=i;j--) {
                System.out.print("* ");
            }
            System.out.println();

            for(int k=1;k<=i;k++){
                System.out.print(" ");
            }
        }
      }

      public void oddStrarPyramid(){
        for (int i=1;i<=4;i++){
            for(int j=3;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
      }

      public static void pattern1(int n){
        for (int row=0;row<n;row++){
            for (int col=0;col<n-row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
      }

      public void pattern2(int n){
        for(int row=0;row<n;row++){
            for (int col=0;col<n-row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
      }

      public void pattern3(int n){
        for (int r=0;r<=n;r++){
            for (int c=0;c<=n; c++){
                System.out.print("* ");
            }
            System.out.println();
        }
      }
      public void pyramidlogic1(int n){
        for (int r=1;r<=n;r++){
            for (int c=1;c<=n-r;c++){
                System.out.print(" ");
            }
            for (int i=1;i<=r;i++){
            System.out.print("* ");
            }
            System.out.println();
        }
      }

      public void pyramidlogic2(int n){
        for (int r=1;r<=n;r++){
            for (int c=1;c<=n-r+1;c++){
                System.out.print("* ");
            }
            System.out.println();
            for (int i=1;i<=r;i++){
                System.out.print(" ");
            }
        }
      }


}


