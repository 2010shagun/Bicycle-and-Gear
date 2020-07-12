

class Wheel
{
	double rim, tire;
	public Wheel(double rim, double tire) {
		this.rim=rim;
		this.tire=tire;
	}
	public double getRim() { return rim;}
	public double getTire() { return tire;}
	public double  diameter() {
		return getRim()+getTire()*2;
	}
	public double circumference() {
		return diameter()*Math.PI;
	}
	
}

public class Gear {
	double chainring, cog;
	Wheel wheel;

	public Gear(double chainring, double cog, Wheel wheel) {
		this.chainring=chainring;
		this.cog=cog;
		this.wheel = wheel;
	}

	public double getCog() { return cog; }
	public double getChainring() { return chainring; }
	
	public double ratio() {
		return getChainring()/getCog();
	}
	
	public double gear_inches() {
		return (ratio()*(wheel.diameter()));
	}
	
	public static void main(String args[]) {
		
		Gear gear1=new Gear(52,11,new Wheel(26,1.5));
		System.out.println(gear1.gear_inches());
	}
}
	

	
		
	

