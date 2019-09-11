 class Cricle
{
	double r;
	double area()
	{
		return 3.14159*r*r;
	}
}
public class Ea
{
	public static void main(String args[])
	{
		Cricle c = new Cricle();
		c.r=10;
		double ar=c.area();
		System.out.println(ar);
	}

}