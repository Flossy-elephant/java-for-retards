class Person{
String name;
int age;
	
Person(String name,int age){
this.name = name;
this.age = age;			
}

public void displayPersonDetails(){
System.out.println("name : " + name);
System.out.println("age: " + age);
}
	
}


class Employee extends Person{
String dept;


Employee(String name,int age,String dept){
super(name,age);
this.dept = dept;

}
public void displayEmployeeDetails(){
displayPersonDetails();
System.out.println("Department: " + dept);
}

}

class Manager extends Employee{
int XP;

Manager(String name,int age,String dept,int XP){
super(name,age,dept);
this.XP = XP;
}

public void displayManagerDetails(){
displayEmployeeDetails();
System.out.println("years of experience: " + XP);

}
}


public class inheritance2{
 public static void main(String[]args){
	Manager m1  =  new Manager("elton john",40,"IT",10);
	m1.displayManagerDetails();
	Employee e1 = new Employee("curtis waters",20,"R&D");
	e1.displayEmployeeDetails();
	
}
}