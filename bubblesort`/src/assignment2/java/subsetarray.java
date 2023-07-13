
package assignment2.java;
import java.util.Arrays;
public class subsetarray {
public static void main(String[] args) {
	int []a= {1,2,3,4,5,10};
	int []b= {1,2,3,4};
	
	int n=a.length;
	int m=b.length;
	boolean c=true;

	for(int j=0;j<m&&c==true;j++) {
		boolean d=true;
		for(int i=0;i<n&&c==true;i++) {
			if(b[j]==a[i]) {
				d=false;
			
				if(j==b.length-1) {
					
				System.out.println("array a is subset of b ");
				}
			break;
			}
			
			}
		if(d==true) {
			c=false;
			System.out.println("array a is not subset of b ");
		
		}
		
	}
	
	}

}