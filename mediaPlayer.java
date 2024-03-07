import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.Scanner;

public class AudioPlayer {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Scanner sc = new Scanner(System.in);
        String response = "";

        Map<String, String> arr = new HashMap<>();
        arr.put("BHALOBASAR MORSHUM", "C:/Users/Bidisha/Downloads/1-Bhalobashar-Morshum(PagalWorld).wav");

        System.out.println("Enter audio Name: ");
        String AudioName = sc.nextLine();
        AudioName = AudioName.toUpperCase();

        File file = new File(arr.get(AudioName));
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        while(!response.equals("Q")){
            System.out.println("\n\"P\" -> Play\n\"R\" -> Replay\n\"S\" -> Stop\n\"Q\" -> Quit");
            System.out.println("Your response: ");

            response = sc.next();
            response = response.toUpperCase();

            switch (response) {
                case "P" -> clip.start();
                case "R" -> clip.setMicrosecondPosition(0);
                case "S" -> clip.stop();
                case "Q" -> clip.close();
                default -> System.out.println("Enter valid response");
            }
        }
    }
}
