import java.util.ArrayList;
import java.util.Scanner;
public class Arraylists {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> playlist = new ArrayList<>();

        System.out.print("Enter number of songs: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline
        for (int i = 0; i < n; i++) {
            System.out.print("Enter song " + (i + 1) + ": ");
            String song = sc.nextLine();
            playlist.add(song);
        }
        System.out.println("\nPlaylist:");
        for (String song : playlist) {
            System.out.println(song);
        }
        System.out.print("\nEnter index to view song: ");
        int index = sc.nextInt();

        if (index >= 0 && index < playlist.size()) {
            System.out.println("Song at index " + index + " = "
                    + playlist.get(index));
        } else {
            System.out.println("Invalid index");
        }

        sc.nextLine();
        System.out.print("\nEnter song name to search: ");
        String searchSong = sc.nextLine();

        if (playlist.contains(searchSong)) {
            System.out.println("Song found in playlist");
        } else {
            System.out.println("Song not found");
        }
        System.out.print("\nEnter index to remove: ");
        int removeIndex = sc.nextInt();

        if (removeIndex >= 0 && removeIndex < playlist.size()) {
            playlist.remove(removeIndex);
            System.out.println("Song removed successfully");
        } else {
            System.out.println("Invalid index");
        }
        System.out.println("\nFinal Playlist:");
        for (int i = 0; i < playlist.size(); i++) {
            System.out.println((i + 1) + ". " + playlist.get(i));
        }

        sc.close();
    }
}