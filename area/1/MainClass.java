public class MainClass
{
 public static void main(String args[])
 {
  Teacher t = new Teacher();
  Student s =new Student();
  double add=t.add(10,5);
  double sub=t.sub(10,5);
  System.out.println(add+","+sub);
  s.speak();
  }

}