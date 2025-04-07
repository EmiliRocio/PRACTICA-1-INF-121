# INTRODUCCIÓN A LA PROGRAMACIÓN ORIENTADA A OBJETOS EN PYTHON

# Definición de la clase Celular
class Celular:
    # Constructor de la clase
    def __init__(self):
        self.espacio_total = 1024  # Espacio total en MB
        self.espacio_ocupado = 0   # Espacio ocupado en MB
        self.bateria = 100         # Batería inicial en 100%
        self.aplicaciones = []     # Lista de aplicaciones instaladas

    # Método para instalar una nueva aplicación
    def instalar_aplicacion(self, nombre, tamaño):
        if self.espacio_ocupado + tamaño <= self.espacio_total:
            self.aplicaciones.append({"nombre": nombre, "tamaño": tamaño})
            self.espacio_ocupado += tamaño
            print(f"Aplicación '{nombre}' instalada. Espacio ocupado: {self.espacio_ocupado} MB")
        else:
            print(f"No hay suficiente espacio para instalar '{nombre}'.")

    # Método para utilizar una aplicación
    def usar_aplicacion(self, nombre, minutos):
        if self.bateria <= 0:
            print("Celular apagado. No se puede usar ninguna aplicación.")
            return

        for app in self.aplicaciones:
            if app["nombre"] == nombre:
                tamaño = app["tamaño"]
                if tamaño > 250:
                    consumo = 5 * (minutos / 10)
                elif tamaño > 100:
                    consumo = 2 * (minutos / 10)
                else:
                    consumo = 1 * (minutos / 10)

                self.bateria -= consumo
                if self.bateria < 0:
                    self.bateria = 0
                    print(f"Celular apagado. Batería agotada al usar '{nombre}'.")
                else:
                    print(f"Usando '{nombre}' por {minutos} minutos. Batería restante: {self.bateria:.2f}%")
                return
        print(f"Aplicación '{nombre}' no encontrada.")

    # Método para mostrar el porcentaje de batería restante
    def mostrar_bateria(self):
        print(f"Batería restante: {self.bateria:.2f}%")


# Crear un objeto de la clase Celular
mi_celular = Celular()

# Instalar aplicaciones
mi_celular.instalar_aplicacion("WhatsApp", 50)
mi_celular.instalar_aplicacion("Instagram", 120)
mi_celular.instalar_aplicacion("Juego Pesado", 300)

# Usar aplicaciones
mi_celular.usar_aplicacion("WhatsApp", 20)
mi_celular.usar_aplicacion("Instagram", 30)
mi_celular.usar_aplicacion("Juego Pesado", 10)

# Mostrar batería restante
mi_celular.mostrar_bateria()