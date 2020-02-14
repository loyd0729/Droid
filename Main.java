
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Droid droid = new Droid();
		System.out.println(droid.toString());
		int batteryTo = droid.energyReport(100) - droid.reducingLevel(10);
		int reduceBattAgain = batteryTo - droid.reducingLevel(10);
		droid.performTask("dancing");
		System.out.println(batteryTo);
		System.out.println("After another task the battery level went down to " + reduceBattAgain);
	}

}
