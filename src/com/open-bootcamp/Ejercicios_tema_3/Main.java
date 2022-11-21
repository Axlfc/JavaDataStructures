public class Main {
    public static void main(String[] args) {
        System.out.println("1 + 2 + 3 = " + suma(1, 2, 3));

        int nPuertas;
        // nPuertas = suma(2, 1, 1);
	nPuertas = 1;
        int incremPuer;
        incremPuer = 0;
        Coche miCoche = new Coche(incremPuer);
        for (int i = 0; i < nPuertas; ++i) {
            incremPuer = miCoche.puertas(incremPuer);
        }

        System.out.println("Número de puertas que tiene el objeto: " + incremPuer);
    }

    public static int suma(int a , int b, int c) {
        return a + b + c;
    }

}

class Coche {
    int puertas;
    Coche (int p) {
        puertas = p;
    }
    int puertas(int incremPuer) {
        return incremPuer + 1;
    }
}
