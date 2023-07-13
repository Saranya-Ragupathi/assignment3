package assignment2.java;

public class selectionsort {
//Selection Sort
	public static void main(String[] args) {
int[]a= {5,1,8,0,9,4,2};
for(int i=0;i<a.length;i++) {
	for(int j=1;j<a.length;j++) {
		if(a[j]<a[i]&&j>i) {
			int tmp=a[i];
			a[i]=a[j];
			a[j]=tmp;
		}
	}
}
for(int ele:a) {
	System.out.print(ele+" ");
}
	}
}
