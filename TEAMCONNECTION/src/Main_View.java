import java.util.Scanner;

public class Main_View {

	public static void main(String[] args) {

		DB_Connection db = new DB_Connection();
		Scanner sc = new Scanner(System.in);
		
		int choice1 = 0;
		int choice2 = 0;
		int choice3 = 0;
				
		MenuClass.first();
		choice1 = sc.nextInt();
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
		
		MenuClass.second();
		choice2 = sc.nextInt();
		
		do {
			if(choice2==1) {
				System.out.println("12시에 시작하는 영화를 선택하셨습니다. ");
				System.out.println("");
			}else if(choice2==2) {
				System.out.println("15시에 시작하는 영화를 선택하셨습니다. ");
				System.out.println("");
			}else if(choice2==3) {
				System.out.println("18시에 시작하는 영화를 선택하셨습니다. ");
				System.out.println("");
			}else if(choice2==4) {
				System.out.println("21시에 시작하는 영화를 선택하셨습니다. ");
				System.out.println("");
			}else {
				System.out.println("잘 못 입력하셨습니다.");
				System.out.println("다시 입력하세요.");
				choice2 = sc.nextInt();
				System.out.println("");
			}
		}while(choice2<1 || choice2>4);
		
		MenuClass.third();

		if(choice1==1 && choice2==1) {
			db.Seat12();
		}else if(choice1==1 && choice2==2) {
			db.Seat15();
		}else if(choice1==1 && choice2==3) {
			db.Seat18();
		}else if(choice1==1 && choice2==4) {
			db.Seat21();
		}else if(choice1==2 && choice2==1) {
			db.bseat12();
		}else if(choice1==2 && choice2==2) {
			db.bseat15();
		}else if(choice1==2 && choice2==3) {
			db.bseat18();
		}else if(choice1==2 && choice2==4) {
			db.bseat21();
		}else if(choice1==3 && choice2==1) {
			db.cseat12();
		}else if(choice1==3 && choice2==2) {
			db.cseat15();
		}else if(choice1==3 && choice2==3) {
			db.cseat18();
		}else if(choice1==3 && choice2==4) {
			db.cseat21();
		}else if(choice1==4 && choice2==1) {
			db.dseat12();
		}else if(choice1==4 && choice2==2) {
			db.dseat15();
		}else if(choice1==4 && choice2==3) {
			db.dseat18();
		}else if(choice1==4 && choice2==4) {
			db.dseat21();
		}
		
		choice3 = sc.nextInt();
		int choice4 = choice3;
		
		if(choice1==1 && choice2==1) {
			db.Insert_Note12(choice3,choice4);
		}else if(choice1==1 && choice2==2) {
			db.Insert_Note15(choice3,choice4);
		}else if(choice1==1 && choice2==3) {
			db.Insert_Note18(choice3,choice4);
		}else if(choice1==1 && choice2==4) {
			db.Insert_Note21(choice3,choice4);
		}else if(choice1==2 && choice2==1) {
			db.Insert_Noteb12(choice3,choice4);
		}else if(choice1==2 && choice2==2) {
			db.Insert_Noteb15(choice3,choice4);
		}else if(choice1==2 && choice2==3) {
			db.Insert_Noteb18(choice3,choice4);
		}else if(choice1==2 && choice2==4) {
			db.Insert_Noteb21(choice3,choice4);
		}else if(choice1==3 && choice2==1) {
			db.Insert_Notec12(choice3,choice4);
		}else if(choice1==3 && choice2==2) {
			db.Insert_Notec15(choice3,choice4);
		}else if(choice1==3 && choice2==3) {
			db.Insert_Notec18(choice3,choice4);
		}else if(choice1==3 && choice2==4) {
			db.Insert_Notec21(choice3,choice4);
		}else if(choice1==4 && choice2==1) {
			db.Insert_Noted12(choice3,choice4);
		}else if(choice1==4 && choice2==2) {
			db.Insert_Noted15(choice3,choice4);
		}else if(choice1==4 && choice2==3) {
			db.Insert_Noted18(choice3,choice4);
		}else if(choice1==4 && choice2==4) {
			db.Insert_Noted21(choice3,choice4);
		}
				
	}

}
