import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[10];
		int i;
		double sum=0;
		System.out.println("������10������ƽ��ֵ��");
		for(i=0;i<10;i++)
		{
			Scanner input =new Scanner(System.in);
			a[i]=input.nextInt();
		}
		for(int b:a)
		{
			System.out.print(b+" ");
		}
		for(i=0;i<10;i++)
		{
			sum+=a[i];
		}
		System.out.println("��average="+sum/10);
	}

}
