package ex11_2_StringBuffer_StringBuilder;

public class StringBufferEx {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("동해물과 백두산이 마르고  ");
		System.out.println(sb.append("닳도록 보우하사 "));
		System.out.println(sb.insert(19, "하느님이 하느님이 "));
		System.out.println(sb.delete(24, 28));
		System.out.println(sb.deleteCharAt(9));
		System.out.println(sb.delete(0, 5).append("닳도록 보우하사 "));

	}

}
