package day44_abstractClass;

public class C01_Calisan extends C01_Insan {
    
    
    private int calisanId;
    public C01_Calisan(String isim, String soyisim,int calisanId) {
        super(isim, soyisim);
        this.calisanId=calisanId;
    }
    public void calis() {
        
        if (calisanId==0) {
            System.out.println("bu sahis sirket calisani degil");
            System.out.println("sahsin id'si : "+calisanId);
            
        }else {
            System.out.println("bu sahis bizim gundiii :)");
            System.out.println("sahsin id'si : "+calisanId);
        }
    } public static void main(String[] args) {
         
        C01_Calisan ITManager= new C01_Calisan("Merve","Aslan", 0);
        C01_Calisan QAtester= new C01_Calisan("Omer","Farulk", 1453);
        C01_Calisan Developer= new C01_Calisan("Oguzhan ","Akkafa", 1905);
        
        ITManager.bilgilendirme();
        ITManager.calis();
        
        
        QAtester.bilgilendirme();
        QAtester.calis();
        
        Developer.bilgilendirme();
        Developer.calis();
        
        
    }
}




