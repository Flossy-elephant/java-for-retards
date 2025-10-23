
 class Student {
  String name;
  int age;
  String number;
  String mail;

  public Student(String name,int age, String number,String mail){
    this.name=name;
    this.age=age;
    this.number=number;
    this.mail=mail;
  }

  public void DisplayDetails(){
    System.out.println("name: " +name);
    System.out.println("age: "+age);
    System.out.println("mail: "+mail);
    System.out.println("number: "+number);

  }
}


public class StudentDemo {
  

  public static void main(String[]args){
    Student s1 = new Student("Aarav Mehta", 20, "aarav@example.com", "9876543210");
    Student s2 = new Student("wowow Mehta", 20, "aav@example.com", "987654234210");

    System.out.println("display details: ");
    s1.DisplayDetails();
    s2.DisplayDetails();
  }
}

