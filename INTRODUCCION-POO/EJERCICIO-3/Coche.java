// INTRODUCCIÓN A LA PROGRAMACIÓN ORIENTADA A OBJETOS EN JAVA

// Definición de la clase Coche
class Coche {
    // Atributos de la clase
    String marca;
    String modelo;
    int velocidad;

    // Constructor de la clase
    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = 0;  // Velocidad inicial en 0
    }

    // Método para acelerar (aumenta la velocidad en 10)
    public void acelerar() {
        this.velocidad += 10;
        System.out.println(this.marca + " " + this.modelo + " aceleró. Velocidad actual: " + this.velocidad + " km/h");
    }

    // Método para frenar (disminuye la velocidad en 5)
    public void frenar() {
        if (this.velocidad >= 5) {  // Evita que la velocidad sea negativa
            this.velocidad -= 5;
        } else {
            this.velocidad = 0;
        }
        System.out.println(this.marca + " " + this.modelo + " frenó. Velocidad actual: " + this.velocidad + " km/h");
    }

    // Método principal (main) para probar la clase
    public static void main(String[] args) {
        // Crear dos objetos de la clase Coche
        Coche coche1 = new Coche("Toyota", "Corolla");
        Coche coche2 = new Coche("Ford", "Mustang");

        // Acelerar y frenar los coches
        coche1.acelerar();  // Acelerar coche1
        coche1.acelerar();  // Acelerar coche1 nuevamente
        coche1.frenar();    // Frenar coche1

        coche2.acelerar();  // Acelerar coche2
        coche2.frenar();    // Frenar coche2
    }
} 