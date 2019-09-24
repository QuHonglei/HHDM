//构造方法求矩形的面积，设置长和宽并输出
public class Rect {//矩形

	private double a,b;//定义私有成员变量
	Rect(){
		//默认构造方法
	}
	/*void Rect(double a,double b){//带参构造方法
		this.a=a;
		this.b=b;
	}*/
	double getArea()//求面积
	{
		return a*b;
	}
	public void setA(double a)//设置长
	{
		this.a=a;
	}
	public void setB(double b)//设置宽
	{
		this.b=b;
	}
	public double getA()//输出长
	{
		return a;
	}
	public double getB()//输出宽
	{
		return b;
	}
}
