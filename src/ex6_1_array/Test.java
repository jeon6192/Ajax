package ex6_1_array;

public class Test {
	public static void main(String[] args) { 
		String name[] = {"��ȣ��", "�̽±�", "���缮", "����","�̱���"};
		String sub_name[] = {"����", "����","����","����","���"};
	        int [][]score = { { 85,  60,  70},   //0��(��ȣ��)
				  { 90,  95,  80},   //1��(�̽±�)
				  { 75,  80, 100},   //2��(���缮)
	              { 80,  70,  95},   //3��(����)
				  {100,  65,  80}    //4��(�̱���)
				};
	         int [] subject = new int[3]; //�������� ���� 
	         int [] student = new int[5]; //�л��� ���� ����
	         int [] avg=new int[5];
	         //    subject[0]=0, student[0]=0;
	         //    subject�� student�� �ʱⰪ 0���� ������
	        
	        for(int i=0;i<score.length;i++) {
	        	for(int j=0;j<score[i].length;j++) {
	        		// 0,0  0,1  0,2  1,0  1,1  1,2  2,0  2,1  2,2
	        		student[i]+=score[i][j];
	        		subject[j]+=score[i][j];
	        	}
	        	avg[i]=student[i]/3;
	        }
	        /*System.out.println("�� ���� �������ϱ� ");
	        for(int i=0;i<sub_name.length-2;i++) {
	        	System.out.println(sub_name[i]+"�� ���� : "+subject[i]);
	        }
	        System.out.println("\n�л��� �������ϱ�");
	        for(int i=0;i<name.length;i++) {
	        	System.out.println(name[i]+"�� ���� : "+student[i]);
	        	avg[i]=student[i]/3;
	        }*/
	        
	        System.out.println("=========== �л��� / ���� ���� ���ϱ� ===========");
	        System.out.print("\t");
	        for(int i=0;i<sub_name.length;i++) {
	        	System.out.print(sub_name[i]+"\t");
	        }
	        System.out.println();
	        for(int i=0;i<5;i++) {
	        	System.out.print(name[i]+"\t");
	        	for(int j=0;j<3;j++) {
	        		System.out.print(score[i][j]+"\t");
	        	}
	        	System.out.print(student[i]+"\t"+avg[i]);
	        	System.out.println();
	        }
	        System.out.println("===========================================");
	        System.out.print("����");
	        for(int i=0;i<3;i++) {
        		System.out.print("\t"+subject[i]);
        	}
	        
	}
}