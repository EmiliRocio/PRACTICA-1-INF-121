// INTRODUCCIÓN A LA PROGRAMACIÓN ORIENTADA A OBJETOS EN JAVA
//*Crea una clase Persona con nombre, edad y ciudad
//a) Agrega un método para mostrar el saludo: “Hola, soy {nombre} de {ciudad}”
//b) Crea tres personas y muestra su saludo
//c) Agrega un método para verificar si es mayor de edad

class Persona {
    
    String nombre;
    int edad;
    String ciudad;

    
    public Persona(String nombre, int edad, String ciudad) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
    }

    
    public String saludo() {
        return "Hola, soy " + this.nombre + " de " + this.ciudad;
    }

    
    public boolean esMayorDeEdad() {
        return this.edad >= 18;  
    }

    
    public static void main(String[] args) {
        
        Persona persona1 = new Persona("Juan", 25, "Madrid");
        Persona persona2 = new Persona("Ana", 17, "Barcelona");
        Persona persona3 = new Persona("Carlos", 30, "Valencia");

        // Mostrar saludos
        System.out.println(persona1.saludo());  
        System.out.println(persona2.saludo());  
        System.out.println(persona3.saludo());  

        // Verificar si son mayores de edad
        System.out.println(persona1.nombre + " es mayor de edad: " + persona1.esMayorDeEdad());
        System.out.println(persona2.nombre + " es mayor de edad: " + persona2.esMayorDeEdad());
        System.out.println(persona3.nombre + " es mayor de edad: " + persona3.esMayorDeEdad());
    }
}