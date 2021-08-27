import java.io.*;
import java.util.Scanner;
public class oxy {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[][] arr = new int[3][3];
        int max = 0;
        int[] avg = new int[3];
        for(int i = 0; i<3;i++){
            for(int j = 0; j<3 ; j++){
                arr[i][j] = scn.nextInt();
                if(arr[i][j]<1 || arr[i][j] > 100){
                    System.out.println("Invalid Input");
                    break;
                }
            }
        }
        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                avg[i] = arr[j][i] + avg[i];
            }
            avg[i]/=3;
        }
        
        for(int i = 0;i<3;i++){
            if (avg[i] > max){
                max = avg[i];
            }
        }
        for(int i = 0;i<3;i++){
            if(avg[i] == max){
                System.out.println("trainee Number : "+ (i+1));
            }else if(avg[i] < 70){
                System.out.println("Trainee is unfit : "+(i+1));
            }
        }
    }
}
