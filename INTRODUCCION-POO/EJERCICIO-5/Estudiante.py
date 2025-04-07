# INTRODUCCIÓN A LA PROGRAMACIÓN ORIENTADA A OBJETOS EN PYTHON

# Definición de la clase Estudiante
class Estudiante:
    # Constructor de la clase
    def __init__(self, nombre, nota_1, nota_2):
        self.nombre = nombre  # Atributo: nombre
        self.nota_1 = nota_1  # Atributo: nota_1
        self.nota_2 = nota_2  # Atributo: nota_2

    # Método para calcular el promedio
    def calcular_promedio(self):
        return (self.nota_1 + self.nota_2) / 2

    # Método para verificar si aprobó (promedio >= 6)
    def aprobo(self):
        return self.calcular_promedio() >= 6


# Crear tres objetos de la clase Estudiante
estudiante1 = Estudiante("Juan", 7, 8)
estudiante2 = Estudiante("Ana", 5, 6)
estudiante3 = Estudiante("Carlos", 4, 5)

# Mostrar promedios y si aprobaron
print(f"{estudiante1.nombre}: Promedio = {estudiante1.calcular_promedio()}, Aprobó = {estudiante1.aprobo()}")
print(f"{estudiante2.nombre}: Promedio = {estudiante2.calcular_promedio()}, Aprobó = {estudiante2.aprobo()}")
print(f"{estudiante3.nombre}: Promedio = {estudiante3.calcular_promedio()}, Aprobó = {estudiante3.aprobo()}")