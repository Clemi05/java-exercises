public class MadLibs {
  /*
  This program generates a mad libbed story.
  Author: Clémi
  Date: 17/05/2022
  */
  	public static void main(String[] args) {
      // Replace the variables with your own values!
      String name1 = "Clémi";
      String name2 = "Max";
      String adjective1 = "fantastic";
      String adjective2 = "crazy";
      String adjective3 = "exited";
      String verb1 = "danse";
      String noun1 = "actor";
      String noun2 = "hair";
      String noun3 = "queen";
      String noun4 = "pizza";
      String noun5 = "rain";
      String noun6 = "ice";
      String place1 = "London";

      int number = 4;

      //The template for the story
      String story = "This morning " + name1 + " woke up feeling " + adjective1
                    + ". 'It is going to be a " + adjective2 + " day!' Outside, a bunch of "
                    + noun1 + "s were protesting to keep " + noun2 + " in stores.
                    They began to " + verb1 + " to the rhythm of the " + noun3 + ", which made all the "
                    + noun4 + "s very " + adjective3 + ". Concerned, " + name1 + " texted "
                    + name2 + ", who flew " + name1 + " to " + place1 + " and dropped "
                    + name1 + " in a puddle of frozen " + noun5 + ". " + name1 + " woke up in the year "
                    + number + ", in a world where " + noun6 + "s ruled the world.";

      System.out.println(story);
    }
}
