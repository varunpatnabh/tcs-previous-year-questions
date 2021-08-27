import java.util.*;

public class StringTwist {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter three words : ");

        String s1 = scn.next();
        String s2 = scn.next();
        String s3 = scn.next();

        int l1 = s1.length();
        int l2 = s2.length();

        String str1 = "";
        String str2 = "";
        String str3 = "";

        char c;
        for(int i = 0; i< l1;i++){
            c = s1.charAt(i);
            if(c == 'a'||c == 'A' || c == 'e' ||c == 'E'||c == 'i' || c == 'I' ||c == 'o'||c == 'O' || c == 'u' || c == 'U'  ){
                str1 = str1 + "%";

            }else{
                str1 = str1 + c;
            }

        }
        for(int i = 0;i < l2; i++){
            c = s2.charAt(i);
            if(c == 'a'||c == 'A' || c == 'e' ||c == 'E'||c == 'i' || c == 'I' ||c == 'o'||c == 'O' || c == 'u' || c == 'U'  ){
                str1 = str1 + c;

            }else{
                str1 = str1 + "#";
            }

        }str3 = s3.toUpperCase();
        System.out.println(str1+str2+str3);

    }
}
