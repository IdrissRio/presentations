public class Ecoop {

  void foo() {
    Integer x = 2;
    Integer y = 3;
    x = y;
    y = x;
    x = null;
    x.toString();
  }
}