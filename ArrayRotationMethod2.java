/* Code by ROhit kumar 29rohitkumar01@gmail.com */
import java.util.*;
import java.lang.*;
import java.io.*;

/* Program for array rotation by d elements */
/* input : test case, size of array, number of elements to rotate left, elements of array */
class ArrayRotationMethod2
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
			//logic : rotate each array element by 1 to left using a temp variable and repeat this step d times
			
			for(int i=0;i<d;i++){
				int temp = a[0];
				for(int j=0;j<n-1;j++){
					a[j]=a[j+1];
				}
				a[n-1]=temp;
			}
			
			//print the array after rotation
			for(int i=0;i<n;i++){
				System.out.print(a[i] +" ");
			}
			System.out.println();
			

		}
		
	}
}