package ex11_3_StringTokenizer;

import java.util.StringTokenizer;

class StringTokenizerEx {
	public static void main(String[] args) {
		StringTokenizer stok=new StringTokenizer("��� �� ������");
		/*String s1=stok.nextToken();
		System.out.println(s1);
		String s2=stok.nextToken();
		System.out.println(s2);
		String s3=stok.nextToken();
		System.out.println(s3);*/
		while(stok.hasMoreTokens()) {
			String str=stok.nextToken();
			System.out.println(str);
		}
		
		StringTokenizer stok2=new StringTokenizer("���,��,������", ",");
		while(stok2.hasMoreTokens()) {
			String str=stok2.nextToken();
			System.out.println(str);
		}
		StringTokenizer stok3=new StringTokenizer("���,��|������", ",|");
		while(stok3.hasMoreTokens()) {
			String str=stok3.nextToken();
			System.out.println(str);
		}
		StringTokenizer stok4=new StringTokenizer("���=10|���ݷ�=3|������=1", "=|", true);
		while(stok4.hasMoreTokens()) {
			String str=stok4.nextToken();
			System.out.print(str+"\t");
		}
		System.out.println();
		StringTokenizer stok5=new StringTokenizer("���=10|���ݷ�=3|������=1", "=|", true);
		System.out.println("��ǰ�̸�\t��ǰ ��");
		while(stok5.hasMoreTokens()) {
			String str=stok5.nextToken();
			if(str.equals("="))	System.out.print("\t");
			else if(str.equals("|"))	System.out.print("\n");
			else System.out.print(str);
		}
	}

}
