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
		String born = "";
		ArrayList<MovieMemberVO> dtos;
		MovieMemberService service = new MovieMemberService();
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
				check=false;
				dtos = service.getAllMembers();
				System.out.print("아이디 입력 >>");
				id = sc.next();
				for (int i = 0; i < dtos.size(); i++) {
					if (dtos.get(i).getID().equals(id)) { // getid와 id가 일치하면
						System.out.println("현재 사용중인 아이디입니다.");
						check=true; // check가 true가 되고 break;
						break;
					}
				}
				if (check==false) { // check가 false라면 가입진행
					System.out.print("비밀번호 입력 >>");
					pw = sc.next();
					System.out.print("생년월일 입력(yyyy-MM-dd) >>");
					born = sc.next();
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
				check = false; // 로그인 체크를 위한 bool타입
				dtos = service.getAllMembers();
				System.out.println("아이디 입력 >>");
				id = sc.next();
				System.out.println("비밀번호 입력 >>");
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
				} else
					System.out.println("로그인 성공!");

				subMenu();
				logchoice = sc.nextInt();
				if (logchoice == 0) { // 로그아웃
					break;
				}
				switch (logchoice) {
				case 1:
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
		System.out.println("1.회원가입");
		System.out.println("2.탈퇴");
		System.out.println("3.로그인");
		System.out.println("0.종료");

	}

	public static void subMenu() {

	}
}
