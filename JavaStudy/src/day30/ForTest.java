package day30;

public class ForTest {
	public static void main(String[] args) {
		 // ������ 1�� ~ 9�ܱ��� for��
		for (int i = 0; i < 90; i++) {
			if (i%10 == 0) {
				i++;
				System.out.println();
			}
			System.out.printf("%d*%d=%d\n",(i/10)+1,i%10,((i/10)+1)*(i%10));
		}
	}
}