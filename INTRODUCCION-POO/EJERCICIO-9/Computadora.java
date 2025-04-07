// INTRODUCCIÓN A LA PROGRAMACIÓN ORIENTADA A OBJETOS EN JAVA

// Definición de la clase Computadora
class Computadora {
    // Atributos de la clase
    private String marca;
    private String cpu;
    private int ram;
    private int almacenamiento;
    private boolean encendida;

    // Constructor de la clase
    public Computadora(String marca, String cpu, int ram, int almacenamiento) {
        this.marca = marca;
        this.cpu = cpu;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.encendida = false;  // Estado inicial: apagada
    }

    // Método para mostrar los componentes principales
    public void mostrarComponentes() {
        System.out.println("Componentes de la computadora " + this.marca + ":");
        System.out.println("CPU: " + this.cpu);
        System.out.println("RAM: " + this.ram + " GB");
        System.out.println("Almacenamiento: " + this.almacenamiento + " GB");
    }

    // Método para encender la computadora
    public void encender() {
        if (!this.encendida) {
            this.encendida = true;
            System.out.println("La computadora " + this.marca + " está encendida.");
        } else {
            System.out.println("La computadora " + this.marca + " ya está encendida.");
        }
    }

    // Método para apagar la computadora
    public void apagar() {
        if (this.encendida) {
            this.encendida = false;
            System.out.println("La computadora " + this.marca + " está apagada.");
        } else {
            System.out.println("La computadora " + this.marca + " ya está apagada.");
        }
    }

    // Método para mostrar el estado de la computadora
    public void mostrarEstado() {
        String estado = this.encendida ? "encendida" : "apagada";
        System.out.println("La computadora " + this.marca + " está " + estado + ".");
    }

    // Método principal (main) para probar la clase
    public static void main(String[] args) {
        // Crear una instancia de la clase Computadora
        Computadora miComputadora = new Computadora("Dell", "Intel i7", 16, 512);

        // Mostrar los componentes principales
        miComputadora.mostrarComponentes();

        // Simular encender y apagar la computadora
        miComputadora.encender();
        miComputadora.mostrarEstado();

        miComputadora.apagar();
        miComputadora.mostrarEstado();
    }
}