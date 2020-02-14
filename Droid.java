
public class Droid {
	private String name;
	private int batteryLevel;
	
	
	public Droid() {
		name = "Codey";
		batteryLevel = 100;
	}
	public Droid(String name, int batteryLevel) {
		this.name = name;
		this.batteryLevel = batteryLevel;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBatteryLevel() {
		return batteryLevel;
	}
	public void setBatteryLevel(int batteryLevel) {
		this.batteryLevel = batteryLevel;
	}
	@Override
	public String toString() {
		return "Hello, I'm the Droid:\n" + "Code Name: " + name + "\nBattery Level: " + batteryLevel;
	} 
	public void performTask(String task) {
		System.out.println(name + " Is performing a task: " + task);
		System.out.print("After the task, the battery level went down to ");
	}
	public int energyReport(int batteryLevelCur) {
		return batteryLevel;
	}
	public int reducingLevel(int batteryLevelDownTo) {
		return batteryLevelDownTo;
	}

}
