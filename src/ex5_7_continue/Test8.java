package ex5_7_continue;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str;
		
		/*switch(str){
		case "서울":
			System.out.println("서울입니다.");
			break;
		case "부산":
			System.out.println("부산입니다.");
			break;
		case "대전":
			System.out.println("대전입니다.");
			break;
		case "대구":
			System.out.println("대구입니다.");
			break;
		case "제주도":
			System.out.println("제주도입니다.");
			break;
		case "q":
			System.out.println("종료합니다.");
			break;
		default:
			System.out.println("그 외지역입니다.");
		}*/
		
		do {
			System.out.println("지역을 입력하세요 : ");
			str=sc.nextLine();
			if(str.equals("서울")||str.equals("부산")||str.equals("대전")||str.equals("대구")||str.equals("제주도")) {
				System.out.println(str+"입니다");
			}else if(str.equals("q")) {
				System.out.println("종료합니다.");
			}else {
				System.out.println("그 외지역입니다.");
			}
		}while(!str.equals("q"));
		sc.close();
				
	}
}