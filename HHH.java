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
		// TODO �Զ����ɵķ������
		System.out.println("��ã��������������Ƚϴ�С");
		Scanner s =new Scanner(System.in);
		float a=12,b=13,c;
		a=s.nextFloat();
		b=s.nextFloat();
		c=max(a,b);
		System.out.println("max="+c);
		
		
	}

}
