// INTRODUCCIÓN A LA PROGRAMACIÓN ORIENTADA A OBJETOS EN JAVA

// Definición de la clase Estudiante
class Estudiante {
    // Atributos de la clase
    String nombre;
    double nota1;
    double nota2;

    // Constructor de la clase
    public Estudiante(String nombre, double nota1, double nota2) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    // Método para calcular el promedio
    public double calcularPromedio() {
        return (this.nota1 + this.nota2) / 2;
    }

    // Método para verificar si aprobó (promedio >= 6)
    public boolean aprobo() {
        return this.calcularPromedio() >= 6;
    }

    // Método principal (main) para probar la clase
    public static void main(String[] args) {
        // Crear tres objetos de la clase Estudiante
        Estudiante estudiante1 = new Estudiante("Juan", 7, 8);
        Estudiante estudiante2 = new Estudiante("Ana", 5, 6);
        Estudiante estudiante3 = new Estudiante("Carlos", 4, 5);

        // Mostrar promedios y si aprobaron
        System.out.println(estudiante1.nombre + ": Promedio = " + estudiante1.calcularPromedio() + ", Aprobó = " + estudiante1.aprobo());
        System.out.println(estudiante2.nombre + ": Promedio = " + estudiante2.calcularPromedio() + ", Aprobó = " + estudiante2.aprobo());
        System.out.println(estudiante3.nombre + ": Promedio = " + estudiante3.calcularPromedio() + ", Aprobó = " + estudiante3.aprobo());
    }
}