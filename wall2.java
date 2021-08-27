import java.util.Scanner;

public class wall2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int in = scn.nextInt();
        int ou = scn.nextInt();
        float sumi =0,sumo = 0;
        float[] iw = new float[in];
        float[] ow = new float[ou];
        for(int i = 0;i<iw.length;i++){
            iw[i] = scn.nextFloat();
            sumi = sumi + iw[i];
        }
        for(int i = 0;i<ow.length;i++){
            ow[i] = scn.nextFloat();
            sumo = sumo + ow[i];
        }
        if (in == 0 && ou == 0){
            System.out.println("dont want to paint wall");
        }else{
            float total = (sumi*18) + (sumo * 12);
            System.out.println("Total cost : "+ total);
        }

    }
}
