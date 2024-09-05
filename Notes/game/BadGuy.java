public class BadGuy {
  private String name; // a name
  private int hp;
  private int minDmg, maxDmg;

  public BadGuy(int hp) {
    this.name = "Bobs";
    this.hp = hp;
    this.minDmg = 1;
    this.maxDmg = 4;
  }

  // our getters
  public String getName() {
    return this.name;
  }

  public int getCurrentHP() {
    return this.hp;
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

  public void damage(int dmg) { // the player gets damaged
    if (dmg >= 0) {
      this.hp -= dmg;
    }
  }
  
}
