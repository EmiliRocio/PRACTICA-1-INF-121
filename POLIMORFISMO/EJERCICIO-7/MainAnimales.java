abstract class Animal {
    protected String nombre;
    
    public Animal(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract void hacerSonido();
    public abstract void moverse();
    
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
    }
}

class Perro extends Animal {
    private int edad;
    private String raza;
    
    public Perro(String nombre, int edad, String raza) {
        super(nombre);
        this.edad = edad;
        this.raza = raza;
    }
    
    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Guau guau!");
    }
    
    @Override
    public void moverse() {
        System.out.println(nombre + " está corriendo");
    }
    
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Edad: " + edad);
        System.out.println("Raza: " + raza);
    }
}

class Gato extends Animal {
    private String color;
    
    public Gato(String nombre, String color) {
        super(nombre);
        this.color = color;
    }
    
    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Miau miau!");
    }
    
    @Override
    public void moverse() {
        System.out.println(nombre + " está saltando");
    }
    
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Color: " + color);
    }
}

class Pajaro extends Animal {
    private String tipo;
    
    public Pajaro(String nombre, String tipo) {
        super(nombre);
        this.tipo = tipo;
    }
    
    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Pío pío!");
    }
    
    @Override
    public void moverse() {
        System.out.println(nombre + " está volando");
    }
    
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo: " + tipo);
    }
}

public class MainAnimales {
    public static void main(String[] args) {
        // a) Instanciar animales
        Perro perro = new Perro("Rex", 3, "Labrador");
        Gato gato = new Gato("Misi", "Negro");
        Pajaro pajaro = new Pajaro("Piolín", "Canario");
        
        // Mostrar información
        perro.mostrarInfo();
        gato.mostrarInfo();
        pajaro.mostrarInfo();
        
        System.out.println();
        
        // b) Hacer sonidos
        perro.hacerSonido();
        gato.hacerSonido();
        pajaro.hacerSonido();
        
        System.out.println();
        
        // c) Moverse
        perro.moverse();
        gato.moverse();
        pajaro.moverse();
    }
}