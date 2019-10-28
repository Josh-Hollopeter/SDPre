public class ArrayIntro {
  public static void main (String[] args) {
    String [] planets = {"Mercury","Venus","Earth","Mars","Jupiter",
                        "Saturn","Uranus","Neptune"};
    String [] verbs = {"Sing","Ping","Fling","Ring"};

    for (String p : planets ) {
      System.out.println(p+"\t"+p.toUpperCase() );
    }

    for (String v : verbs) {
      System.out.println(v+"ing");
    }
  }
}
