public class Handphone extends Perangkat {
  protected boolean fingerprint;
  
  public Handphone(String drive, int ram, Double processor, boolean fingerprint) {
    super(drive, ram, processor);
    this.fingerprint = fingerprint;
  }

  public void informasi() {
    if (fingerprint == true) {
      System.out.println("Handphone ini memiliki drive tipe " + drive + " dengan ram sebesar " + ram + " GB dan processor secepat " + processor + " Ghz. Selain itu, handphone  ini memiliki fingerprint");
      } else {
      System.out.println("Handphone ini memiliki drive tipe " + drive + " dengan ram sebesar " + ram + " GB dan processor secepat " + processor + " Ghz. Selain itu, handphone ini tidak memiliki fingerprint");  
      }
  }

  public void telfon(int no_hp) {
    System.out.println("Handphone berhasil menyambungkan ke nomor " + no_hp);          
  }

  public void kirimSMS(int no_hp) {
    System.out.println("Handphone berhasil mengirim sms ke nomor " + no_hp);          
  }

  public void kirimSMS(int no_hp1, int no_hp2) {
    System.out.println("Handphone berhasil mengirim sms ke nomor " + no_hp1 + " dan ke nomor " + no_hp2);         
  }
}
