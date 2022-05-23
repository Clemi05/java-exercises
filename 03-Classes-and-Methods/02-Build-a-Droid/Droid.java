public class Droid {
  String name;
  int batteryLevel;

  public String toString() {
    return "Bip bip bip Hello! I am a droid bip bip bip and my name is " + name + ".";
  }

  public Droid(String droidName) {
    name = droidName;
    batteryLevel = 100;
  }

  public void performTask(String task) {
    System.out.println(name + " is performing task: " + task);
    batteryLevel -= 10;
  }

  public void energyReport() {
    System.out.println("Remaining battery of " + name + ": " + batteryLevel + "%");
  }

  public void energyTransfer(int newBatteryLevel) {
    System.out.println("Exchanging battery level bip bip");
    this.batteryLevel = newBatteryLevel;
    System.out.println(name + " current battery level is: " + batteryLevel);
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

    //r2d2.energyTransfert(c3po.batteryLevel);
    r2d2.performTask("dancing");
  }
}
