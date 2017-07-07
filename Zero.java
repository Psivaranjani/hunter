# hunter
import java.util.*;
public class Zero
{
public static void main(String ar[])throws Exception
{
Scanner sc=new Scanner(System.in);
int s;
s=sc.nextInt();
int a[]=new int[s];
for(int i=0;i<s;i++)
a[i]=sc.nextInt();
for(int i=0;i<s-1;i++)
{
for(int j=i+1;j<s;j++)
{
if(a[i]+a[j]==0)
System.out.println("elements are"+a[i]+"\t"+a[j]);
}
}
}
}
