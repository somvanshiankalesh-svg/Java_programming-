import java.io.*;
import java.util.*;

class MultiArray{
	public static void main (String args[]){
		int a[][][]=new int[2][3][3];
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter array: ");
		
		for(int k=0;k<2;k++)
		{
			System.out.println("Index at: " + k);
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					a[k][i][j]=s1.nextInt();
				}
			}
		
		
		}
		System.out.println("Addition of A and B matrix is ");
		for(int i=0;i<3;i++)
		{
				for(int j=0;j<3;j++)
				{
					System.out.print(a[0][i][j]+a[1][i][j] + " ");
				}
				System.out.println();
		}
	
	
	
	}

}