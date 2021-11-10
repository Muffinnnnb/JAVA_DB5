package MyPackage;

class Car
{
	private String name;
	private int HP;
	private double fuel_eff;
	
	public Car(String n,int H,double f) {
		name=n;
		HP=H;
		fuel_eff=f;
	}
	
	public String get_name() {
		return name;		
	}
	
	public int get_HP() {
		return HP;
	}
	
	public double get_fuel_eff() {
		return fuel_eff;
	}
}

public class Truck extends Car{

	int Load;
	
	public Truck(String n,int H,double f,int L) {
		super(n,H,f);
		Load=L;
	}
	
	public void Show_Info() {
		System.out.println("차종:"+get_name());
		System.out.println("마력:"+get_HP());
		System.out.println("연비:"+get_fuel_eff()+"km/L");
		System.out.println("적재량:"+Load+"kg");
	}
}
