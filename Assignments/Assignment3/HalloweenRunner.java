/*
 * Yousef Awad
 * Assignment 3: Method Overloading, Comparable and File I/O
 * COP 3330
 * October 6th, 2024
 */

import java.io.*;
import java.util.*;

public class HalloweenRunner {
  public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(System.in);
    System.out.println("What is the filename you are trying to input?");
    String filePath = scan.nextLine();

    ArrayList<HalloweenCostumes> myCostumes = new ArrayList<>();

    try {
      // opening the file
      File in = new File(filePath);
      Scanner infile = new Scanner(in);
      int costumeCount = Integer.parseInt(infile.nextLine());

      for (int i = 0; i < costumeCount; i++) {
        // getting the data for every costume
        String name = infile.next();
        double cost = infile.nextDouble();
        int want = infile.nextInt();

        // making the costume and inputting it into the arrayList.
        HalloweenCostumes temporary;
        if (name == "-1" && cost == -1.0 && want == -1) {
          temporary = new HalloweenCostumes();
        } else if (name == "-1" && cost == -1.0) {
          temporary = new HalloweenCostumes(want);
        } else if (name == "-1" && want == -1) {
          temporary = new HalloweenCostumes(cost);
        } else if (cost == -1.0 && want == -1) {
          temporary = new HalloweenCostumes(name);
        } else if (want == -1) {
          temporary = new HalloweenCostumes(name, cost);
        } else if (cost == -1.0) {
          temporary = new HalloweenCostumes(name, want);
        } else if (name == "-1") {
          temporary = new HalloweenCostumes(cost, want);
        } else {
          temporary = new HalloweenCostumes(name, cost, want);
        }
        myCostumes.add(temporary);
      }
      infile.close();
    } catch (FileNotFoundException e) {
      System.out.println("File not found.");
      scan.close();
      return;
    }

    for (HalloweenCostumes costume : myCostumes) {
      // for every costume in myCostumes, calculate its coolness factor
      costume.CalcCoolness();
    }

    // sorting the list
    Collections.sort(myCostumes);

    // prompting the user for the output file
    System.out.println("What do you want to name the output file?");
    String outputName = scan.nextLine();
    try {
      FileWriter writeTo = new FileWriter(outputName);
      for (HalloweenCostumes costume : myCostumes) {
        writeTo.write(
            costume.getName() + " " + costume.getCoolness() + " " + costume.getCost() + " " + costume.getWant() + "\n");
      }
      writeTo.close();
      System.out.println("Output was succesfully written to " + outputName);
    } catch (IOException e) {
      System.out.println("An error occured when writing the output file");
    }

    scan.close();
  }
}
