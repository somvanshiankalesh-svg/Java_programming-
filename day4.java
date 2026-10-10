import java.io.*;
import java.util.*;

class Dd8
public static void main (String args[])
int a[][]=new int [3][3];
int b[][]=new int [3][3];
Scanner s1 = new Scanner(System.in);

System.out.println("Enter A array :\n");
for(int i=0;i<3;i++)
{
    for(int j=0;j<3;j++)
    {
        a[i][j]=s1.nextInt();
    }
}

System.out.println("Display A Array :\n");
for (int i=0;i<3;i++)
{
    for(int j=0;j<3;j++)
    {
        System.out.print(a[i][j]+ " ");

    }
    System.out.println();
}

System.out.println("Dis[play array of A \n");

System.out.println("Enter Array of B :\n");
for(int i=0;i<3;i++)
{
    for(int j=0;j<3;j++)
    {
        b[i][j]=s1.nextInt();
    }
}

System.out.println("Display B Array :\n");
for (int i=0; i<3; i++)
{
    for (int j=0; j<3; j++)
    {
        System.out.print(b[i][j]+ " ");
    }
    System.out.println();
}
