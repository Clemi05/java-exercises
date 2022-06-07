class FizzBuzz {

  public static void main(String[] args) {
    for (int i = 1; i <= 100; i++) {
      // Check if i is a multiple of 3
      if (i % 3 == 0) {
        System.out.println("Fizz");
      // Check if i is a multiple of 3
      } else if (i % 5 == 0) {
        System.out.println("Buzz");
      // Check if i is a multiple of both 3 and 5
      } else if (i % 3 == 0 && i % 5 == 0) {
        System.out.println("FizzBuzz");
      } else {
        System.out.println(i);
      }
    }
  }
}
