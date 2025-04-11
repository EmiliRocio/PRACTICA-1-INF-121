abstract class Ambiente {
    public abstract void mostrar();
    public abstract int cantidadMuebles();
    public int cantidadMuebles(int adicional) {
        return cantidadMuebles() + adicional;
    }
}

class Oficina extends Ambiente {
    private int mrSillas;
    private int mrEscritorios;
    private int mrEstanterias;
    
    public Oficina(int sillas, int escritorios, int estanterias) {
        this.mrSillas = sillas;
        this.mrEscritorios = escritorios;
        this.mrEstanterias = estanterias;
    }
    
    @Override
    public void mostrar() {
        System.out.println("Oficina:");
        System.out.println("Sillas: " + mrSillas);
        System.out.println("Escritorios: " + mrEscritorios);
        System.out.println("Estanterías: " + mrEstanterias);
    }
    
    @Override
    public int cantidadMuebles() {
        return mrSillas + mrEscritorios + mrEstanterias;
    }
}

class Aula extends Ambiente {
    private String nombre;
    private int capacidad;
    private int proyectores;
    
    public Aula(String nombre, int capacidad, int proyectores) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.proyectores = proyectores;
    }
    
    @Override
    public void mostrar() {
        System.out.println("Aula " + nombre + ":");
        System.out.println("Capacidad: " + capacidad);
        System.out.println("Proyectores: " + proyectores);
    }
    
    @Override
    public int cantidadMuebles() {
        return capacidad + proyectores; // Asumiendo que las sillas son muebles
    }
}

class Laboratorio extends Ambiente {
    private String nombre;
    private int capacidad;
    private int mobiliario;
    
    public Laboratorio(String nombre, int capacidad, int mobiliario) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.mobiliario = mobiliario;
    }
    
    @Override
    public void mostrar() {
        System.out.println("Laboratorio " + nombre + ":");
        System.out.println("Capacidad: " + capacidad);
        System.out.println("Mobiliario especial: " + mobiliario);
    }
    
    @Override
    public int cantidadMuebles() {
        return capacidad + mobiliario;
    }
}

public class MainAmbientes {
    public static void main(String[] args) {
        // a) Instanciar objetos
        Oficina oficina1 = new Oficina(10, 5, 3);
        Oficina oficina2 = new Oficina(8, 4, 2);
        Aula aula1 = new Aula("A101", 30, 2);
        Aula aula2 = new Aula("B205", 25, 1);
        Laboratorio lab1 = new Laboratorio("L303", 20, 15);
        
        // b) Mostrar datos
        Ambiente[] ambientes = {oficina1, oficina2, aula1, aula2, lab1};
        for (Ambiente amb : ambientes) {
            amb.mostrar();
            System.out.println("Total muebles: " + amb.cantidadMuebles());
            System.out.println("Total con 5 extras: " + amb.cantidadMuebles(5));
            System.out.println();
        }
    }
}