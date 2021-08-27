import java.io.*;
import java.util.*;

public class wallpaint {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        float [] iwall = new float[n];
        float [] owall = new float[m];
        if(n < 0 || m < 0){
            System.out.println("Invalid output");
        }
        else if(n == 0 && m == 0){
            System.out.println("cost : 0");
        }
        else{
            for(int i = 0; i <n;i++){
                iwall[i] = scn.nextFloat();
            }
            for(int i = 0; i < m;i++){
                owall[i] = scn.nextFloat();
            }
        }    
        float isum = 0;
        float osum = 0;

        for(int i = 0 ;i<n;i++){
            isum = isum + iwall[i];
        }
        for(int i = 0 ;i<m;i++){
            osum = osum + owall[i];
        }
        float iprice = isum * 18;
        float oprice = osum * 12;
        float tprice = iprice + oprice;
        System.out.print("cost: "+tprice);

    }
}
