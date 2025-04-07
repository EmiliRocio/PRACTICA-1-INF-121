# INTRODUCCIÓN A LA PROGRAMACIÓN ORIENTADA A OBJETOS EN PYTHON

# Definición de la clase Persona
class Persona:
    # Constructor de la clase
    def __init__(self, nombre, edad, ciudad):
        self.nombre = nombre  # Atributo: nombre
        self.edad = edad      # Atributo: edad
        self.ciudad = ciudad  # Atributo: ciudad

    # Método para mostrar un saludo
    def saludo(self):
        return f"Hola, soy {self.nombre} de {self.ciudad}"

    # Método para verificar si es mayor de edad
    def es_mayor_de_edad(self):
        return self.edad >= 18  # Retorna True si es mayor de edad, False si no


# Crear tres objetos de la clase Persona
persona1 = Persona("Juan", 25, "Madrid")
persona2 = Persona("Ana", 17, "Barcelona")
persona3 = Persona("Carlos", 30, "Valencia")

# Mostrar saludos
print(persona1.saludo())  # Saludo de persona1
print(persona2.saludo())  # Saludo de persona2
print(persona3.saludo())  # Saludo de persona3

# Verificar si son mayores de edad
print(f"{persona1.nombre} es mayor de edad: {persona1.es_mayor_de_edad()}")
print(f"{persona2.nombre} es mayor de edad: {persona2.es_mayor_de_edad()}")
print(f"{persona3.nombre} es mayor de edad: {persona3.es_mayor_de_edad()}")