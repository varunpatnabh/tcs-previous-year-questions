import java.util.*;

public class string {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String str1 = sc.nextLine();
       String str2 = sc.nextLine(); 
       int l1 = str1.length();
       int l2 = str2.length();
       char[] s1 = new char[l1];
       char[] s2 = new char[l2];
       char c;
       for(int i = 0;i < l1;i++){
            c = str1.charAt(i);
            s1[i] = c;
       }
       for(int i = 0;i < l1;i++){
        c = str2.charAt(i);
        s2[i] = c;
   }
       if(l1 != l2){
           System.out.println("0");
       }else{
            Arrays.sort(s1);
            Arrays.sort(s2);
            if(Arrays.equals(s1, s2) ){
                System.out.println("1");
                
            }else{
                System.out.println("0");
            }

       }
    }
}
// same letter
