public class Calculator {
  //constructor
  public Calculator() {
  }

  // addition method
  public int add(int x, int y) {
    return x + y;
  }

  // subtraction method
  public int subtract(int x, int y) {
    return x - y;
  }

  // multiply method
  public int multiply(int x, int y) {
    return x * y;
  }

  // division method
  public double divide(int x, int y) {
    return x / y;
  }

  // modulo method
  public int modulo(int x, int y) {
    return x % y;
  }

  public double square(int x) {
    return x * x;
  }

  public static void main(String[] args) {
    Calculator myCalculator = new Calculator();
    System.out.println(myCalculator.add(5, 7));
    System.out.println(myCalculator.subtract(45, 11));
    System.out.println(myCalculator.divide(65, 23));
    System.out.println(myCalculator.square(65));
  }

}
