import java.io.*;
import java .util.*;

class employee
{
  public static void main(String []args)
{
Scanner get=new Scanner(System.in);
String name,address;
int check=1;
float Salary;
float rating,new_salary;
double id; long mobile; char blood;
do
{
System.out.println("\n\n \t\t\t Emglitz Technologies");
System.out.println("\n Enter Employee name:");
name=get.next();
System.out.println("\n Enter  Id:");
id=get.nextDouble();
System.out.println("\n Enter Mobile number");
mobile=get.nextLong();
System.out.println("\n Enter Address:");
address=get.next();
System.out.println("\n Enter Blood group:");
blood=get.next().charAt(0);
System.out.println("Enter Salary:");
Salary=get.nextFloat();
System.out.println("\n Enter rating:");
rating=get.nextFloat();

if (rating>=4.5 && rating<=5.0)
{
 new_salary=Salary*15/100 ;
 Salary=Salary+new_salary;
 System.out.println("Salary :"+Salary);
 System.out.println("Congratulations YOU GOT 15% HIKE !!! \n \n ");
 
}
else if(rating>=4.0 && rating<4.5)
{
 new_salary=Salary*10/100 ;
 Salary=Salary+new_salary;
 System.out.println("Salary :"+Salary);
 System.out.println("Congratulations YOU GOT 10% HIKE !!! \n \n");
} 
else if(rating>3.5 && rating <4.0){
 new_salary=Salary*5/100 ;
 Salary=Salary+new_salary;
 System.out.println("Salary :"+Salary);
 System.out.println("Congratulations YOU GOT 5% HIKE !!! \n \n");
}
else
{
 
 System.out.println("Salary :"+Salary);
 System.out.println("No Hike This Time... Better Luck NextTime !!! \n \n");
}
System.out.println("Do you want to Check Salary of EMPLOYEE with hike....Press 1");
check=get.nextInt();
}while(check==1);
}
}