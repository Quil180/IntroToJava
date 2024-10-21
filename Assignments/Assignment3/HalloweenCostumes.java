/*
 * Yousef Awad
 * Assignment 3: Method Overloading, Comparable and File I/O
 * COP 3330
 * October 6th, 2024
 */

public class HalloweenCostumes implements Comparable<HalloweenCostumes>{
  // variables
  String name;
  double cost;
  int want;
  int coolnessScore = -1;

  // constructors
  public HalloweenCostumes() {
    this.name = "Super_Awesome_Costume";
    this.cost = 39.99;
    this.want = 3;
  }
  public HalloweenCostumes(String string) {
    this.name = string;
    this.cost = 39.99;
    this.want = 3;
  }
  public HalloweenCostumes(String string, double Double) {
    this.name = string;
    this.cost = Double;
    this.want = 3;
  }
  public HalloweenCostumes(String string, int Int) {
    this.name = string;
    this.cost = 39.99;
    this.want = Int;
  }
  public HalloweenCostumes(String string, double Double, int Int) {
    this.name = string;
    this.cost = Double;
    this.want = Int;
  }
  public HalloweenCostumes(double Double) {
    this.name = "Super_Awesome_Costume";
    this.cost = Double;
    this.want = 3;
  }
  public HalloweenCostumes(double Double, int Int) {
    this.name = "Super_Awesome_Costume";
    this.cost = Double;
    this.want = Int;
  }
  public HalloweenCostumes(int Int) {
    this.name = "Super_Awesome_Costume";
    this.cost = 39.99;
    this.want = Int;
  }

  // methods
  public void CalcCoolness() {
    this.coolnessScore = (int)((this.name.length() * this.want) / this.cost);
  }
  public String getName() {
    return this.name;
  }
  public double getCost() {
    return this.cost;
  }
  public int getWant() {
    return this.want;
  }
  public int getCoolness() {
    return this.coolnessScore;
  }
  public int compareTo(HalloweenCostumes hallow) {
    return this.coolnessScore == hallow.coolnessScore ? this.name.compareTo(hallow.name) : hallow.coolnessScore - this.coolnessScore;
  }
}
