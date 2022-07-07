// Program that determines whether there is a protein in a strand of DNA
public class DNA {

  public static void main(String[] args) {

    //  -. .-.   .-. .-.   .
    //    \   \ /   \   \ /
    //   / \   \   / \   \
    //  ~   `-~ `-`   `-~ `-

    // Variables
    String dna1 = "ATGCGATACGCTTGA";
    String dna2 = "ATGCGATACGTGA";
    String dna3 = "ATTAATATGTACTGA";

    String dna = dna2;

    int dnaLength = dna.length();
    int dnaStart = dna.indexOf("ATG");
    int dnaStop = dna.indexOf("TGA");

    // Conditions to check there is a protein
    if (dnaStart != -1 && dnaStop != -1 && (dnaStop - dnaStart) % 3 == 0) {
      System.out.println("There is a protein!");
      String protein = dna.substring(3, dnaStop);
      System.out.println(protein);

    } else {
      System.out.println("No protein here!");

    }
  }
}
