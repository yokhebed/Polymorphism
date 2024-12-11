public class Matematika {
    int a = 7, b = 3;
    double x = 12.5, y = 28.7, z = 14.2;

    // Method default
    void pertambahan() {
        System.out.println("Hasil Pertambahan = " + (a + b));
    }

    void pengurangan() {
        System.out.println("Hasil Pengurangan = " + (a - b));
    }

    void perkalian() {
        System.out.println("Hasil Perkalian = " + (a * b));
    }

    void pembagian() {
        System.out.println("Hasil Pembagian = " + (a / b));
    }

    // Overloading dengan parameter
    void pertambahan(double x, double y) {
        System.out.println("Hasil Pertambahan = " + (x + y));
    }

    void pengurangan(double x, double y) {
        System.out.println("Hasil Pengurangan = " + (x - y));
    }

    void perkalian(double x, double y) {
        System.out.println("Hasil Perkalian = " + (x * y));
    }

    void pembagian(double x, double y) {
        if (y != 0) {
            System.out.println("Hasil Pembagian = " + (x / y));
        } else {
            System.out.println("Pembagian dengan nol tidak diperbolehkan");
        }
    }
}


