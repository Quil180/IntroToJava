public interface Sports extends Comparable<Sports> {
  void score_large();

  void score_med();

  void score_small();

  int get_score();

  int get_id();

  int compareTo(Sports other);
}
