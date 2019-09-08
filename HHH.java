import java.util.Scanner;
public class HHH 
{
	public static float max(float a,float b)
	{
		if(a>b)return a;
		return b;
	}
	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		System.out.println("你好，请输入两个数比较大小");
		Scanner s =new Scanner(System.in);
		float a=12,b=13,c;
		a=s.nextFloat();
		b=s.nextFloat();
		c=max(a,b);
		System.out.println("max="+c);
		
		
	}

}
