public class Ejercicio extends RuntimeException {
  public Ejercicio(String message) {
    super(message);
  }



  public static void main(String[] args) {
    System.out.println("Hola!!!");

  }
  public abstract class Figures {
    protected double a;
    protected double b;
    protected Figures(double a, double b){
      this.a = a;
      this.b = b;
    }

    public abstract double calcularArea();
  }
  private class Rectangle extends Figures{

    float l1;
    float l2;

    private Rectangle extends Figures(float l1, float l2, double a, double b) {
      super(a,b);
      this.l1 = l1;
      this.l2 = l2;
    }
    @Override
    public double calcularArea(){
      double area = l1 * l2;
      return area;
    }
  }

  private class Quadrat extends Rectangle {
    float lado;
    private Quadrat(float l1, float l2, float lado) {
      super(l1, l2);
      this.lado = lado;
    }
  }
  private class Cercle extends Figures{
    float r;
    private Cercle(float r, float a, float b) {
      super(a, b);
      this.r = r;
    }

    @Override
    public double calcularArea() {
      double area = pi*(r*r);
      return area;
    }
  }
  private class Triangle extends Figures{
    float base;
    float h;
    private Triangle(float base, float h, float a, float b){
      super(a, b);
      this.base = base;
    }

    @Override
    public double calcularArea() {
      double area = base*h;
      return area;
    }
  }
  }
}

