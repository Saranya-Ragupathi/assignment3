package assignment2.java;

public class duplicateArray {

	public static void main(String[] args) {
		//array should be sorted to use this method
		int[]a= {1,3,5,5,6,7,7,7,8};
		for(int i=0;i<a.length-1;i++) {
			if (a[i]==a[i+1]) {
				System.out.println(a[i]);//print all duplicate numbers except original one
			}
		}

	}

}
