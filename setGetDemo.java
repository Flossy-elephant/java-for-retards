class Shape{
private String name;

Shape(String name){
 this.name = name;
}

public void setName(String name){
 this.name = name;
}

public String getName(){
 return name;
}


}


public class setGetDemo{

public static void main(String[]args){
Shape s = new Shape("circle");

System.out.println("initial details: " + s.getName());

s.setName("triangle");

System.out.println("updated details: " + s.getName());
}

}