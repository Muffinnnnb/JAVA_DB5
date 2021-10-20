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
		String loginID="";
		ArrayList<MovieMemberVO> dtos;
		ArrayList<MovieVO> dtos2;
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
					System.out.println("삭제할 아이디 혹은 비밀번호를 다시 확인해주세요.");
				} else
					System.out.println("삭제 완료.");

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
					loginID=id; // 로그인성공한 id를 loginID에 저장
				}

				subMenu();// 로그인 이후 서브메뉴 (정보조회,예약 등)
				logchoice = sc.nextInt();
				if (logchoice == 0) { // 로그아웃
					break;
				}
				int num=0;
				switch (logchoice) {
				case 1:
					//정보조회
					num=0;
					check=false;
					System.out.print("비밀번호 입력 >>");
					pw=sc.next();
					for(int i=0; i<dtos.size();i++) {
						if (dtos.get(i).getID().equals(loginID)) {
							if (dtos.get(i).getPW().equals(pw)) {
								check = true;
								num=i; // num에 로그인했던 아이디의 index값을 저장
							}
						}
					}
					if(check==true) {						
						System.out.printf("아이디:%s\n", dtos.get(num).getID());
						System.out.printf("비밀번호:%s\n", dtos.get(num).getPW());												
						System.out.printf("나이:%d\n", dtos.get(num).getBorn());
						System.out.println();
					}else {
						System.out.println("비밀번호를 다시 확인해주세요.");
					}
					break;
				case 2:
					dtos2 = service2.getAllTitles();
					
					System.out.print("출력 >> \n");
					for(int i=0; i<dtos2.size();i++) {
						if (dtos2.get(i).getSeat()==0) {
							System.out.printf("제목:%s\n", dtos2.get(i).getTitle());
							System.out.printf("제한 연령:%s\n", dtos2.get(i).getAge_limit());
							System.out.printf("시간:%s\n\n", dtos2.get(i).getMovie_time());
							}
						}
					
					break;
					
				case 3:
					
					break;
				}

				break;

			}
		}

	}

	public static void Menu() {
		System.out.println("1.회원가입");
		System.out.println("2.탈퇴");
		System.out.println("3.로그인");
		System.out.println("0.종료");

	}

	public static void subMenu() {
		System.out.println("1.회원정보조회");
		
		
		
		System.out.println("2.상영중인 영화 목록");
		
	}
	
	
	
	
	
	
	
	
	
}
