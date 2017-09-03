import java.io.*;
import java.util.*;
public class index
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String str=s.nextLine();
String str1[]=str.split(" ");
int len=str1.length;
int arr[]=new int[len];
for(int i=0;i<arr.length;i++)
{
arr[i]=Integer.parseInt(str1[i]);
}
for(int i=0;i<arr.length;i++)
{
if(i==arr[i])
{
System.out.print(arr[i]);
}
}
}
}
