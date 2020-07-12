
public class Gear {
	double chainring, cog;
	public Gear(double chainring, double cog) {
		this.chainring=chainring;
		this.cog=cog;
	}
	public double ratio() {
		return chainring/cog;
	}
	public static void main(String args[]) {
		Gear gear1=new Gear(52,11);
		Gear gear2= new Gear(30, 27);
		System.out.println(gear1.ratio());
		System.out.println(gear2.ratio());
	}
}
