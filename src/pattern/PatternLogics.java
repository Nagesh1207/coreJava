package pattern;

public class PatternLogics{

    public static void main (String[] arg){
        PatternLogics pl =new PatternLogics();
        pl.pattern11(5);
    }
    public void pattern1(int n){
        for (int row=1;row<=n;row++){
            for (int col =1;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern2(int n){
        for (int row=1;row<=n;row++){
            for (int col=1;col<=n;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern3(int n){
        for (int row =1;row<=n;row++){
            for (int col=1;col<=n-row+1;col++){
                System.out.print("* ");
            }
            System.out.println();
            for(int sp=1;sp<=row;sp++){
                System.out.print(" ");
            }
        }
    }

    public void pattern4(int n){
        for (int row=1;row<=n;row++) {
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }
            for (int str = 1; str <= row; str++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public void pattern5(int n){
        for (int row =1; row<=2 * n-1; row++ ){
//            for (int col)

        }
    }

    public void pattern6(int n){
        for (int row=1;row<=2 * n -1;row++){
            int totalNoOfCol= row > n ? 2 * n - row : row;

            for (int col=1;col<=totalNoOfCol;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern7(int n){
        for (int row=1;row<=2*n-1;row++){

            int totalNoOfCol=row>n ? 2 * n -row:row;
            int spaces= n-totalNoOfCol;
            for(int i=1;i<=spaces;i++){
                System.out.print(" ");
            }

            for (int col=1;col<=totalNoOfCol;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void pattern8(int n){
        for (int row=1;row<=n;row++){
            for (int col =1;col<=row;col++){
                System.out.print("*");
            }
            for (int col=1;col<=2*(n-row);col++){
                    System.out.print(" ");
            }
            for(int col=1;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int row=1;row<=n;row++){
            for (int col=1;col<=n-row+1;col++){
                System.out.print("*");
            }
            for (int col=1;col<=2*(row-1);col++){
                System.out.print(" ");
            }
            for (int col=1;col<=n-row+1;col++){
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public void pattern9(int n){
        int i =1;
        for (int row =1 ; row<=n;row++){
            for(int col=1;col<=row;col++){
                if (i < 10)
                    System.out.print(i + "  "); // double space for single-digit
                else
                    System.out.print(i + " ");  // single space for double-digit
                i++;

            }
            System.out.println();
        }

    }

    public void pattern10(int n){
        int maxNum = n * (n + 1) / 2; // Maximum number in the pattern
        int maxDigits = String.valueOf(maxNum).length(); // Maximum number of digits
        int i=1;
        for (int row = 1; row <= n; row++){
            int num = 1;
            for (int col = 1; col <= row; col++){
                String numStr = String.valueOf(i);
                int numDigits = numStr.length();
                int spaces = maxDigits - numDigits + 1; // Calculate spaces needed based on number of digits

                System.out.print(i);
                for (int s = 0; s < spaces; s++) {
                    System.out.print(" ");
                }

                num++;
                i++;
            }
            System.out.println();
        }
    }
    public void pattern11(int n){
        for (int row=1;row<=2*n-1;row++){

            int totalNoOfCol=row>n ? 2 * n -row:row;
            int spaces= n-totalNoOfCol;
            for(int i=1;i<=spaces;i++){
                System.out.print(" ");
            }

            for (int col=1;col<=totalNoOfCol;col++){
                System.out.print(5*col);
            }
            System.out.println();
        }

    }



}

