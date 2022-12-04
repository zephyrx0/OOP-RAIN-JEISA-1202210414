public class Perangkat {
  protected String drive;
  protected int ram;
  protected double processor;
  
  public Perangkat(String drive, int ram, Double processor) {
    this.drive = drive;
    this.ram = ram;
    this.processor = processor;
  }

  public void informasi() {
    System.out.println("Perangkat tidak diketahui memiliki drive tipe " + drive + " dengan ram sebesar " + ram + " dan proccessor secepat " + processor + " Ghz.");
    System.out.println();
  }
}
