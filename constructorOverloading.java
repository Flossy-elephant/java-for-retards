import static utils.print.*;

class Student{
  String name;
  int age;
  String course;
  
  Student(String name){
    this.name = name;
  }

  Student(String name,int age){
    this(name);
    this.age = age;
  }

  Student(String name,int age,String course){
    this(name,age);
    this.course = course;
  }

  public void displayDetails(){
    ln("name: " + name);
    ln("age: "+ age);
    ln("course: "+ course);
  }

}

public class constructorOverloading {

  public static void main(String[]args){
  Student s1 = new Student("pinnochio");
  Student s2 = new Student("robin",69);
  Student s3  = new Student("damian wayne",13,"saving gotham city");

  s1.displayDetails();
  s2.displayDetails();
  s3.displayDetails();
  }
  
}
