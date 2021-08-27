import java.util.*;
public class primewithTwist {
    static void prime(int n){
        int c = 0;
        for(int i = 2;i<=n;i++){
            if(n%i==0){
                c++;
            }   
        }
        if (c == 1){
            System.out.println(n + " is a prime number");

        }else{
            System.out.println(n + " is not a prime number");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n<0){
            System.out.println("Please enter the positive number");
            n = sc.nextInt();
        }else{
            prime(n);
        }
    }
}
