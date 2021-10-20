package controller;

import java.util.ArrayList;
import java.util.Scanner;

import dto.MovieMemberVO;
import dto.MovieVO;
import service.MovieMemberService;
import service.MovieService;

public class Main_Controller {

	public static void main(String[] args) {
		boolean check = false;
		int choice = 0;
		int logchoice = 0;
		String id = "";
		String pw = "";
		int born = 0;
		String loginID = "";
		String title = "";
		ArrayList<MovieMemberVO> dtos; // ȸ��������
		ArrayList<MovieVO> dtos2; // ��ȭ������
		MovieMemberService service = new MovieMemberService();
		MovieService service2 = new MovieService();
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
					System.out.println("Ż���� ���̵� Ȥ�� ��й�ȣ�� �ٽ� Ȯ�����ּ���.");
				} else
					System.out.println("Ż�� �Ϸ�.");

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
					loginID = id; // �α��μ����� id�� loginID�� ����
				}
				while (true) {
					subMenu();// �α��� ���� ����޴� (������ȸ,���� ��)
					logchoice = sc.nextInt();
					if (logchoice == 0) { // �α׾ƿ�
						break;
					}
					switch (logchoice) {
					case 1:
						// ������ȸ
						int num = 0;
						check = false;
						System.out.print("��й�ȣ �Է� >>");
						pw = sc.next();
						for (int i = 0; i < dtos.size(); i++) {
							if (dtos.get(i).getID().equals(loginID)) {
								if (dtos.get(i).getPW().equals(pw)) {
									check = true;
									num = i; // num�� �α����ߴ� ���̵��� index���� ����
								}
							}
						}
						if (check == true) {
							System.out.printf("���̵�:%s\n", dtos.get(num).getID());
							System.out.printf("��й�ȣ:%s\n", dtos.get(num).getPW());
							System.out.printf("����:%d\n", dtos.get(num).getBorn());
							System.out.println();
						} else {
							System.out.println("��й�ȣ�� �ٽ� Ȯ�����ּ���.");
						}
						break;
					case 2:
						// ��ȭ ����
						int seatchoice=0;
						String timeSelect="";
						System.out.println("===== ���� ������ ��ȭ ��� =====");
						dtos2 = service2.getAllMovie();
						int j = 1; 
						int k = 1; // j=�ܼ�â�� �������� ��ȭ ���� k=�ߺ����� �ʴ� ��ȭ�������
						for (int i = 1; i < 5; i++) {
							System.out.print(j + "." + dtos2.get(k).getTitle() + " ");
							j++; 
							k += 3;
						}
						System.out.println();
						System.out.print("������ ��ȭ�� ��ȣ >>");
						choice = sc.nextInt();
						System.out.println();
						if (choice == 1) { // ���� �Է����� ��ȭ����
							title ="�μ���";
						} else if (choice == 2) {
							title = "ŷ����";
						} else if (choice == 3) {
							title = "�ܿ�ձ�";
						} else if (choice == 4) {
							title = "�����";
						} else {
							System.out.println("��ȭ��ȣ�� �ٽ� Ȯ�����ּ���.");
							break;
						}
						for (int i = 0; i < 3; i++) {
							System.out.println(dtos2.get(i).getMovie_Time().substring(11, 19));
						} // �ú��ʸ� ������ ���ڿ��� �ڸ�

						System.out.print("���Ͻô� �ð��� �Է����ּ��� >>");
						String timechoice = sc.next();
						System.out.println();
						System.out.println("|     S C R E E N     |");
						System.out.println();
						for (int i = 0; i < dtos2.size(); i++) {
							if (dtos2.get(i).getTitle().equals(title)) {
								if (dtos2.get(i).getMovie_Time().contains(timechoice)) {
									timeSelect=dtos2.get(i).getMovie_Time(); // timeSelect�� ��ȭ�ð����� ����
									if (dtos2.get(i).getReserved() != 0) { // �̹� ������ִٸ� ���ڴ�� *�� ǥ��
										System.out.print(" |*|");
									} else if (dtos2.get(i).getReserved() == 0) {
										int seat = dtos2.get(i).getSeat(); // db�¼������� seat�� ����
										if (seat == 6) { // �ܼ�â �ٹٲ�
											System.out.println();
										}
										if(seat!=0) { // ���̽�Ʈ�Ǻ�
										System.out.print(" |" + seat + "|");
									}
								}
								}
							}
						
						}System.out.println("\n");
						System.out.print("'*'ǥ�ð� ���� �ڸ���ȣ�� �Է����ּ��� >>");
						seatchoice=sc.nextInt();
						dtos2=service2.UpdateMovieReserved(title,timeSelect,seatchoice);
						
						

						break;
					case 3:
						break;
					}
				}
				break;
			}
		}sc.close();
	}

	public static void Menu() {
		System.out.println("1.ȸ������");
		System.out.println("2.Ż��");
		System.out.println("3.�α���");
		System.out.println("0.����");

	}

	public static void subMenu() {
		System.out.println();
		System.out.println("1.ȸ��������ȸ");
		System.out.println("2.��ȭ����");
	}
}
