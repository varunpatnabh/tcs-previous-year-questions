import java.io.*;
import java.util.*;

public class washing {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the weight in grams: ");
        int n = scn.nextInt();
        if (n == 0){
            System.out.println("time estimated : 0 minutes");
        }
        else if(n>0 && n<=200){
            System.out.println("time estimated : 25 minutes");
        }
        else if(n>2000 && n <=4000){
            System.out.println("time estimated : 35 minutes");
        }
        else if(n>4000 && n<=7000){
            System.out.println("time estimated : 45 minutes");
        }
        else{
            System.out.println("overload");
        }
    }
}
