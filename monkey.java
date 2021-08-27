import java.io.*;
import java.util.*;


public class monkey {
    public static void main(String[] args) {
      Scanner scn = new Scanner (System.in);
      int n = scn.nextInt();
      int k = scn.nextInt();
      int j = scn.nextInt();
      int m = scn.nextInt();
      int p = scn.nextInt();  
      int atebanana = 0, atepeanut = 0;
      if(n<0 || m < 0 || j < 0 || k < 0|| p< 0){
          System.out.println("Invalid output");
      }else{
          if(k <= m){
              atebanana = m/k;
           }
          if( j <= p){
              atepeanut = p/j;
           }
              int rem = n - atebanana -atepeanut;
              System.out.println("Number of monkey left "+ rem);
          }
      }

    }
}
