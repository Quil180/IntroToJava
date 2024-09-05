import java.util.*;

public class AriaSim {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    Player play = new Player("Duven", 55);

    BadGuy[] bgArray = new BadGuy[4];
    for (int i = 0; i < 4; i++) {
      bgArray[i] = new BadGuy(10);
    }

    boolean playing = true;

    System.out.println("Welcome to the Archduchy of Aria.");
    System.out.println("Uh oh!!! You are being attacked by " + bgArray[0].getName());

    while (playing) {
      System.out.println("What would you like to do?");
      System.out.println("1. Check Stats");
      System.out.println("2. Attack");
      System.out.println("3. Heal");
      System.out.println("4. Run Away");
      int option = scan.nextInt();

      switch (option) {
        case 1:
          System.out.println("Name: " + play.getName());
          if (play.isDead()) {
            System.out.println("You have died...");
          } else {
            System.out.println("HP: " + play.getCurrentHP() + " / " + play.getMaxHP());
            System.out.println("Potions: " + play.getPotions());
          }
          System.out.println("");
          break;
        case 2:
          if (!play.isDead()) {
            System.out.println("You can attack the following:");
            for (int i = 0; i < bgArray.length; i++) {
              if (bgArray[i] == null) {
                System.out.println((i + 1) + ": EMPTY");
              } else {
                System.out.println((i + 1) + ": " + bgArray[i].getName() + " - " + bgArray[i].getCurrentHP());
              }
            }
            int index = scan.nextInt();
            int damage = play.attack();
            if (bgArray[index - 1] != null) {
              bgArray[index - 1].damage(damage);
              System.out.println("You did " + damage + " damage");
            }
          }
          break;
        case 4:
          playing = false;
          break;
      }

      System.out.println();
      for (int i = 0; i < 4; i++) {
        // if a badguy is dead, remove/null it
        if (bgArray[i] != null && bgArray[i].isDead()) {
          bgArray[i] = null;
        }
        // if a bad is not dead, let him attack
        if (bgArray[i] != null) {
          int dmg = bgArray[i].attack();
          play.damage(dmg);
          System.out.println("You were hit for " + dmg + " damage");
        }
      }
      System.out.println();

    }

    scan.close();

  }
}
