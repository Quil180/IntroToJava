public class Basketball implements Sports {
  private int score;
  private int id;

  // constructor
  public Basketball(int id) {
    this.score = 0;
    this.id = id;
  }

  public void score_large() {
    this.score += 3;
  }

  public void score_med() {
    this.score += 2;
  }

  public void score_small() {
    this.score += 1;
  }

  public int get_score() {
    return this.score;
  }

  public int get_id() {
    return this.id;
  }

  public String toString() {
    return this.id + " - " + this.score;
  }

  public int compareTo(Sports other) {
    return other.get_score() - this.score;
  }
}
