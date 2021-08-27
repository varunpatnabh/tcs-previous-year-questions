import java.util.Scanner;
public class cand {
    


    public static void main(String[] args) {
        int n = 10, k = 5;
        int num;
        Scanner scn = new Scanner(System.in);
        num = scn.nextInt();
        if(num >= 1 && num <=5){
            System.out.println("num of candies sold : " + num);
            System.out.println("num of candies left : " + (n - num));
        }
        else{
            System.out.println("Invalid input");
            System.out.println("num of candies left : " + n);
        }
    }

}
