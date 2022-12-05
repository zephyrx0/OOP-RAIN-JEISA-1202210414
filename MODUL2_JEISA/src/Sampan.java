public class Sampan extends TransportasiAir {
  protected int layar;
  
  public Sampan(int jumlahKursi, int biaya, int layar) {
   super(jumlahKursi, biaya);
   this.jumlahKursi = jumlahKursi;
   this.biaya = biaya;
   this.layar = layar;

  }

  public void informasi() {
    System.out.println("Transportasi Air jenis Sampan dengan kursi berjumlah " + jumlahKursi + " ditetapkan dengan biaya sebesar Rp. " + biaya);          
  }

  public void berlayar() {
    System.out.println("Transportasi Air jenis Sampan sedang berlayar menggunakan " + layar + " layar");  
  }

  public void berlabuh() {
    System.out.println("Transportasi Air jenis Sampan sedang berlayar di pantai tanpa jangkar");       
  }

  public void berlabuh(int jangkar) {
    System.out.println("Transportasi Air jenis Sampan sedang berlayar di pantai menggunakan " + jangkar + " jangkar");
    System.out.println();
  }
}
