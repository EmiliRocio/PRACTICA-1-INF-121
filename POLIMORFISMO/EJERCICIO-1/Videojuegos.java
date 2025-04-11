//a) Instanciar al menos 2 videojuegos
//b) Sobrecargar el constructor 2 veces
//c) Implementar un método mostrar()
//d) Sobrecargar el método agregarJugadores() donde en el primero se agregue solo 1 jugador y en otro se ingrese una cantidad de jugadores a aumentar.
public class Videojuego {
    private String nombre;
    private String plataforma;
    private int cantidadJugadores;
    
    // Constructor por defecto
    public Videojuego() {
        this.nombre = "Desconocido";
        this.plataforma = "Multiplataforma";
        this.cantidadJugadores = 1;
    }
    
    // Constructor sobrecargado 1
    public Videojuego(String nombre, String plataforma) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.cantidadJugadores = 1;
    }
    
    // Constructor sobrecargado 2
    public Videojuego(String nombre, String plataforma, int cantidadJugadores) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.cantidadJugadores = cantidadJugadores;
    }
    
    // Método mostrar
    public void mostrar() {
        System.out.println("Videojuego: " + nombre);
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Jugadores: " + cantidadJugadores);
    }
    
    // Método agregarJugadores (sobrecarga 1)
    public void agregarJugadores() {
        cantidadJugadores++;
    }
    
    // Método agregarJugadores (sobrecarga 2)
    public void agregarJugadores(int cantidad) {
        cantidadJugadores += cantidad;
    }
    
    // Instanciación de 2 videojuegos (punto a)
    public static void main(String[] args) {
        Videojuego juego1 = new Videojuego("The Legend of Zelda", "Nintendo Switch");
        Videojuego juego2 = new Videojuego("FIFA 23", "PlayStation 5", 4);
        
        juego1.mostrar();
        juego2.mostrar();
        
        juego1.agregarJugadores(); // Añade 1 jugador
        juego2.agregarJugadores(2); // Añade 2 jugadores
        
        System.out.println("\nDespués de agregar jugadores:");
        juego1.mostrar();
        juego2.mostrar();
    }
}