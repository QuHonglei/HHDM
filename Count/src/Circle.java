
public class Circle {
	private double r;
	Circle(){
		//Ĭ�Ϲ��췽��
	}
	void Cricle(double r){//���ι��췽��
		this.r=r;
	}
	double getArea()//�����
	{
		return 3.14159*r*r;
	}
	public void setR(double r)//���ð뾶r
	{
		this.r=r;
	}
	public double getR()//����뾶r
	{
		return r;
	}
}
