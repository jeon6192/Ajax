package ncs.test1;

import java.util.Scanner;

public class GoodsTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("���� �׸��� ���� �Է��Ͻÿ�");
		System.out.print("��ǰ�� : ");
		String str=sc.nextLine();
		System.out.print("���� : ");
		int price=sc.nextInt();
		System.out.print("���� : ");
		int quan=sc.nextInt();
		
		Goods obj=new Goods(str, price, quan);
		sc.close();
		
		System.out.println("�Էµ� ����� ������ �����ϴ�.");
		System.out.println(obj.toString());
		int totalPrice=obj.getPrice()*obj.getQuantity();
		System.out.println("�� ���� ���� : "+totalPrice+" ��");
		
	}

}
