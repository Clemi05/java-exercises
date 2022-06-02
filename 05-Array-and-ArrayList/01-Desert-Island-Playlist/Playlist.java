import java.util.ArrayList;

class Playlist {

  public static void main(String[] args) {
    // Creating new ArrayList
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();

    // Adding values to the desertIslandPlaylist
    desertIslandPlaylist.add("Fireside - Artic Monkeys");
    desertIslandPlaylist.add("Sing about me i'm dying of thirst - Kendrick Lamar");
    desertIslandPlaylist.add("Something in the way - Nirvana");
    //desertIslandPlaylist.add("Weight of Love - The Black Keys");
    desertIslandPlaylist.add("Notes pour trop tard - Orelsan");
    // desertIslandPlaylist.add("Thunderstruck - AC/DC");
    // desertIslandPlaylist.add("Purple Hearts - Kendrick Lamar");
    desertIslandPlaylist.add("Champagne Supernova - Oasis");

    // Printing current desertIslandPlaylist and size
    // System.out.println(desertIslandPlaylist);
    // System.out.println(desertIslandPlaylist.size());

    // Removing some songs from desertIslandPlaylist
    desertIslandPlaylist.remove(5);
    desertIslandPlaylist.remove(5);
    desertIslandPlaylist.remove(3);

    // Printing current desertIslandPlaylist and size
    // System.out.println(desertIslandPlaylist);
    // System.out.println(desertIslandPlaylist.size());

    // Swapping song of desertIslandPlaylist
    int indexOfSongA = desertIslandPlaylist.get("Something in the way - Nirvana");
    int indexOfSongB = desertIslandPlaylist.get("Champagne Supernova - Oasis");

    String tempA = "Something in the way - Nirvana";

    desertIslandPlaylist.set(indexOfSongA, songB);
    desertIslandPlaylist.set(indexOfSongB, tempA);

    System.out.println(desertIslandPlaylist);
  }

}
