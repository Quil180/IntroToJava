
public class Player {
  // the player has the following stats
  private String name; // a name
  private int hp, maxhp, potions;
  private int minDmg, maxDmg;

  public Player(String name, int hp) {
    this.name = name;
    this.hp = hp;
    this.maxhp = hp;
    this.potions = 5;
    this.minDmg = 2;
    this.maxDmg = 10;
  }

  // our getters
  public String getName() {
    return this.name;
  }

  public int getCurrentHP() {
    return this.hp;
  }

  public int getMaxHP() {
    return this.maxhp;
  }

  public int getPotions() {
    return this.potions;
  }

  public boolean isDead() {
    if (this.hp <= 0) {
      return true;
    }
    return false;
  }

  // our actions/things that can happen to the player
  public int attack() { // the player attacks
    int options = this.maxDmg - this.minDmg;
    int output = (int) (Math.random() * options + this.minDmg);
    return output;
  }

  public boolean heal() { // the player can heal
    if (this.potions > 0) { // if the player has potions
      this.hp += (int) (Math.random() * 10 + 1); // heal a number between 1 and 10
      this.potions -= 1; // get rid of one of the potions the player has
      if (this.hp > this.maxhp) { // if the player heals above maxhp, then set current hp to max hp
        this.hp = this.maxhp;
      }
      return true; // and return that the player healed
    }
    return false; // if the player has no potions, return that the player cannot heal
  }

  public void damage(int dmg) { // the player gets damaged
    if (dmg >= 0) {
      this.hp -= dmg;
    }
  }

}
