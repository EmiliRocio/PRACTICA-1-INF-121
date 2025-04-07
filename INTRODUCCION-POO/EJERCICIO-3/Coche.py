# INTRODUCCIÓN A LA PROGRAMACIÓN ORIENTADA A OBJETOS EN PYTHON

# Definición de la clase Coche
class Coche:
    # Constructor de la clase
    def __init__(self, marca, modelo):
        self.marca = marca      # Atributo: marca
        self.modelo = modelo    # Atributo: modelo
        self.velocidad = 0      # Atributo: velocidad (inicialmente 0)

    # Método para acelerar (aumenta la velocidad en 10)
    def acelerar(self):
        self.velocidad += 10
        print(f"{self.marca} {self.modelo} aceleró. Velocidad actual: {self.velocidad} km/h")

    # Método para frenar (disminuye la velocidad en 5)
    def frenar(self):
        if self.velocidad >= 5:  # Evita que la velocidad sea negativa
            self.velocidad -= 5
        else:
            self.velocidad = 0
        print(f"{self.marca} {self.modelo} frenó. Velocidad actual: {self.velocidad} km/h")


# Crear dos objetos de la clase Coche
coche1 = Coche("Toyota", "Corolla")
coche2 = Coche("Ford", "Mustang")

# Acelerar y frenar los coches
coche1.acelerar()  # Acelerar coche1
coche1.acelerar()  # Acelerar coche1 nuevamente
coche1.frenar()    # Frenar coche1

coche2.acelerar()  # Acelerar coche2
coche2.frenar()    # Frenar coche2