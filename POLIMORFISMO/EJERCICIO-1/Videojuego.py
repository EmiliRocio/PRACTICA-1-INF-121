#a) Instanciar al menos 2 videojuegos
#b) Sobrecargar el constructor 2 veces
#c) Implementar un método mostrar()
#d) Sobrecargar el método agregarJugadores() donde en el primero se agregue solo 1 jugador y en otro se ingrese una cantidad de jugadores a aumentar.
class Videojuego:
    def __init__(self, nombre="Desconocido", plataforma="Multiplataforma", cantidad_jugadores=1):
        """Constructor con parámetros opcionales (sobrecargado)"""
        self.nombre = nombre
        self.plataforma = plataforma
        self.cantidad_jugadores = cantidad_jugadores
    
    def mostrar(self):
        """Muestra los detalles del videojuego"""
        print(f"Videojuego: {self.nombre}")
        print(f"Plataforma: {self.plataforma}")
        print(f"Jugadores: {self.cantidad_jugadores}")
    
    def agregar_jugadores(self, cantidad=1):
        """Agrega jugadores (sobrecargado)"""
        self.cantidad_jugadores += cantidad

# Instanciación de 2 videojuegos (punto a)
if __name__ == "__main__":
    juego1 = Videojuego("The Legend of Zelda", "Nintendo Switch")
    juego2 = Videojuego("FIFA 23", "PlayStation 5", 4)
    
    juego1.mostrar()
    juego2.mostrar()
    
    juego1.agregar_jugadores()  # Añade 1 jugador (valor por defecto)
    juego2.agregar_jugadores(2)  # Añade 2 jugadores
    
    print("\nDespués de agregar jugadores:")
    juego1.mostrar()
    juego2.mostrar()