import static utils.print.*;

interface SportsTypes{
  public void getSportName();

}

class Cricket implements SportsTypes{
    public void getSportName(){
      ln("Sports name: cricket");
    }   

}

class Football implements SportsTypes{
  public void getSportName(){
    ln("sport name: football");
  }
}
public class Sports {

  public static void main(String[]args){

    SportsTypes s1 = new Cricket();
    SportsTypes s2  = new Football();

    s1.getSportName();
    s2.getSportName();

  }
  
}
