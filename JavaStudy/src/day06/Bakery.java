package day06;

import javax.swing.JOptionPane;

public class Bakery {

	public static void main(String[] args) {
		BreadPlate bread = new BreadPlate();
		BreadMaker maker = new BreadMaker(bread);
		
		String main_options[] = {"���Ա�", "���� �� ���������� ��������"};
		int choice = 0;
		
		maker.start();
		
		do {
			JOptionPane.showOptionDialog(null, "bakery", "bakery",
					JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, main_options, null);
		
			if (choice == 0) {
				//����� ���� �ִ� ���� �Ծ�����Ѵ�.
				maker.getBread().eatBread();
			}else {
				break;
			}
		} while (true);
	
	}

}
