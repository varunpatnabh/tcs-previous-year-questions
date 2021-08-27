// import java.util.*;
// public class doctor {
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         //int n = scn.nextInt();

//         //int[] age = new int[20];
//         while(scn.nextInt!=0){
            
//         }

//     }
// }
import java.util.*;

class Sorting{
	public void calculateFee(int arr[] , int size){
		int sum = 0;
			for (int i=0;i<size ;i++ ){
				if(arr[i] > 0 && arr[i] <120){
					if(arr[i] < 17)
						sum = sum + 200;
					else if (arr[i]>=17 && arr[i] <40){
						sum = sum + 400;
					}else if (arr[i]>=40){
						sum = sum + 300;
					}
				}
			}
	
		System.out.print("Total income "+ sum +" INR");
	}


	public static void main(String args[]){
		Sorting sorting = new Sorting();
	
		System.out.print("Enter the size of the array :");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[]=new int[size];

		System.out.print("Enter the element of the array :");
		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}
		sorting.calculateFee(arr,size);
		//sorting.print(arr,size);
	}
}
