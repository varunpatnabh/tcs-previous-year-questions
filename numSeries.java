import java.util.*;

public class numSeries {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a = 1, b = 1;
        
        n -= 1;
        int[] ser = new int[30];
        ser[0] = 1;
        ser[1] = 1;
        for(int i = 2; i < 30; i++){
            if (i%2==0){
                a = a*2;
                ser[i]=a;
            }
            else{
                b = b*3;
                ser[i] = b;
            }
        }
        System.out.println(ser[n]);
    }
}
