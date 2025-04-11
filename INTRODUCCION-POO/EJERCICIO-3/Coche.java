// INTRODUCCIÓN A LA PROGRAMACIÓN ORIENTADA A OBJETOS EN JAVA
//Crea una clase Coche con marca, modelo y velocidad
//a) Agrega un método acelerar () que aumente la velocidad en 10
//b) Agrega un método frenar () que disminuya la velocidad en 5
//c) Crea dos coches, aceléralos, frénalos y muestra sus velocidades

class Coche {
    
    String marca;
    String modelo;
    int velocidad;

    
    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = 0;  
    }

    
    public void acelerar() {
        this.velocidad += 10;
        System.out.println(this.marca + " " + this.modelo + " aceleró. Velocidad actual: " + this.velocidad + " km/h");
    }

    
    public void frenar() {
        if (this.velocidad >= 5) {  
            this.velocidad -= 5;
        } else {
            this.velocidad = 0;
        }
        System.out.println(this.marca + " " + this.modelo + " frenó. Velocidad actual: " + this.velocidad + " km/h");
    }

    
    public static void main(String[] args) {
        
        Coche coche1 = new Coche("Toyota", "Corolla");
        Coche coche2 = new Coche("Ford", "Mustang");

        
        coche1.acelerar();  
        coche1.acelerar();  
        coche1.frenar();    

        coche2.acelerar();  
        coche2.frenar();    
    }
} 