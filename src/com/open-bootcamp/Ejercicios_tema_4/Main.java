public class Main {
    public static void main(String[] args) {
        int numeroIf = 0;

        if (numeroIf < 0) {
            System.out.println("La variable " + numeroIf + " es negativa");
        }
        else if(numeroIf > 0) {
            System.out.println("La variable " + numeroIf + " es positiva");
        } else {
            System.out.println("La variable es 0");
        }


        int numeroWhile = 1;

        while(numeroWhile < 3) {
            numeroWhile++;
            System.out.println("La variable ahora vale: " + numeroWhile);
        }


        int numeroDoWhile = 3;
        do {
            numeroDoWhile++;
            System.out.println("La variable ahora vale: " + numeroDoWhile);
        } while(numeroDoWhile < 3);


        for(int numeroFor = 0; numeroFor <= 5; numeroFor++) {
            System.out.println("La variable ahora vale: " + numeroFor);
        }


        String estacion = "invierno";
        switch(estacion) {
            case "verano":
                System.out.println("Estamos en verano");
                break;
            case "invierno":
                System.out.println("Estamos en invierno");
                break;
            case "primavera":
                System.out.println("Estamos en primavera");
                break;
            case "otoño":
                System.out.println("Estamos en otoño");
                break;
            default:
                System.out.println("No es una estación");
        }
    }

}

