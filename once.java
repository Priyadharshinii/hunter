import java.io.*;
import java.util.*;
public class once
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String str=s.nextLine();
String str1[]=str.split(" ");
int arr[]=new int[str1.length];
for(int i=0;i<str1.length;i++)
{
arr[i]=Integer.parseInt(str1[i]);
}
HashMap<Integer,Integer> m=new HashMap<Integer,Integer>();
for(Integer i:arr)
{
if(m.containsKey(i))
{
m.put(i,m.get(i)+1);
}
else
{
m.put(i,1);
}
}
Set<HashMap.Entry<Integer,Integer>> e=m.entrySet();
for(HashMap.Entry<Integer,Integer> es : e)
{
if(es.getValue()==1)
{
System.out.printf("%d",es.getKey());
}
}
}
}
