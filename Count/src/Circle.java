
public class Circle {
	private double r;
	Circle(){
		//默认构造方法
	}
	void Cricle(double r){//带参构造方法
		this.r=r;
	}
	double getArea()//求面积
	{
		return 3.14159*r*r;
	}
	public void setR(double r)//设置半径r
	{
		this.r=r;
	}
	public double getR()//输出半径r
	{
		return r;
	}
}
