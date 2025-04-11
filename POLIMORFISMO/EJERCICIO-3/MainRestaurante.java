// Clase base Empleado
//a) Instanciar 1 Cocinero, 2 objetos Mesero y 2 objetos Administrativo.
//b) Sobrecargar el método SueldoTotal para mostrar el sueldo total, sumándole las horas extra, considerando el sueldo por hora y la propina en caso de los meseros.
//c) Sobrecargar el método para mostrar a aquellos Empleados que tengan SueldoMes igual a X.
abstract class Restaurante {
    protected String nombre;
    protected Number sueldobase;
    
    public Restaurante(String nombre, Number sueldobase) {
        this.nombre = nombre;
        this.sueldobase = sueldobase;
    }
    
    public abstract Number sueldoTotal();
    
    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Sueldo base: " + sueldobase);
    }
    
    public static void mostrarPorSueldo(Restaurante[] empleados, Number x) {
        for (Restaurante emp : empleados) {
            if (emp.sueldobase.equals(x)) {
                emp.mostrar();
            }
        }
    }
}

class Cocinero extends Restaurante {
    private int horasExtra;
    private float sueldoHora;
    
    public Cocinero(String nombre, int sueldobase, int horasExtra, float sueldoHora) {
        super(nombre, sueldobase);
        this.horasExtra = horasExtra;
        this.sueldoHora = sueldoHora;
    }
    
    @Override
    public Number sueldoTotal() {
        return sueldobase.intValue() + (horasExtra * sueldoHora);
    }
    
    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Horas extra: " + horasExtra);
        System.out.println("Sueldo por hora: " + sueldoHora);
        System.out.println("Sueldo total: " + sueldoTotal());
    }
}

class Mesero extends Restaurante {
    private int horasExtra;
    private float sueldoHora;
    private float propina;
    
    public Mesero(String nombre, int sueldobase, int horasExtra, float sueldoHora, float propina) {
        super(nombre, sueldobase);
        this.horasExtra = horasExtra;
        this.sueldoHora = sueldoHora;
        this.propina = propina;
    }
    
    @Override
    public Number sueldoTotal() {
        return sueldobase.intValue() + (horasExtra * sueldoHora) + propina;
    }
    
    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Horas extra: " + horasExtra);
        System.out.println("Sueldo por hora: " + sueldoHora);
        System.out.println("Propina: " + propina);
        System.out.println("Sueldo total: " + sueldoTotal());
    }
}

class Administrativo extends Restaurante {
    private String cargo;
    
    public Administrativo(String nombre, float sueldobase, String cargo) {
        super(nombre, sueldobase);
        this.cargo = cargo;
    }
    
    @Override
    public Number sueldoTotal() {
        return sueldobase;
    }
    
    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Cargo: " + cargo);
        System.out.println("Sueldo total: " + sueldoTotal());
    }
}

public class MainRestaurante {
    public static void main(String[] args) {
        // a) Instanciar empleados
        Cocinero cocinero = new Cocinero("Juan", 2000, 10, 15.5f);
        Mesero mesero1 = new Mesero("Pedro", 1500, 8, 10.0f, 200.0f);
        Mesero mesero2 = new Mesero("Maria", 1600, 5, 10.0f, 150.0f);
        Administrativo admin1 = new Administrativo("Laura", 2500.0f, "Gerente");
        Administrativo admin2 = new Administrativo("Carlos", 1800.0f, "Asistente");
        
        // b) Mostrar sueldos totales
        Restaurante[] empleados = {cocinero, mesero1, mesero2, admin1, admin2};
        for (Restaurante emp : empleados) {
            emp.mostrar();
            System.out.println();
        }
        
        // c) Mostrar empleados con sueldobase = 1500
        System.out.println("\nEmpleados con sueldo base = 1500:");
        Restaurante.mostrarPorSueldo(empleados, 1500);
    }
}