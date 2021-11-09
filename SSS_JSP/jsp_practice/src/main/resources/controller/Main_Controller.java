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
		boolean loginCk;
		int choice = 0;
		int logchoice = 0;
		String id = "";
		String pw = "";
		int born = 0;
		String loginID = "";
		String title = "";
		int num = 0;
		int member_age=0;
		ArrayList<MovieMemberVO> dtos; // ȸ��������
		ArrayList<MovieVO> dtos2; // ��ȭ������
		MovieMemberService service = new MovieMemberService();
		MovieService service2 = new MovieService();
		Scanner sc = new Scanner(System.in);
		System.out.println("��                                         ��");
		System.out.println("              ��ȭ ���� ���α׷� ");
		System.out.println("��                                         ��");
		
		
		dtos2= service2. getAllMoviePoster();
		System.out.println(dtos2.size());
		String str= dtos2.get(0).getPoster();
		System.out.println(str);
		while (true) {
			Menu();
			choice = sc.nextInt();
			if (choice == 0) { // ����
				break;
			}
			do {
				loginCk=false;
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
						num = 0;
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
						int movie_age_limit=0;
						
						String[] movie_title = new String[5];
						int seatchoice = 0;
						String timeSelect = "";
						System.out.println("===== ���� ������ ��ȭ ��� =====");
						dtos2 = service2.getAllMovie();
						int j = 1;
						int k = 1; // j=�ܼ�â�� �������� ��ȭ ���� k=�ߺ����� �ʴ� ��ȭ�������
						for (int i = 1; i < 5; i++) {
							System.out.print(j + "." + dtos2.get(k).getTitle() + " ");
							movie_title[i] = dtos2.get(k).getTitle(); // ��ȭ���� �迭�� getTitle����
							j++;
							k += 3;
						}
						System.out.println();
						System.out.print("������ ��ȭ�� ��ȣ >>");
						choice = sc.nextInt();
						System.out.println();
						title = movie_title[choice];
						System.out.println(title);
						
						for(int i=0;i<dtos2.size();i++) {
							if(dtos2.get(i).getTitle()==title)
								movie_age_limit=dtos2.get(i).getAge_Limit(); //movie_age_limit�� ���ѳ��̸� ����
						}
						
						for(int i=0;i<dtos.size();i++) {
							if(dtos.get(i).getID().equals(loginID))
								member_age=dtos.get(i).getBorn(); // member_age�� ȸ�� ���̸� ����
						}
						
						if(movie_age_limit>member_age) {
							System.out.print("�ش� ��ȭ�� �󿵵���� "+movie_age_limit+"�� �̻� ���������̸�\n");
							System.out.print("ȸ������ ���̴� "+member_age+"�� �̹Ƿ� �����Ͻ� �� �����ϴ�.\n");
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
									timeSelect = dtos2.get(i).getMovie_Time(); // timeSelect�� ��ȭ�ð����� ����
									if (dtos2.get(i).getReserved() != 0) { // �̹� ������ִٸ� ���ڴ�� *�� ǥ��
										System.out.print(" |*|");
									} else if (dtos2.get(i).getReserved() == 0) {
										int seat = dtos2.get(i).getSeat(); // db�¼������� seat�� ����
										if (seat == 6) { // �ܼ�â �ٹٲ�
											System.out.println();
										}
										if (seat != 0) { // ���̽�Ʈ�Ǻ�
											System.out.print(" |" + seat + "|");
										}
									}
								}
							}
						}
						System.out.println("\n");
						System.out.print("'*'ǥ�ð� ���� �ڸ���ȣ�� �Է����ּ��� >>");
						timeSelect = timeSelect.substring(11, 19);
						seatchoice = sc.nextInt();
						dtos2 = service2.UpdateMovieReserved(title, timeSelect, seatchoice,loginID);

						break;
					case 3:
						//��ȭ��������
						dtos2 = service2.getAllMovie();
						check=false;
						System.out.print("��й�ȣ �Է� >>");
						sc.next();
						for(int i=0;i<dtos.size();i++) {
							if(dtos.get(i).getID().equals(loginID)) {
								if(dtos.get(i).getPW().equals(pw)) {
									check=true;							
								}
							}
						}							
						if(check==true) {
							System.out.println();
							System.out.printf("%s���� ��������",loginID);
							System.out.println();
							
							for(int i=0;i<dtos2.size();i++) {
								if(dtos2.get(i).getId().equals(loginID)) {
									
									System.out.println("��ȭ ���� : "+dtos2.get(i).getTitle());
									System.out.println("��ȭ �ð� : "+dtos2.get(i).getMovie_Time().substring(11,19));
									System.out.println("�¼� ��ȣ : "+dtos2.get(i).getSeat());
								}
							}										
						}						
						break;
					}
				}
				break;
			case 4:
				// ȸ����������
				check = false;
				System.out.print("���̵� �Է� >>");
				id = sc.next();
				System.out.print("��й�ȣ �Է� >>");
				pw = sc.next();
				dtos = service.getAllMembers();
				for (int i = 0; i < dtos.size(); i++) {
					if (dtos.get(i).getID().equals(id)) {
						if (dtos.get(i).getPW().equals(pw)) {
							check = true;
						}
					}
				}
				if (check == false) {
					System.out.println("���̵� Ȥ�� ��й�ȣ�� �ٽ� Ȯ�����ּ���.");
				} else {
					int aNum;
					do {
						System.out.println("1.��й�ȣ���� 2.���̺���");
						aNum = sc.nextInt();

						if (aNum == 1) {
							System.out.print("���ο� ��й�ȣ�� �Է��ϼ���. >>");
							pw = sc.next();

							dtos = service.updateMovieMembers(pw, born, id);
							System.out.println("ȸ�������� ����Ǿ����ϴ�. ");
							System.out.println("");

						} else if (aNum == 2) {
							System.out.println("���̸� �Է��ϼ���. >>");
							born = sc.nextInt();

							dtos = service.updateMovieMembers(pw, born, id);
							System.out.println("ȸ�������� ����Ǿ����ϴ�. ");
							System.out.println("");
						} else {
							System.out.println("�߸� �Է��Ͽ����ϴ�.");
							System.out.println("ó������ ���ư��ϴ�.");
							System.out.println("");
						}
					} while (aNum != 1 && aNum != 2);
				}
				break;
			case 5:
				// ��ȭ����
				System.out.println("===== ���� ������ ��ȭ ��� =====");
				dtos2 = service2.getAllMovie();
				int j = 1;
				int k = 1; // j=�ܼ�â�� �������� ��ȭ ���� k=�ߺ����� �ʴ� ��ȭ�������
				System.out.print(" ");
				for (int i = 1; i < 5; i++) {
					System.out.print(j + "." + dtos2.get(k).getTitle() + "   ");
					j++;
					k += 3;
				}
				System.out.println();
				System.out.println();
				for (int i = 0; i < 3; i++) {
					for (int z = 0;z < 4; z++) {
						System.out.print(dtos2.get(i).getMovie_Time().substring(11, 19)+"  ");
					}
					System.out.println("");
				} 

				System.out.println();
				System.out.println("��ȭ�� �����ϽǷ��� �α������ʿ��մϴ�. ");
				System.out.println("�α��� �Ͻðڽ��ϱ�? ");
				System.out.println("1.�α��� �Ѵ�. 2.�α��� ���ϰ� �����ϱ�. ");
				int logIn = sc.nextInt();
				// �α����ϸ� true�� �ٲ㼭 �ٽ� switch case3���� �Ѿ��
				
				if (logIn == 1) {
					loginCk = true;
					choice = 3;
				} else if (logIn == 2) {
					System.out.println("�����մϴ�. ");
				} else {
					System.out.println("�߸� �Է��Ͽ����ϴ�. ");
					System.out.println("�����մϴ�. ");
				}
				break;
			}
			}while(loginCk);
		}
		sc.close();
	}

	public static void Menu() {
		System.out.println("1.ȸ������");
		System.out.println("2.Ż��");
		System.out.println("3.�α���");
		System.out.println("4.ȸ����������");
		System.out.println("5.������ ��ȭ����");
		System.out.println("0.����");

	}

	public static void subMenu() {
		System.out.println();
		System.out.println("1.ȸ��������ȸ");
		System.out.println("2.��ȭ����");
		System.out.println("3.��ȭ��������");
		System.out.println("0.�α׾ƿ�");
	}
}