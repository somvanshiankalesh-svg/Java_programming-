import java.io.*;
import java.util.*;

class JA{
	public static void main(String args[]){
		int a[][] = new int [4][];
		
		a[0] = new int []{10,20,30,40,50};
		a[1] = new int []{11,22};
		a[2] = new int []{1,2,3,4,5,6,7,8,9,10};
		a[3] = new int []{98,23,45};
		
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	
	}

}