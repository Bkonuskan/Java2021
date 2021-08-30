package day44_abstractClass;

public abstract class C01_Insan {
    private String isim;
     private String soyisim;
   
     public C01_Insan(String isim, String soyisim) {
       
       this.isim = isim;
       this.soyisim = soyisim;
   }
     
     public abstract void calis();
public  void bilgilendirme() {
   System.out.println("isim: "+this.isim+" soyisim: "+this.soyisim);
}
public  void isimDegistir(String isim,  String soyisim) {
   this.isim=isim;
   this.soyisim=soyisim;
}
}
