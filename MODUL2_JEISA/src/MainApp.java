public class MainApp {
  public static void main (String[] args) throws Exception {
    TransportasiAir transportasi = new TransportasiAir(10, 80000);
    transportasi.informasi();
    transportasi.berlayar();
    transportasi.berlabuh();

    Sampan sampan = new Sampan(5, 30000, 3);
    sampan.informasi();
    sampan.berlayar();
    sampan.berlabuh();
    sampan.berlabuh(2);

    Kapal kapal = new Kapal(90, 150000, "Diesel");
    kapal.informasi();
    kapal.berlayar();
    kapal.berlayar(30);
    kapal.berlabuh();
  }            
}
