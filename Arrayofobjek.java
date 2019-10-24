public class Arrayofobjek{ // kelas utama
  public static void main(String[] args) {
    Ninja [] m = new Ninja[3];// deklarasi array

    // membuat objek pertama
    m[0] = new Ninja();
    m[0].setnoReg("012606");
    m[0].setNama("Uciha Sasuke");
    m[0].setPeringkat("Genin");

    // membuat objek 2
    m[1] = new Ninja();
    m[1].setnoReg("012607");
    m[1].setNama("Uzumaki Naruto");
    m[1].setPeringkat("Genin");

    // membuat objek 3
    m[2] = new Ninja();
    m[2].setnoReg("012601");
    m[2].setNama("Haruno Sakura");
    m[2].setPeringkat("Chunin");

    // menampilkan ketiga objek dari array yg tersimpan
    System.out.println("Data Shinobi");
    for(Ninja x:m){
      System.out.println ("\nNo Registrasi : "+x.getnoReg());
      System.out.println ("Nama : "+x.getNama());
      System.out.println ("Peringkat : "+x.getPeringkat());
      System.out.println ();

    }
  }
}
class Ninja {
  private String noreg,nama,peringkat;// deklarasi

  // setter dan getter
  public void setnoReg (String no){
    this.noreg = no;
  }
  public String getnoReg(){
    return noreg;
  }
  public void setNama(String nama){
    this.nama = nama;
  }
  public String getNama(){
    return nama;
  }
  public void setPeringkat(String peringkat){
    this.peringkat = peringkat;
  }
  public String getPeringkat(){
    return peringkat;
  }

}
