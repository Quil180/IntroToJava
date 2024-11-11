import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SportRunner {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("What is the filename you are trying to input?");
    String file = scan.nextLine();

    ArrayList<Sports> sports = new ArrayList<Sports>();

    try {
      File in = new File(file);
      Scanner fscan = new Scanner(in);

      int sportCount = Integer.parseInt(fscan.next());

      for (int i = 0; i < sportCount; i++) {
        String type = fscan.next();
        if (type.equals("Basketball")) {
          Basketball temp = new Basketball(i);
          sports.add(i, temp);
        }
        if (type.equals("Football")) {
          Football temp = new Football(i);
          sports.add(i, temp);
        }
      }
      int scoreCount = Integer.parseInt(fscan.next());

      for (int i = 0; i < scoreCount; i++) {
        int index = fscan.nextInt();
        String scoreType = fscan.next();

        if (scoreType.equals("s")) {
          sports.get(index).score_small();
        }
        if (scoreType.equals("m")) {
          sports.get(index).score_med();
        }
        if (scoreType.equals("l")) {
          sports.get(index).score_large();
        }
      }

      fscan.close();
    } catch (FileNotFoundException e) {
      System.out.println("IInvalid File location.");
      scan.close();
      return;
    }
    scan.close();

    Collections.sort(sports);
    for (Sports sport : sports) {
      System.out.println(sport.toString());
    }

  }
}
