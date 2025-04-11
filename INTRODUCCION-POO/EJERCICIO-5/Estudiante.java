// INTRODUCCIÓN A LA PROGRAMACIÓN ORIENTADA A OBJETOS EN JAVA
//Crea una clase Estudiante con nombre, nota_1, nota_2
//a) Agrega un método para calcular el promedio
//b) Agrega un método para verificar si aprobó (promedio >=6)
//c) Crea tres estudiantes, muestra sus promedios y si aprobaron

class Estudiante {
    
    String nombre;
    double nota1;
    double nota2;

    public Estudiante(String nombre, double nota1, double nota2) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    
    public double calcularPromedio() {
        return (this.nota1 + this.nota2) / 2;
    }

    
    public boolean aprobo() {
        return this.calcularPromedio() >= 6;
    }

    
    public static void main(String[] args) {
        
        Estudiante estudiante1 = new Estudiante("Juan", 7, 8);
        Estudiante estudiante2 = new Estudiante("Ana", 5, 6);
        Estudiante estudiante3 = new Estudiante("Carlos", 4, 5);

        // Mostrar promedios y si aprobaron
        System.out.println(estudiante1.nombre + ": Promedio = " + estudiante1.calcularPromedio() + ", Aprobó = " + estudiante1.aprobo());
        System.out.println(estudiante2.nombre + ": Promedio = " + estudiante2.calcularPromedio() + ", Aprobó = " + estudiante2.aprobo());
        System.out.println(estudiante3.nombre + ": Promedio = " + estudiante3.calcularPromedio() + ", Aprobó = " + estudiante3.aprobo());
    }
}