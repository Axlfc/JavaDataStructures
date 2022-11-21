public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Francesc");
        System.out.println("Mi nombre es " + persona.getNombre());
        persona.setEdad(27);
        System.out.println("Tengo " + persona.getEdad() + " años");
        persona.setTelefono(699696969);
        System.out.println("Mi teléfono es " + persona.getTelefono());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;


    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }


    public void setTelefono(int telefono){
        this.telefono = telefono;
    }

    public int getTelefono() {
        return telefono;
    }
}