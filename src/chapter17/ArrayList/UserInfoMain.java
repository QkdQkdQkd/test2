package chapter17.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

/*
���̵� �Է� �޾Ƽ� ���濡 �Է��� ���̵�� ���� ���̵� �����ϴ��� �˻�
���� ���̵� ������ �ٸ� ���̵� �Է��ϼ���
�׷��� ������ pwd�� �Է¹޾Ƽ�  ȸ������ �Ϸ�
*/
public class UserInfoMain {

	public static void main(String[] args) {
		// UserInfoŬ������ ���� ����(userArr)
		ArrayList<UserInfo> userArr = new ArrayList<UserInfo>();
		
		
		//while 
 outer:while(true) {
		//1. ���̵� �Է�  exit�� �Է��ϸ� ����
		System.out.print("���̵� �Է�(exit�� �Է��ϸ� ����) : ");
		Scanner scan=new Scanner(System.in);
		UserInfo ui=new UserInfo();
		
		String userId=scan.next();
		ui.setId(userId);
		//ui.setId(scan.next());
		
		//2. if���� �̿��Ͽ� exit�� �ԷµǸ� break;
		if(ui.getId().equals("exit")) {
			System.out.println("���α׷� ����");
			break;
		}
		//3. �Է¹��� ���̵�� ������ ���̵� ���Ͽ� ������ ���� �׷��� ������ pwd�ޱ�
		for(int i=0;i<userArr.size();i++) {
			if(ui.getId().equals(userArr.get(i).getId())) {
				System.out.println("���̵� �ߺ��Ǿ����ϴ�. �ٽ� �Է��ϼ���");
				continue outer;
			}
		}
		
		System.out.print("�н����带 �Է��ϼ��� : ");
		int pass=scan.nextInt();
		ui.setPwd(pass);
		//ui.setPwd(scan.nextInt());
		//4. userArr���濡 �߰�
		
		userArr.add(ui);
		
		//5. ��� Ȯ��
		for(int i=0;i<userArr.size();i++) {
			System.out.println(userArr.get(i).getId());
			System.out.println(userArr.get(i).getPwd());
			System.out.println();
		}//for
		System.out.println("=====================================");
	  }//while
    }//main
}//class
