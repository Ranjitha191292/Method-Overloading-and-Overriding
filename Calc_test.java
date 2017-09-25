import java.util.Scanner;
class Calc_test
{
int sum;
float sum1;
//int a[]={1,2,3,4};
void add(int b[])
{
for(int i:b)
{
sum=sum+i;
}
System.out.println("The sum of integer numbers is:"+sum);
}

void add(float c[])
{
for(float i:c)
{
sum1=sum1+i;
}
System.out.println("The sum of float numbers is:"+sum1);
}

public static void main(String args[])
{
int n;int m;
Calc_test obj=new Calc_test();
Scanner s=new Scanner(System.in);
System.out.println("Enter the number of integer numbers to be added");
n=s.nextInt();
int a[]=new int[n];
System.out.println("Enter the number of float numbers to be added");
m=s.nextInt();
float b[]=new float[m];

System.out.println("Enter the integer numbers:");
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}

System.out.println("Enter the float numbers:");
for(int j=0;j<m;j++)
{
b[j]=s.nextFloat();
}
obj.add(a);
obj.add(b);
}
}
