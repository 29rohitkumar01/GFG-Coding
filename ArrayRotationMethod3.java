/* Code by ROhit kumar 29rohitkumar01@gmail.com */
import java.util.*;
import java.lang.*;
import java.io.*;

/* Program for array rotation by d elements */
/* input : test case, size of array, number of elements to rotate left, elements of array */
class ArrayRotationMethod3
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
			//logic divide the array in  k =gcd(n,d) sets and then  rotate elements in sets
			
			leftRotate(a,d,n);
			printArray(a,n);			

		}
		
    }
    public static void  leftRotate(int a[],int d,int n){
		int g = gcd(d,n);
		for(int i=0; i < g; i++){
			int j =i;
			int temp =a[i];
			while(true){
				int k =j+d;
				if(k >= n ){
					k = k-n;
				}
				if(k==i){
					break;
				}
				a[j]=a[k];
				j=k;
			}
			a[j] = temp;
		}
	}
	
	public static int gcd(int a, int b){
		if(b==0){
			return a;
		}
		else {
			return gcd(b,a%b);
		}
	}
	
	public static void printArray(int a[], int n){
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}