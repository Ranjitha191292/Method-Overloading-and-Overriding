import java.util.Scanner;
class Employee1
{
String employeeName;
int employeeAge;
Employee1()
{
}
Employee1(String employeeName,int employeeAge)
{
this.employeeName=employeeName;
this.employeeAge=employeeAge;
}
void display()
{
System.out.println("Employee name is:"+employeeName);
System.out.println("Employee age is:"+employeeAge);
}
}

class PTEmployee extends Employee1
{
int employeeWage;
PTEmployee(String name,int age,int employeeWage)
{
super(name,age);
super.display();
this.employeeWage=employeeWage;
}
void display()
{

System.out.println("Employee wage is:"+employeeWage);
}
}

class FTEmployee extends Employee1
{
int employeeSal;
FTEmployee(String name,int age,int employeeSal)
{
super(name,age);
super.display();
this.employeeSal=employeeSal;
}
void display()
{
System.out.println("Employee salary is:"+employeeSal);
}
}

class Main
{
public static void main(String args[])
{
//Employee1 e=new Employee1("Raghav",23);
//e.display();
Scanner s=new Scanner(System.in);
System.out.println("Enter the name,age,salary of part time employee");
Employee1 e1=new PTEmployee(s.next(),s.nextInt(),s.nextInt());
e1.display();

System.out.println("Enter the name,age,salary of full time employee");
Employee1 e2=new FTEmployee(s.next(),s.nextInt(),s.nextInt());
e2.display();

}
}


