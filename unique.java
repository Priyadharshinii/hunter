import java.io.*;
import java.util.*;
public class unique
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
HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
for(Integer i:arr)
{
if(h.containsKey(i))
{
h.put(i,h.get(i)+1);
}
else
{
h.put(i,1);1
}
}
Set<HashMap.Entry<Integer,Integer>> s1=h.entrySet();
for(HashMap.Entry<Integer,Integer> s2 : s1)
{
if(s2.getValue()==1)
{
System.out.printf("%d",s2.getKey());
}
}
}
}
