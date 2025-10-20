

import static utils.print.*;

class Person{
  String name;
  int age;

   void personDetails(String name,int age){
    this.name  =  name;
    this.age = age;
  }

   void displayPersonDetails(){
    ln("name: " + name );
    ln("age: " + age);
   
  }
}

class Student extends Person{
  String course;
  int year;

  void studentDetails(String course,int year){
    this.course = course;
    this.year  = year;
  }


  void displayStudentDetails(){
      ln("<---Student--->"); 
      displayPersonDetails();
      ln("current course: " + course);
      ln("pursuing year: " + year);
   }
}

class GraduateStudent extends Student{
  String specialization;

  void graduateDetails(String specialization){
    this.specialization = specialization;
  }

  void displayGraduateDetails(){
    ln("<---graduate--->");
    displayPersonDetails();
    ln("specialization: " + specialization);
  }
}

class Teacher extends Person{

  String subject;

  void teacherDetails(String subject){
    this.subject = subject;
  }

  void displayTeacherDetails(){
    ln("<---teacher--->");
    displayPersonDetails();
    ln("subject: " + subject);
  }
}

public class inheritance {

  public static void main(String[]args){

    Student s1 = new Student();
    s1.studentDetails("computer engineering",2);
    s1.personDetails("hobbit", 12);
    s1.displayStudentDetails();
    
    GraduateStudent gs1 = new GraduateStudent();
    gs1.graduateDetails("AIML");
    gs1.personDetails("ye",25 );
    gs1.displayGraduateDetails();

    Teacher t1  =  new Teacher();
    t1.personDetails("marshall", 40);
    t1.teacherDetails("rap 101");
    t1.displayTeacherDetails();
  }
  
}
