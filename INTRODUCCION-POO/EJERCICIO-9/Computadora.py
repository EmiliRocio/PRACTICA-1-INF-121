# INTRODUCCIÓN A LA PROGRAMACIÓN ORIENTADA A OBJETOS EN PYTHON

# Definición de la clase Computadora
class Computadora:
    # Constructor de la clase
    def __init__(self, marca, cpu, ram, almacenamiento):
        self.marca = marca            # Atributo: marca de la computadora
        self.cpu = cpu                # Atributo: CPU de la computadora
        self.ram = ram                # Atributo: RAM de la computadora
        self.almacenamiento = almacenamiento  # Atributo: almacenamiento de la computadora
        self.encendida = False        # Atributo: estado de la computadora (apagada por defecto)

    # Método para mostrar los componentes principales
    def mostrar_componentes(self):
        print(f"Componentes de la computadora {self.marca}:")
        print(f"CPU: {self.cpu}")
        print(f"RAM: {self.ram} GB")
        print(f"Almacenamiento: {self.almacenamiento} GB")

    # Método para encender la computadora
    def encender(self):
        if not self.encendida:
            self.encendida = True
            print(f"La computadora {self.marca} está encendida.")
        else:
            print(f"La computadora {self.marca} ya está encendida.")

    # Método para apagar la computadora
    def apagar(self):
        if self.encendida:
            self.encendida = False
            print(f"La computadora {self.marca} está apagada.")
        else:
            print(f"La computadora {self.marca} ya está apagada.")

    # Método para mostrar el estado de la computadora
    def mostrar_estado(self):
        estado = "encendida" if self.encendida else "apagada"
        print(f"La computadora {self.marca} está {estado}.")


# Crear una instancia de la clase Computadora
mi_computadora = Computadora("Dell", "Intel i7", 16, 512)

# Mostrar los componentes principales
mi_computadora.mostrar_componentes()

# Simular encender y apagar la computadora
mi_computadora.encender()
mi_computadora.mostrar_estado()

mi_computadora.apagar()
mi_computadora.mostrar_estado()