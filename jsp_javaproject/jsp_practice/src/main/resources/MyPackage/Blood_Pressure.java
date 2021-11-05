package MyPackage;

public class Blood_Pressure {

	int choice=0;
	
	public int BP_Check(int bp_c,int bp_r) {
		if(bp_c>140||bp_r>90) {
			choice=1;
		}else if((139>=bp_c && bp_c>=120)||(89>=bp_r && bp_r>=80)) {
			choice=2;
		}else if((120>bp_c && bp_c>=90)||(80>=bp_r && bp_r>=60)) {
			choice=3;
		}else if(bp_c<90||bp_r<60) {
			choice=4;
		}return choice;
	}
}
