import java.io.*;
import java.util.Scanner;

public class candy {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = 10;
        

        if (m>=1 && m<=5){
            System.out.println("Number of Candies Sold : " + m);
            System.out.println("Number of Candies Left : "+ (n-m));
        }else{
            System.out.println("Invalid Output");
            System.out.println("Number of Candies Left : "+n);
        }
        
    }
}
