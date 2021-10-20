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
		ArrayList<MovieMemberVO> dtos; // 회원정보용
		ArrayList<MovieVO> dtos2; // 영화정보용
		MovieMemberService service = new MovieMemberService();
		MovieService service2 = new MovieService();
		Scanner sc = new Scanner(System.in);
		System.out.println("┏                                         ┒");
		System.out.println("              영화 예약 프로그램 ");
		System.out.println("┖                                         ┚");

		while (true) {
			Menu();
			choice = sc.nextInt();
			if (choice == 0) { // 종료
				break;
			}
			switch (choice) {
			case 1:
				// 회원가입
				check = false; // 아이디 중복 체크를 위한 bool타입
				dtos = service.getAllMembers();
				System.out.print("아이디 입력 >>");
				id = sc.next();
				for (int i = 0; i < dtos.size(); i++) {
					if (dtos.get(i).getID().equals(id)) { // getid와 id가 일치하면
						System.out.println("현재 사용중인 아이디입니다.");
						check = true; // check가 true가 되고 break;
						break;
					}
				}
				if (check == false) { // check가 false라면 가입진행
					System.out.print("비밀번호 입력 >>");
					pw = sc.next();
					System.out.print("나이 입력 >>");
					born = sc.nextInt();
					dtos = service.insertMovieMembers(id, pw, born);
				}
				break;
			case 2:
				// 탈퇴
				check = false;
				System.out.print("아이디 입력 >>");
				id = sc.next();
				System.out.print("비밀번호 입력 >>");
				pw = sc.next();
				dtos = service.getAllMembers();
				for (int i = 0; i < dtos.size(); i++) {
					if (dtos.get(i).getID().equals(id)) {
						if (dtos.get(i).getPW().equals(pw)) { // id와 pw가 일치하면 삭제
							dtos = service.DeleteMovieMembers(id);
							check = true;
						}
					}
				}
				if (check == false) {
					System.out.println("탈퇴할 아이디 혹은 비밀번호를 다시 확인해주세요.");
				} else
					System.out.println("탈퇴 완료.");

				break;
			case 3:
				// 로그인
				check = false;
				dtos = service.getAllMembers();
				System.out.print("아이디 입력 >>");
				id = sc.next();
				System.out.print("비밀번호 입력 >>");
				pw = sc.next();
				for (int i = 0; i < dtos.size(); i++) {
					if (dtos.get(i).getID().equals(id)) {
						if (dtos.get(i).getPW().equals(pw)) {
							check = true;
						}
					}
				}
				if (check == false) {
					System.out.println("로그인 실패");
					System.out.println("아이디 혹은 비밀번호를 다시 확인해주세요.");
					break; // 로그인실패 전메뉴로 돌아감
				} else {
					System.out.println("로그인 성공!");
					loginID = id; // 로그인성공한 id를 loginID에 저장
				}
				while (true) {
					subMenu();// 로그인 이후 서브메뉴 (정보조회,예약 등)
					logchoice = sc.nextInt();
					if (logchoice == 0) { // 로그아웃
						break;
					}
					switch (logchoice) {
					case 1:
						// 정보조회
						int num = 0;
						check = false;
						System.out.print("비밀번호 입력 >>");
						pw = sc.next();
						for (int i = 0; i < dtos.size(); i++) {
							if (dtos.get(i).getID().equals(loginID)) {
								if (dtos.get(i).getPW().equals(pw)) {
									check = true;
									num = i; // num에 로그인했던 아이디의 index값을 저장
								}
							}
						}
						if (check == true) {
							System.out.printf("아이디:%s\n", dtos.get(num).getID());
							System.out.printf("비밀번호:%s\n", dtos.get(num).getPW());
							System.out.printf("나이:%d\n", dtos.get(num).getBorn());
							System.out.println();
						} else {
							System.out.println("비밀번호를 다시 확인해주세요.");
						}
						break;
					case 2:
						// 영화 예약
						int seatchoice=0;
						String timeSelect="";
						System.out.println("===== 현재 상영중인 영화 목록 =====");
						dtos2 = service2.getAllMovie();
						int j = 1; 
						int k = 1; // j=콘솔창에 보여지는 영화 순서 k=중복되지 않는 영화제목순서
						for (int i = 1; i < 5; i++) {
							System.out.print(j + "." + dtos2.get(k).getTitle() + " ");
							j++; 
							k += 3;
						}
						System.out.println();
						System.out.print("예매할 영화의 번호 >>");
						choice = sc.nextInt();
						System.out.println();
						if (choice == 1) { // 숫자 입력으로 영화구분
							title ="인셉션";
						} else if (choice == 2) {
							title = "킹스맨";
						} else if (choice == 3) {
							title = "겨울왕국";
						} else if (choice == 4) {
							title = "기생충";
						} else {
							System.out.println("영화번호를 다시 확인해주세요.");
							break;
						}
						for (int i = 0; i < 3; i++) {
							System.out.println(dtos2.get(i).getMovie_Time().substring(11, 19));
						} // 시분초만 나오게 문자열을 자름

						System.out.print("원하시는 시간을 입력해주세요 >>");
						String timechoice = sc.next();
						System.out.println();
						System.out.println("|     S C R E E N     |");
						System.out.println();
						for (int i = 0; i < dtos2.size(); i++) {
							if (dtos2.get(i).getTitle().equals(title)) {
								if (dtos2.get(i).getMovie_Time().contains(timechoice)) {
									timeSelect=dtos2.get(i).getMovie_Time(); // timeSelect에 영화시간정보 저장
									if (dtos2.get(i).getReserved() != 0) { // 이미 예약돼있다면 숫자대신 *로 표시
										System.out.print(" |*|");
									} else if (dtos2.get(i).getReserved() == 0) {
										int seat = dtos2.get(i).getSeat(); // db좌석정보를 seat에 저장
										if (seat == 6) { // 콘솔창 줄바꿈
											System.out.println();
										}
										if(seat!=0) { // 더미시트판별
										System.out.print(" |" + seat + "|");
									}
								}
								}
							}
						
						}System.out.println("\n");
						System.out.print("'*'표시가 없는 자리번호를 입력해주세요 >>");
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
		System.out.println("1.회원가입");
		System.out.println("2.탈퇴");
		System.out.println("3.로그인");
		System.out.println("0.종료");

	}

	public static void subMenu() {
		System.out.println();
		System.out.println("1.회원정보조회");
		System.out.println("2.영화예매");
	}
}
