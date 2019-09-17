import java.util.Scanner;


public class Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= new int[5];
		int i,j,max=a[0],min=0,sub=0,b;
		Scanner in =new Scanner(System.in);
		for(i=0;i<5;i++)
		{
			
			a[i]=in.nextInt();
		}
		for(i=0;i<5;i++)
		{
				if(a[i]>max)
				{
					max=a[i];
				}
		}
		for(int c:a)
		{
			System.out.println(c);
		}
		sub=max-min;
		System.out.println("max= "+max+"min= "+min+"sub= "+sub);
	}

}
