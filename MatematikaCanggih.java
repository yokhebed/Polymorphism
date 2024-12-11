class MatematikaCanggih extends Matematika {
    void modulus() {
        if (b != 0) {
            System.out.println("Hasil modulus = " + (a % b));
        } else {
            System.out.println("Error: Operasi modulus dengan nol tidak diperbolehkan.");
        }
    }

    // Method baru bertipe double dengan 3 parameter
    void operasi(double x, double y, double z) {
        double hasil = (x + y) * z;
        System.out.println("Hasil Pertambahan = " + hasil);
    }

}