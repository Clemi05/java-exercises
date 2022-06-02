import java.util.ArrayList;

class Playlist {

  public static void main(String[] args) {
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();

    desertIslandPlaylist.add("Fireside - Artic Monkeys");
    desertIslandPlaylist.add("Sing about me i'm dying of thirst - Kendrick Lamar");
    desertIslandPlaylist.add("Something in the way - Nirvana");
    desertIslandPlaylist.add("Weight of Love - The Black Keys");
    desertIslandPlaylist.add("Notes pour trop tard - Orelsan");
    desertIslandPlaylist.add("Thunderstruck - AC/DC");
    desertIslandPlaylist.add("Purple Hearts - Kendrick Lamar");
    desertIslandPlaylist.add("Champagne Supernova - Oasis");

    // Printing current desertIslandPlaylist and size
    System.out.println(desertIslandPlaylist);
    System.out.println(desertIslandPlaylist.size());

    // Removing some songs from desertIslandPlaylist
    desertIslandPlaylist.remove(5);
    desertIslandPlaylist.remove(5);
    desertIslandPlaylist.remove(3);

    // Printing current desertIslandPlaylist and size
    System.out.println(desertIslandPlaylist);
    System.out.println(desertIslandPlaylist.size());
  }

}
