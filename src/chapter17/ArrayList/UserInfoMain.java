package chapter17.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

/*
아이디를 입력 받아서 가방에 입력한 아이디와 같은 아이디가 존재하는지 검색
같은 아이디가 있으면 다른 아이디를 입력하세요
그렇지 않으면 pwd을 입력받아서  회원가입 완료
*/
public class UserInfoMain {

	public static void main(String[] args) {
		// UserInfo클래스의 전용 가방(userArr)
		ArrayList<UserInfo> userArr = new ArrayList<UserInfo>();
		
		
		//while 
 outer:while(true) {
		//1. 아이디 입력  exit를 입력하면 종료
		System.out.print("아이디 입력(exit를 입력하면 종료) : ");
		Scanner scan=new Scanner(System.in);
		UserInfo ui=new UserInfo();
		
		String userId=scan.next();
		ui.setId(userId);
		//ui.setId(scan.next());
		
		//2. if문을 이용하여 exit가 입력되면 break;
		if(ui.getId().equals("exit")) {
			System.out.println("프로그램 종료");
			break;
		}
		//3. 입력받은 아이디와 가방의 아이디 비교하여 같은면 무시 그렇지 않으면 pwd받기
		for(int i=0;i<userArr.size();i++) {
			if(ui.getId().equals(userArr.get(i).getId())) {
				System.out.println("아이디가 중복되었습니다. 다시 입력하세요");
				continue outer;
			}
		}
		
		System.out.print("패스워드를 입력하세요 : ");
		int pass=scan.nextInt();
		ui.setPwd(pass);
		//ui.setPwd(scan.nextInt());
		//4. userArr가방에 추가
		
		userArr.add(ui);
		
		//5. 결과 확인
		for(int i=0;i<userArr.size();i++) {
			System.out.println(userArr.get(i).getId());
			System.out.println(userArr.get(i).getPwd());
			System.out.println();
		}//for
		System.out.println("=====================================");
	  }//while
    }//main
}//class
