// Approach 1 : without using ArrayList
import java.lang.*;
import java.io.*;
import java.util.* ;
public class JavaIterator
 {
	public static void main (String[] args)
	 {
	 //code
	 Scanner sc = new Scanner(System.in);
	 int t = sc.nextInt();
	 while(t-- >0){
	     int n =sc.nextInt();
	     int k =sc.nextInt();
	     int count = 0;
	     int a[] = new int[n];
	     for(int i = 0; i < n; i++,count++)
	     {
	         a[count]=sc.nextInt();
	         if(a[count] < k){
	             count--;
	         }
	     }
	     Arrays.sort(a);
	     System.out.print("[");
	     for(int i=0;i<count;i++){
	         if(i!=0){
	             System.out.print(", ");
	         }
	         System.out.print(a[n-(count-i)]);
	     }
	     System.out.print("]\n");
	 }
	 }
}