public class Ea2
{
  public static void main(String args[])
 {
    Cricle1 c = new Cricle1();//实例化圆
    Jx c1= new Jx();//实例化矩形
    Tx c2= new Tx();//实例化梯形
    c.r=10;
    double s=c.area();
    System.out.println(s);
    c1.a=5;
    c1.b=6;
    double s1=c1.area();
    System.out.println(s1);
    c2.a=1;
    c2.b=2;
    c2.h=2;
    double s2=c2.area();
    System.out.println(s2);
  }
}