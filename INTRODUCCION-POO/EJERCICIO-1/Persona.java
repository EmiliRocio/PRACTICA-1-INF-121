// INTRODUCCIÓN A LA PROGRAMACIÓN ORIENTADA A OBJETOS EN JAVA


class Persona {
    // Atributos de la clase
    String nombre;
    int edad;
    String ciudad;

    // Constructor de la clase
    public Persona(String nombre, int edad, String ciudad) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
    }

    // Método para mostrar un saludo
    public String saludo() {
        return "Hola, soy " + this.nombre + " de " + this.ciudad;
    }

    // Método para verificar si es mayor de edad
    public boolean esMayorDeEdad() {
        return this.edad >= 18;  // Retorna true si es mayor de edad, false si no
    }

    // Método principal (main) para probar la clase
    public static void main(String[] args) {
        // Crear tres objetos de la clase Persona
        Persona persona1 = new Persona("Juan", 25, "Madrid");
        Persona persona2 = new Persona("Ana", 17, "Barcelona");
        Persona persona3 = new Persona("Carlos", 30, "Valencia");

        // Mostrar saludos
        System.out.println(persona1.saludo());  // Saludo de persona1
        System.out.println(persona2.saludo());  // Saludo de persona2
        System.out.println(persona3.saludo());  // Saludo de persona3

        // Verificar si son mayores de edad
        System.out.println(persona1.nombre + " es mayor de edad: " + persona1.esMayorDeEdad());
        System.out.println(persona2.nombre + " es mayor de edad: " + persona2.esMayorDeEdad());
        System.out.println(persona3.nombre + " es mayor de edad: " + persona3.esMayorDeEdad());
    }
}