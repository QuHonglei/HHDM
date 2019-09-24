//构造方法求圆的面积，并设置半径，输出半径。
//求矩形的面积，设置长和宽，并输出
//求梯形的面积，设置上底，下底和高，并输出
public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle circle = new Circle();//实例化对象
		circle.setR(2);//设置半径为2
		circle.getR();
		circle.getArea();
		System.out.println("-------圆--------");
		System.out.println("半径："+circle.getR()+" ");
		System.out.println("面积："+circle.getArea()+" ");
		Rect rect = new Rect();//实例化对象
		rect.setA(2);//调用
		rect.setB(2);
		rect.getA();
		rect.getB();
		rect.getArea();
		System.out.println("--------矩形-------");
		System.out.println("长："+rect.getA()+" ");
		System.out.println("宽："+rect.getB()+" ");
		System.out.println("面积："+rect.getArea()+" ");
		Tx tx = new Tx();
		tx.setA(2);//调用
		tx.setB(2);
		tx.setH(3);
		tx.getA();
		tx.getB();
		tx.getH();
		tx.getArea();
		System.out.println("--------梯形--------");
		System.out.println("上底："+tx.getA()+" ");
		System.out.println("下底："+tx.getB()+" ");
		System.out.println("高："+tx.getH()+" ");
		System.out.println("面积："+tx.getArea()+" ");
	}

}
