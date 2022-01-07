public class flowchartno3 {

 
    public static void main(String[] args) {
        
        
      Scanner input = new Scanner(System.in);
      int barang1, barang2, barang3;
      int total ;
      int jumlah;
      int diskon;
        System.out.println("Masukan Bilangan");
        barang1 = input.nextInt();
        System.out.println("Masukan Bilangan");
        barang2 = input.nextInt();
        System.out.println("Masukan Bilangan");
        barang3 = input.nextInt();
           
    jumlah = barang1+barang2+barang3;
    if (jumlah >= 250000){
    diskon = jumlah* 15/100;
    total = jumlah-diskon;
    System.out.println("Total Pembayaran Anda ="+total);}
    else {
    System.out.println("Total Pembayaran Anda =" +jumlah);
    }
    
    }
}
