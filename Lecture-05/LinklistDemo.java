import java.util.LinkedList;

public class LinklistDemo {
public static void main(String[] args) {
LinkedList<String> playlist = new LinkedList<>();
// Add songs
playlist.add("Bohemian Rhapsody");
playlist.addLast("Stairway to Heaven");
playlist.addFirst("Sweet Child O'Mine");
System.out.println("Current playlist: " + playlist);
// Skip current song (remove first)
String nowPlaying = playlist.removeFirst();
System.out.println("Now playing: " + nowPlaying);
System.out.println("Next up: " + playlist.getFirst());
}
}