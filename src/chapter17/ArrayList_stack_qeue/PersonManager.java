package chapter17.ArrayList_stack_qeue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PersonManager {
	
	public void personMgr() {
		int select;
		Person p;
		
		//person�� ��ü�� ������ �� �ִ� ArrayList�� ����(personArr)
		ArrayList<Person> personArr=new ArrayList<Person>();
		
		while(true) {
			System.out.println("1.�����߰�");
			System.out.println("2.��������");
			System.out.println("3.��ü����");
			System.out.println("4.����");
			System.out.print("�׸��� : ");
			
			Scanner scan=new Scanner(System.in);
			select=scan.nextInt();
			
			switch(select) {
			
			case 1: //�����߰�
				p=new Person(); 
				System.out.println("-----�����߰�-----");
				
			    System.out.print("�̸� : ");
			    p.setName(scan.next());
			    
			    System.out.print("���� : ");
			    p.setAge(scan.nextInt());
			    
			    System.out.print("��ȭ��ȣ : ");
			    p.setTel(scan.next());
			    
			    personArr.add(p);
			    System.out.println("ȸ�������� �Ϸ� �Ǿ����ϴ�");
			    System.out.println("----------------------------");
			    break;
			    
			case 2: //��������
				System.out.println("-----��������-----");
				System.out.print("������ ������ �̸� : ");
				String name=scan.next();
				
				for(int i=0;i<personArr.size();i++) {
					if((personArr.get(i).getName()).equals(name)) {
						personArr.remove(i);
						System.out.println(name+"���� ������ �����մϴ�");
						break;
					}else {
						if(i+1==personArr.size())
							System.out.println(name+"����(��) �������� �ʽ��ϴ�");
					}//if
				}//for 
			    break;
			    
			case 3://��ü����
				System.out.println("-----��ü����-----");
				System.out.println("����ο� "+personArr.size()+"��");
				/*
				for(int i=0;i<personArr.size();i++) {
					System.out.println("�̸� : "+personArr.get(i).getName());
					System.out.println("���� : "+personArr.get(i).getAge());
					System.out.println("��ȭ��ȣ : "+personArr.get(i).getTel());
				}
				*/
				Iterator<Person> it=personArr.iterator();
				while(it.hasNext()) {
					p=it.next();
					System.out.println("�̸� : "+p.getName());
					System.out.println("���� : "+p.getAge());
					System.out.println("��ȭ��ȣ : "+p.getTel());
				}
				break;
				
			default :
				System.out.println("���α׷� ����");
				return;
			}//switch
		}//while
	}//method

}//class
