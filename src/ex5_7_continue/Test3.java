package ex5_7_continue;

public class Test3 {

	public static void main(String[] args) {
		int i;
		int week=4;
		
		/*int[] arr=new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
        for(int a=0;a<arr.length;a++) {
        	System.out.println("\n\t\t\t"+(a+1)+"월");
            week=week%7;
            for (i=0;i<week;i++) {
                System.out.print("\t");
            }
            for (i=1;i<=arr[i];i++) {
                System.out.print(i+"\t");
                week++;
                if (week%7==0){
                    System.out.println();
                }
            }
        }*/
		
		System.out.println("\t\t\t2월");
		for (i=0;i<week;i++) {
            System.out.print("\t");
        }
        for (i=1;i<=28;i++) {
            System.out.print(i+"\t");
            week++;
            if (week%7==0){
                System.out.println();
            }
        }

        System.out.println("\n\t\t\t3월");
        week=week%7;
        for (i=0;i<week;i++) {
            System.out.print("\t");
        }
        for (i=1;i<=31;i++) {
            System.out.print(i+"\t");
            week++;
            if (week%7==0){
                System.out.println();
            }
        }
        
        System.out.println("\n\t\t\t4월");
        week=week%7;
        for (i=0;i<week;i++) {
            System.out.print("\t");
        }
        for (i=1;i<=30;i++) {
            System.out.print(i+"\t");
            week++;
            if (week%7==0){
                System.out.println();
            }
        }

        System.out.println("\n\t\t\t5월");
        week=week%7;
        for (i=0;i<week;i++) {
            System.out.print("\t");
        }
        for (i=1;i<=31;i++) {
            System.out.print(i+"\t");
            week++;
            if (week%7==0){
                System.out.println();
            }
        }
        
	}
}