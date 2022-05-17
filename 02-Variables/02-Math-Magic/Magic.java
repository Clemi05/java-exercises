public class Magic {

	public static void main(String[] args) {

    / myNumber is the original number
    int myNumber = 9;
    int magicNumber = myNumber * myNumber;
    // Using compound assignment operators
    magicNumber += myNumber;
    magicNumber /= myNumber;
    magicNumber += 17;
    magicNumber -= myNumber;
    magicNumber /= 6;

    // int stepOne = myNumber * myNumber;
		// int stepTwo = stepOne + myNumber;
    // int stepThree = stepTwo / myNumber;
    // int stepFour = stepThree + 17;
    // int stepFive = stepFour - myNumber;
    // int stepSix = stepFive / 6;

    System.out.println(magicNumber);
	}
}
