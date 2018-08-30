/* Code by ROhit kumar 29rohitkumar01@gmail.com */
import java.util.*;
import java.lang.*;
import java.io.*;

/* Program for array rotation by d elements */
/* input : test case, size of array, number of elements to rotate left, elements of array */
class ArrayRotation
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc  = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
			int n =sc.nextInt(); //size of the array
			int d =sc.nextInt(); //number of elements by which to shift
			int a[] = new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			//logic : store the first d elements in a temp array and then shift each element of remainig array
			int temp[] = new int[d];
			//store the first d elements in temp array
			for(int i = 0 ;i < d; i++){
				temp[i] = a[i];
			}
			//shifting the remaining n -d elements to the starting of the array
			for(int i=d;i<n;i++){
				a[i-d]=a[i];
			}
			//putting the temp elements in back of original array again
			for(int i=n-d,j=0;i<n && j<d;i++,j++){
				a[i] = temp[j];
			}
			
			//print the array after rotation
			for(int i=0;i<n;i++){
				System.out.print(a[i] +" ");
			}
			System.out.println();
			

		}
		
	}
}