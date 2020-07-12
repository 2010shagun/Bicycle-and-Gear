
public class Gear {
	double chainring, cog, rim, tire;
	public Gear(double chainring, double cog, double rim, double tire) {
		this.chainring=chainring;
		this.cog=cog;
		this.rim=rim;
		this.tire=tire;
	}
	public double getCog() { return cog; }
	public double getChainring() { return chainring; }
	public double getRim() { return rim;}
	public double getTire() { return tire;}
	
	public double ratio() {
		return getChainring()/getCog();
	}
	public double gear_inches() {
		return (ratio()*(getRim()+(getTire()*2)));
	}
	public static void main(String args[]) {
		Gear gear1=new Gear(52,11,26,1.5);
		Gear gear2= new Gear(52, 11, 24, 1.25);
		System.out.println(gear1.gear_inches());
		System.out.println(gear2.gear_inches());
	}
}
