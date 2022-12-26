public class Calculation implements Runnable {
  double radius;
  double side;
  double area;
  double phi = 3.14;
  
  public void setSquare(double side) {
    throws IllegalArgumentException {
      if (side < 1) {
        throw new IllegalArgumentException("Nilai sisi tidak boleh kurang dari 1");
      }
      this.side = side;
      this.area = side * side;
    }
  }

  public double getSquare() {
    return area;          
  }

  public void setCircle(double phi, double radius) {
    this.phi = phi;
    this.radius = radius;
    this.area = area;
    
    try {
      area = phi*radius*radius;
    } catch (IllegalArgumentException a) {
        System.out.println("Nilai sisi harus lebih dari 1");
    } 
  }
}
