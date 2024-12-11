public class MatematikaCanggihBeraksi {
    public static void main(String[] args){
        MatematikaCanggih mtkCanggih = new MatematikaCanggih();

        // Memanggil method dari superclass
        mtkCanggih.pertambahan();
        mtkCanggih.pengurangan();
        mtkCanggih.perkalian();
        mtkCanggih.pembagian();

        // Memanggil method overloading
        mtkCanggih.operasi(12.5, 28.7, 14.2); // Pecahan 3 parameter
        mtkCanggih.operasi(12, 28, 14);       // Bilangan bulat 3 parameter
        mtkCanggih.pertambahan(23, 34);           // Bilangan bulat 2 parameter
        mtkCanggih.pertambahan(3.4, 4.9);         // Pecahan 2 parameter
        
        // Memanggil method modulus
        mtkCanggih.modulus();
    }
}