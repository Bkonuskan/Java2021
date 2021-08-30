package day32_stringBuilder;

import java.util.Arrays;

public class C01_StringBuilder02 {

	public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder();//bos bir sb1 creat ettik. 16 capacty
        //SB e eleman ekleme-->obj.appent(obj);
        sb1.append("faruk");
        System.out.println("sb1 ilk hali : "+sb1);//faruk 
        sb1.append(" efehan");
        System.out.println("sb1 efehan eklenmis hali : "+sb1);//faruk efehan
        System.out.println("sb1 uzunluk :"+sb1.length());//12
        System.out.println("sb1 kapasitesi :"+sb1.capacity());//16
        System.out.println("sb1 son hali :"+sb1.append(" guzel insan"));
        System.out.println("sb1 son hali. kapasite : "+sb1.capacity());
        
        //faruk efehan guzel insan
        //Fazladan ayrılan kapasiteyi silme -->obj.trimToSize();
        sb1.trimToSize();
        System.out.println(sb1.capacity());//24
        
        
        // istenen charakterin index ini alma -->obj.indexOf();
        System.out.println(sb1.indexOf("e")); //6
        System.out.println(sb1.lastIndexOf("e"));//16
        
        //İstenen bir characteri index'ine gore alma --> obj.charAt();      
        System.out.println("sb 7. karakter : "+sb1.charAt(7));//f
        
        
        //belirli bir araliktaki characterleri alma -->obj.subSsequence();
        
    System.out.println("sb 'nin 7 dahil 12 haric karakterleri :"+sb1.subSequence(7, 12));//fehan
    System.out.println("sb 'nin 5 dahil tum karakterleri :"+sb1.toString().substring(5));//efehan guzel insan
    System.out.println("sb 'nin 5 dahil tum karakterleri :"+sb1.subSequence(5, sb1.length()));//efehan guzel insan
    
    //sb dekibelli bir index 'deki karakteri silme --> obj.delete(a,b); a dahil b hariç arası siler.  obj.deleteCharAt(a); sadece a karakterini siler
    sb1.delete(3, 7);
    System.out.println("3-7 arası karakter silinmis hali : "+sb1);
    sb1.deleteCharAt(2);
    System.out.println("2. karakter silinmis hali : "+sb1);
    System.out.println("Son hali : "+sb1);//fafehan guzel insan
    
    sb1.insert(2, "lan");
    System.out.println("r eklenmiş hali : "+sb1);
    
    sb1.insert(10, 3.14);
    System.out.println("3.14 eklenmiş hali : "+sb1);
    
    int[] arr= {17,63,14};
    sb1.insert(9, Arrays.toString(arr));//arr yi String'e cevirip yazdırıyoruz. Sb ye ekliyoruz
    System.out.println("arr eklenmiş hali : "+sb1);
    //istenen yere birden fazla character yerleştirmek.
    StringBuilder sb2=new StringBuilder("Bugün hava çok sıcak");
    System.out.println(sb2);
    sb2.replace(3, 8,"bulma ta");
    System.out.println("sb2'ye eklenmiş hali : "+sb2);
    
    System.out.println("Özel durum : "+sb2.insert(9,"basarılı",2,4));
    
    
    StringBuilder sb3=new StringBuilder("Bugün hava cook akçak");
    System.out.println("sb3 ilk hali"+ sb3);
    sb3.reverse();
    System.out.println("sb3 son hali : "+ sb3);
    
    
    
    
    
    
    
    
    
    
    
    
	}

}
