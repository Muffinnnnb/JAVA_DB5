package MyPackage;

public class Introduce {

	String full_sentence="";
	
	public String Intro(String name,int age,double height) {
		full_sentence=
		"안녕하십니까?<br>"+
		"제 이름은 "+name+"입니다.<br>"+
		"나이는 "+age+"살 이고<br>"+
		"키는 "+height+"cm 입니다.<br>";
		
		return full_sentence;
	
	}
}
