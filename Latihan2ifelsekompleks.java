
package latihan2ifelsekompleks;

import java.util.Scanner;


public class Latihan2ifelsekompleks {

   
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int angkatan;
    String jurusan;
    int biaya;
    int skstpm;
    int skspk;
    int bd;
    int tskstpm;
    int tskspk;
    
    System.out.println("Masukan keterangan anda angkatan berapa = ");
    angkatan = input.nextInt();
     
    if (angkatan <= 2018 )
    {
        biaya = 5000000;
        System.out.println("Total pembayaran anda = "+ biaya +" dengan total SKS maksimal 24 ");
    }
    else
    {
           System.out.println("Masukan Fakultas anda 1. FTI 2. FT 3. FH 4. FE 5. FPSI ");
           jurusan  = input.nextLine();
           if  ("FTI".equalsIgnoreCase(jurusan)||"1".equalsIgnoreCase(jurusan))
           {
               bd = 2500000;
               System.out.println("Masukan jumlah SKS tatap muka anda = ");
               skstpm = input.nextInt();
               System.out.println("Masukan jumlah SKS Praktikum anda = ");
               skspk = input.nextInt();
               tskstpm = skstpm * 100000;
               tskspk = skspk * 150000;
               int ts; 
               int tst;
               ts = skspk + skstpm;
               tst = tskstpm + tskspk + bd;
                if ( ts > 24)
                {
                  System.out.println("Jumlah SKS tidak boleh melebihi 24");  
                }
                else
                {
                  System.out.println("Total pembayaran anda = "+ tst);  
                }    
           }
           else if("FT".equalsIgnoreCase(jurusan)||"2".equalsIgnoreCase(jurusan))
           {
               bd = 2250000;
               System.out.println("Masukan jumlah SKS tatap muka anda = ");
               skstpm = input.nextInt();
               System.out.println("Masukan jumlah SKS Praktikum anda = ");
               skspk = input.nextInt();
               tskstpm = skstpm * 100000;
               tskspk = skspk * 150000;
               int ts; 
               int tst;
               ts = skspk + skstpm;
               tst = tskstpm + tskspk + bd;
                if ( ts > 24)
                {
                  System.out.println("Jumlah SKS tidak boleh melebihi 24");  
                }
                else
                {
                  System.out.println("Total pembayaran anda = "+ tst);  
                }
           }
           else if("FH".equalsIgnoreCase(jurusan)||"3".equalsIgnoreCase(jurusan))
           {
               bd = 2275000;
               System.out.println("Masukan jumlah SKS tatap muka anda = ");
               skstpm = input.nextInt();
               tskstpm = skstpm * 100000;
               int ts; 
               int tst;
               tst = tskstpm + bd;
                if ( skstpm > 24)
                {
                  System.out.println("Jumlah SKS tidak boleh melebihi 24");  
                }
                else
                {
                  System.out.println("Total pembayaran anda = "+ tst);  
                }    
           }
           else if("FE".equalsIgnoreCase(jurusan)||"4".equalsIgnoreCase(jurusan)||"FSPI".equalsIgnoreCase(jurusan)||"5".equalsIgnoreCase(jurusan))
           {
               bd = 2150000;
               System.out.println("Masukan jumlah SKS tatap muka anda = ");
               skstpm = input.nextInt();
               tskstpm = skstpm * 100000;
               int ts; 
               int tst;
               tst = tskstpm + bd;
                if ( skstpm > 24)
                {
                  System.out.println("Jumlah SKS tidak boleh melebihi 24");  
                }
                else
                {
                  System.out.println("Total pembayaran anda = "+ tst);  
                }    
           }
    
        }
    }
}
