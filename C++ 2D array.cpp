#include <iostream>
using namespace std;

int main() {
	//code
	int t;
	cin>>t;
	while(t--){
	    int n ;
	    cin>>n;
	    int a[n][n];
	    int rowFlag[n]={0};
	    
	    int columnFlag[n]={0};
	    for(int i=0;i<n;i++){
	        for(int j=0;j<n;j++){
	            cin>>a[i][j];
	            if(a[i][j]==0){
	                rowFlag[i]=1;
	                columnFlag[j]=1;
	            }
	        }
	    }
	    for(int i=0;i<n;i++){
	        for(int j=0;j<n;j++){
	            if(rowFlag[i]==1 || columnFlag[j]==1){
	                a[i][j]=0;
	            }
	        }
	        
	    }
	    for(int i=0;i<n;i++){
	        for(int j=0;j<n;j++){
	            cout<<a[i][j]<<" ";
	        }
	    }
	   cout<<"\n";
	}
	return 0;
}