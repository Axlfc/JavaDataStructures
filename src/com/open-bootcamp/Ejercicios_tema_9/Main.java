public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();
        cliente.nombre = "Francesc";
        cliente.edad = 27;
        cliente.telefono = 699696969;
        cliente.credito = 128.56;
        System.out.println("Soy " + cliente.nombre + ", tengo " + cliente.edad + " años, mi teléfono es " + cliente.telefono
                + " y mi crédito disponible es de " + cliente.credito + "€");

        trabajador.nombre = "Paco";
        trabajador.edad = 69;
        trabajador.telefono = 722727272;
        trabajador.salario = 2001.37;
        System.out.println("Soy " + trabajador.nombre + ", tengo " + trabajador.edad + " años, mi teléfono es " + trabajador.telefono
                + " y mi salario es de " + trabajador.salario + "€");
    }
}

class Persona{
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona{
    double credito;
}

class Trabajador extends Persona {
    double salario;
}