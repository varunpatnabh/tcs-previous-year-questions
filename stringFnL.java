import java.util.*;

public class stringFnL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char chr = sc.next().charAt(0);
        int l1 = str.length();
        char[] arr = new char[l1];
        char c;
        // for(int i= 0;i<l1;i++){
        //     c = str.charAt(i);
        //     arr[i] = c;
        // }
        if(str.charAt(0) == str.charAt(l1-1)){
            int count = 0;
            for(int i= 0;i<l1;i++){
                c = str.charAt(i); 
                if (c == chr){
                    count+=1;
                }
            }System.out.println(count);
        }
        else{System.out.println("0");

        }
    }
}
