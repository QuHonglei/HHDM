//���췽����Բ������������ð뾶������뾶��
//����ε���������ó��Ϳ������
//�����ε�����������ϵף��µ׺͸ߣ������
public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle circle = new Circle();//ʵ��������
		circle.setR(2);//���ð뾶Ϊ2
		circle.getR();
		circle.getArea();
		System.out.println("-------Բ--------");
		System.out.println("�뾶��"+circle.getR()+" ");
		System.out.println("�����"+circle.getArea()+" ");
		Rect rect = new Rect();//ʵ��������
		rect.setA(2);//����
		rect.setB(2);
		rect.getA();
		rect.getB();
		rect.getArea();
		System.out.println("--------����-------");
		System.out.println("����"+rect.getA()+" ");
		System.out.println("��"+rect.getB()+" ");
		System.out.println("�����"+rect.getArea()+" ");
		Tx tx = new Tx();
		tx.setA(2);//����
		tx.setB(2);
		tx.setH(3);
		tx.getA();
		tx.getB();
		tx.getH();
		tx.getArea();
		System.out.println("--------����--------");
		System.out.println("�ϵף�"+tx.getA()+" ");
		System.out.println("�µף�"+tx.getB()+" ");
		System.out.println("�ߣ�"+tx.getH()+" ");
		System.out.println("�����"+tx.getArea()+" ");
	}

}
