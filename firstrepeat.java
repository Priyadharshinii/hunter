import java.io.*;
import java.util.*;
public class firstrepeat
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int c=1;
String str=s.nextLine();
String str1[]=str.split(" ");
int len=str1.length;
int arr[]=new int[len];
for(int i=0;i<len;i++)
{
arr[i]=Integer.parseInt(str1[i]);
}
Map<Integer,Integer> m=new HashMap<Integer,Integer>();
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
Set<Map.Entry<Integer,Integer>> s=m.entrySet();
for(Map.Entry<Integer,Integer> es:s)
{
if(es.getValue()>1)
{
System.out.printf("%d",es.getKey());
break;
}
}
}
