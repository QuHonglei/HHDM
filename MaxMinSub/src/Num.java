import java.util.Scanner;


public class Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= new int[5];
		//int[] a={5,3,6,4,7};
		int i;
		Scanner in =new Scanner(System.in);
		for(i=0;i<5;i++)
		{
			a[i]=in.nextInt();
		}
		int max=a[0],min=a[0],sub=0,b;
		for(i=0;i<5;i++)
		{
				if(max<a[i])
				{
					max=a[i];
				}
				if(min>a[i])
				{
					min=a[i];
				}
		}
		for(int c:a)
		{
			System.out.print(c+" ");
		}
		System.out.println();
		sub=max-min;
		System.out.println("max="+max);
		System.out.println("min="+min);
		System.out.println("sub="+sub);
		
	}
}
