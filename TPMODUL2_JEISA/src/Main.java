public class Main {
   public static void main (String[] args) throws Exception {
      Perangkat perangkat = new Perangkat("Sumsang", 8, 1.2);
      perangkat.informasi();

      Laptop laptop = new Laptop("Kingston", 32, 2.80, false); 
      laptop.informasi();
      laptop.bukaGame("Valorant");
      laptop.kirimEmail("ganelajeisa@gmail.com");
      laptop.kirimEmail("ganelajeisa@gmail.com", "rep1farras@gmail.com");

      Handphone handphone = new Handphone("Fifpro", 128, 3.2, true);
      handphone.informasi();
      handphone.telfon(628131850);
      handphone.kirimSMS(628131850);
      handphone.kirimSMS(628131850, 628158555);
   }          
}
