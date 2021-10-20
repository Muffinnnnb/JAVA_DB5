package controller;

import java.util.ArrayList;
import java.util.Scanner;

import dao.MovieMemberDAO;
import dto.MovieMemberVO;
import service.MovieMemberService;

public class Main_Controller {

	public static void main(String[] args) {
		ArrayList<MovieMemberVO> dtos;
		MovieMemberService service = new MovieMemberService();
		Scanner sc = new Scanner(System.in);
		dtos=service.getInform();
		
		int choice1=0;
		int choice2=0;
		int choice3=0;
		int choice4=0;
		
		menu1();
		
		choice1=sc.nextInt();
		do {
			if(choice1==1) {
				System.out.println("a영화를 선택하셨습니다. ");
				System.out.println("");
			}else if(choice1==2) {
				System.out.println("b영화를 선택하셨습니다. ");
				System.out.println("");
			}else if(choice1==3) {
				System.out.println("c영화를 선택하셨습니다. ");
				System.out.println("");
			}else if(choice1==4) {
				System.out.println("d영화를 선택하셨습니다. ");
				System.out.println("");
			}else {
				System.out.println("잘 못 입력하셨습니다.");
				System.out.println("다시 입력하세요.");
				choice1 = sc.nextInt();
				System.out.println("");
			}
		}while(choice1<1 || choice1>4);
		
		menu2();
		
		choice2=sc.nextInt();
		do {
			if(choice2<20 && choice2>0) {
				System.out.println("미성년자입니다. ");
				System.out.println("");				
			}else if(choice2>=20) {
				System.out.println("성인입니다. ");
				System.out.println("");	
			}else {
				System.out.println("잘 못 입력하셨습니다.");
				System.out.println("다시 입력하세요.");
				choice2 = sc.nextInt();
				System.out.println("");
			}
		}while(choice2<=0);
		
		menu3();
		
		choice3=sc.nextInt();
		do {
			if(choice3==1) {
				System.out.println("12:00~14:30 타임을 선택하였습니다. ");
				System.out.println("");
			}else if(choice3==2) {
				System.out.println("15:00~17:30 타임을 선택하였습니다. ");
				System.out.println("");
			}else if(choice3==3) {
				System.out.println("18:00~20:30 타임을 선택하였습니다. ");
				System.out.println("");
			}else {
				System.out.println("잘 못 입력하셨습니다.");
				System.out.println("다시 입력하세요.");
				choice3 = sc.nextInt();
				System.out.println("");
			}
		}while(choice3>3 || choice3<1);
		
		menu4();
		
		for(int i=0;i<dtos.size();i++) {
			MovieMemberVO VO = dtos.get(i);
			String title = VO.getTitle();
			int Age_limit = VO.getAge_limit();
			int Movie_time = VO.getMovie_time();
			int Seat = VO.getSeat();
			
			System.out.println(Seat+"번 자리 매진");
		}
		
		choice4=sc.nextInt();
		do {
			if(choice4<11 && choice4>0) {
				System.out.printf("%d번 좌석을 선택하셨습니다. ", choice4);
			}else {
				System.out.println("잘 못 입력하셨습니다.");
				System.out.println("다시 입력하세요.");
				choice3 = sc.nextInt();
				System.out.println("");
			}
		}while(choice4>10 || choice4<1);
	}
	
	public static void menu1() {
		System.out.println("어떤 영화를 보시겠습니까? ");
		System.out.println("1.a 2.b 3.c 4.d(19금)");
	}
	public static void menu2() {
		System.out.println("나이를 입력하세요.");
	}
	public static void menu3() {
		System.out.println("영화시간을 고르세요. ");
		System.out.println("1. 12:00~14:30");
		System.out.println("2. 15:00~17:30");
		System.out.println("3. 18:00~20:30");
	}
	public static void menu4() {
		System.out.println("|1||2| |3||4| |5||6| |7||8| |9||10|");
		System.out.println("좌석번호를 고르세요. ");
		System.out.println("1~10");
	}
}
