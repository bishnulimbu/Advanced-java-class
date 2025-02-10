class Parent {
  int x, y;

  public void setXY(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return x;
  }
}

class Child extends Parent {
  public void sum() {
    // int a,b;
    // a= getX();
    // b= getY();
    System.out.println("output of sum is" + getX() + getY());
  }
}

public class first {
  public static void main(String[] args) {
    Child c = new Child();
    c.setXY(1, 2);
    c.sum();
  }
}
