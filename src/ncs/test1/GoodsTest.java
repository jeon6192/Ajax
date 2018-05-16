package ncs.test1;

import java.util.Scanner;

public class GoodsTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("다음 항목의 값을 입력하시오");
		System.out.print("상품명 : ");
		String str=sc.nextLine();
		System.out.print("가격 : ");
		int price=sc.nextInt();
		System.out.print("수량 : ");
		int quan=sc.nextInt();
		
		Goods obj=new Goods(str, price, quan);
		sc.close();
		
		System.out.println("입력된 결과는 다음과 같습니다.");
		System.out.println(obj.toString());
		int totalPrice=obj.getPrice()*obj.getQuantity();
		System.out.println("총 구매 가격 : "+totalPrice+" 원");
		
	}

}
