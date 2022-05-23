public class Droid {
  String name;
  int batteryLevel;

  public Droid(String droidName) {
    name = droidName;
    batteryLevel = 100;
  }

  public String toString() {
    return "Bip bip bip Hello! I am a droid bip bip bip and my name is " + name + ".";
  }

  public void performTask(String task) {
    System.out.println(name + " is performing task: " + task);
    batteryLevel -= 10;
  }

  public void energyReport() {
    System.out.println("Remaining battery of " + name + ": " + batteryLevel + "%");
  }

  public void energyTransfer(Droid droid, int amoutBatteryExchange) {
    System.out.println("Exchanging battery level bip bip");
    System.out.println("Adding " + amoutBatteryExchange + "% to " + this.name + ".");
    this.batteryLevel += amoutBatteryExchange;
    droid.batteryLevel -= amoutBatteryExchange;
    System.out.println(this.name + " current battery level is: " + batteryLevel + "%.");
    System.out.println(droid.name + " current battery level is: " + droid.batteryLevel + "%.");
  }

  public static void main(String[] args) {
    Droid r2d2 = new Droid("R2D2");
    Droid c3po = new Droid("C3PO");

    System.out.println(r2d2);
    System.out.println(c3po);

    r2d2.performTask("dancing");
    r2d2.performTask("cleaning");
    r2d2.performTask("playing guitare");
    r2d2.energyReport();

    c3po.performTask("teaching");
    c3po.energyReport();

    r2d2.energyTransfer(c3po, 20);
  }
}
