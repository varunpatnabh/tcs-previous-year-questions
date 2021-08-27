import java.util.*;

public class numSeriesWithTwist {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
         int o =0, e= 0;
        for(int i=1;i<n+1;i++){
            if(i%2!=0){
                o = o+7;
            }else{
                e = e+6;
            }
        }if(n%2!=0){
            System.out.print(" element "+ (o-7));
        }else{
            System.out.print(" element" + (e-6));
        }
    }
}
