package controller;

import java.util.ArrayList;
import java.util.Scanner;

import dto.MovieMemberVO;
import service.MovieMemberService;

public class Main_Controller {

	public static void main(String[] args) {
		boolean check = false;
		int choice = 0;
		int logchoice = 0;
		String id = "";
		String pw = "";
		int born = 0;
		String loginID="";
		ArrayList<MovieMemberVO> dtos;
		MovieMemberService service = new MovieMemberService();
		Scanner sc = new Scanner(System.in);
		System.out.println("��                                         ��");
		System.out.println("              ��ȭ ���� ���α׷� ");
		System.out.println("��                                         ��");

		while (true) {
			Menu();
			choice = sc.nextInt();
			if (choice == 0) { // ����
				break;
			}
			switch (choice) {
			case 1:
				// ȸ������
				check = false; // ���̵� �ߺ� üũ�� ���� boolŸ��
				dtos = service.getAllMembers();
				System.out.print("���̵� �Է� >>");
				id = sc.next();
				for (int i = 0; i < dtos.size(); i++) {
					if (dtos.get(i).getID().equals(id)) { // getid�� id�� ��ġ�ϸ�
						System.out.println("���� ������� ���̵��Դϴ�.");
						check = true; // check�� true�� �ǰ� break;
						break;
					}
				}
				if (check == false) { // check�� false��� ��������
					System.out.print("��й�ȣ �Է� >>");
					pw = sc.next();
					System.out.print("���� �Է� >>");
					born = sc.nextInt();
					dtos = service.insertMovieMembers(id, pw, born);
				}
				break;
			case 2:
				// Ż��
				check = false;
				System.out.print("���̵� �Է� >>");
				id = sc.next();
				System.out.print("��й�ȣ �Է� >>");
				pw = sc.next();
				dtos = service.getAllMembers();
				for (int i = 0; i < dtos.size(); i++) {
					if (dtos.get(i).getID().equals(id)) {
						if (dtos.get(i).getPW().equals(pw)) { // id�� pw�� ��ġ�ϸ� ����
							dtos = service.DeleteMovieMembers(id);
							check = true;
						}
					}
				}
				if (check == false) {
					System.out.println("������ ���̵� Ȥ�� ��й�ȣ�� �ٽ� Ȯ�����ּ���.");
				} else
					System.out.println("���� �Ϸ�.");

				break;
			case 3:
				// �α���
				check = false;
				dtos = service.getAllMembers();
				System.out.print("���̵� �Է� >>");
				id = sc.next();
				System.out.print("��й�ȣ �Է� >>");
				pw = sc.next();
				for (int i = 0; i < dtos.size(); i++) {
					if (dtos.get(i).getID().equals(id)) {
						if (dtos.get(i).getPW().equals(pw)) {
							check = true;
						}
					}
				}
				if (check == false) {
					System.out.println("�α��� ����");
					System.out.println("���̵� Ȥ�� ��й�ȣ�� �ٽ� Ȯ�����ּ���.");
					break; // �α��ν��� ���޴��� ���ư�
				} else {
					System.out.println("�α��� ����!");
					loginID=id; // �α��μ����� id�� loginID�� ����
				}

				subMenu();// �α��� ���� ����޴� (������ȸ,���� ��)
				logchoice = sc.nextInt();
				if (logchoice == 0) { // �α׾ƿ�
					break;
				}
				switch (logchoice) {
				case 1:
					//������ȸ
					int num=0;
					check=false;
					System.out.print("��й�ȣ �Է� >>");
					pw=sc.next();
					for(int i=0; i<dtos.size();i++) {
						if (dtos.get(i).getID().equals(loginID)) {
							if (dtos.get(i).getPW().equals(pw)) {
								check = true;
								num=i; // num�� �α����ߴ� ���̵��� index���� ����
							}
						}
					}
					if(check==true) {						
						System.out.printf("���̵�:%s\n", dtos.get(num).getID());
						System.out.printf("��й�ȣ:%s\n", dtos.get(num).getPW());												
						System.out.printf("����:%d\n", dtos.get(num).getBorn());
						System.out.println();
					}else {
						System.out.println("��й�ȣ�� �ٽ� Ȯ�����ּ���.");
					}
					break;
				case 2:

					break;
				case 3:
					break;
				}

				break;

			}
		}

	}

	public static void Menu() {
		System.out.println("1.ȸ������");
		System.out.println("2.Ż��");
		System.out.println("3.�α���");
		System.out.println("0.����");

	}

	public static void subMenu() {
		System.out.println("1.ȸ��������ȸ");
	}
}
