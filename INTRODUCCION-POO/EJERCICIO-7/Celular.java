// INTRODUCCIÓN A LA PROGRAMACIÓN ORIENTADA A OBJETOS EN JAVA

import java.util.ArrayList;
import java.util.List;

// Definición de la clase Celular
 public class Celular {
    // Atributos de la clase
    private int espacioTotal = 1024;  // Espacio total en MB
    private int espacioOcupado = 0;   // Espacio ocupado en MB
    private double bateria = 100;     // Batería inicial en 100%
    private List<Aplicacion> aplicaciones = new ArrayList<>();  // Lista de aplicaciones

    // Clase interna para representar una aplicación
    private class Aplicacion {
        String nombre;
        int tamaño;

        public Aplicacion(String nombre, int tamaño) {
            this.nombre = nombre;
            this.tamaño = tamaño;
        }
    }

    // Método para instalar una nueva aplicación
    public void instalarAplicacion(String nombre, int tamaño) {
        if (espacioOcupado + tamaño <= espacioTotal) {
            aplicaciones.add(new Aplicacion(nombre, tamaño));
            espacioOcupado += tamaño;
            System.out.println("Aplicación '" + nombre + "' instalada. Espacio ocupado: " + espacioOcupado + " MB");
        } else {
            System.out.println("No hay suficiente espacio para instalar '" + nombre + "'.");
        }
    }

    // Método para utilizar una aplicación
    public void usarAplicacion(String nombre, int minutos) {
        if (bateria <= 0) {
            System.out.println("Celular apagado. No se puede usar ninguna aplicación.");
            return;
        }

        for (Aplicacion app : aplicaciones) {
            if (app.nombre.equals(nombre)) {
                double consumo;
                if (app.tamaño > 250) {
                    consumo = 5 * (minutos / 10.0);
                } else if (app.tamaño > 100) {
                    consumo = 2 * (minutos / 10.0);
                } else {
                    consumo = 1 * (minutos / 10.0);
                }

                bateria -= consumo;
                if (bateria < 0) {
                    bateria = 0;
                    System.out.println("Celular apagado. Batería agotada al usar '" + nombre + "'.");
                } else {
                    System.out.printf("Usando '%s' por %d minutos. Batería restante: %.2f%%\n", nombre, minutos, bateria);
                }
                return;
            }
        }
        System.out.println("Aplicación '" + nombre + "' no encontrada.");
    }

    // Método para mostrar el porcentaje de batería restante
    public void mostrarBateria() {
        System.out.printf("Batería restante: %.2f%%\n", bateria);
    }

    // Método principal (main) para probar la clase
    public static void main(String[] args) {
        Celular miCelular = new Celular();

        // Instalar aplicaciones
        miCelular.instalarAplicacion("WhatsApp", 50);
        miCelular.instalarAplicacion("Instagram", 120);
        miCelular.instalarAplicacion("Juego Pesado", 300);

        // Usar aplicaciones
        miCelular.usarAplicacion("WhatsApp", 20);
        miCelular.usarAplicacion("Instagram", 30);
        miCelular.usarAplicacion("Juego Pesado", 10);

        // Mostrar batería restante
        miCelular.mostrarBateria();
    }
}