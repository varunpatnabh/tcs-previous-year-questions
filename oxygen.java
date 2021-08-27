import java.util.*;
import java.io.*;

public class oxygen {
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       int[][] trainee = new int[3][3];
       int[] average = new int[3];
       int max = 0;
       for(int i = 0;i < 3;i++){
           for(int j =0 ; j< 3;j++){
               trainee[i][j] = scn.nextInt();
               if (trainee[i][j] < 1 || trainee[i][j] >100){
                   System.out.print("Invalid Input");
               }
           }
       }
       for(int i = 0;i<3;i++){
           for(int j = 0; j < 3; j++){
               average[i] = average[i] + trainee[j][i];
           }
           average[i]/=3;
           System.out.println("avg "+average[i]);
       }
       for(int i = 0;i<3;i++){
           if(average[i] > max){
               max = average[i];
            }
        }
       for(int i = 0; i < 3;i++){
           if(average[i] == max){
               System.out.println("Trainee number : "+ (i+1));
           }
           if(average[i] < 70){
               System.out.print("trainee is unfit");
           }
       }

     
    }

}
