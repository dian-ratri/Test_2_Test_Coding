public class Gaji{
    public static void main(String[] args){
        double gajiPokok = 4600897;
        double tjgSI = 0.1 * gajiPokok;
        int jmlAnak = 4;
        double tjgAnak = jmlAnak * 0.2 * gajiPokok;
        double pghBruto = gajiPokok + tjgSI + tjgSI;
        double iuranPensiun = 0.4* gajiPokok;
        double pghNetto = pghBruto - iuranPensiun;
        
        System.out.println("Gaji Pokok                  :       Rp."+gajiPokok);
        System.out.println("Jumlah Anak                 :       "+jmlAnak+" Orang Anak");
        System.out.println("Tunjangan Ortu              :       Rp."+tjgSI);
        System.out.println("Tunjangan Anak              :       Rp."+tjgAnak);
        System.out.println("Penghasil Bruto Per Bulan   :       Rp."+pghBruto);
        System.out.println("Iuran Pensiun               :       Rp."+iuranPensiun);
        System.out.println("Penghasilan Netto Per Bulan :       Rp."+pghNetto);
    }
}