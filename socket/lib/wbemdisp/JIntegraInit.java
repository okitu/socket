package wbemdisp;

public class JIntegraInit {
  static boolean initialised = false;
  public static void init() {
    if(initialised) return;
    initialised = true;
  }
}
