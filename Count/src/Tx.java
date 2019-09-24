
public class Tx {

	private double a,b,h;
	Tx()
	{
		//默认构造方法
	}
	Tx(double a,double b,double h){//带参构造方法
		this.a=a;
		this.b=b;
		this.h=h;
	}
	double getArea(){//求面积
		return (a+b)*h/2;
	}
	public void setA(double a)
	{
		this.a=a;
	}
	public void setB(double b)
	{
		this.b=b;
	}public void setH(double h)
	{
		this.h=h;
	}
	public double getA(){
		return a;
	}
	public double getB(){
		return b;
	}
	public double getH(){
		return h;
	}
}