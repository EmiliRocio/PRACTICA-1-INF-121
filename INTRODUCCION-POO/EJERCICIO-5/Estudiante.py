# INTRODUCCIÓN A LA PROGRAMACIÓN ORIENTADA A OBJETOS EN PYTHON
#Crea una clase Estudiante con nombre, nota_1, nota_2
#a) Agrega un método para calcular el promedio
#b) Agrega un método para verificar si aprobó (promedio &gt;=6)
#c) Crea tres estudiantes, muestra sus promedios y si aprobaron

class Estudiante:
    
    def __init__(self, nombre, nota_1, nota_2):
        self.nombre = nombre  
        self.nota_1 = nota_1  
        self.nota_2 = nota_2  

    
    def calcular_promedio(self):
        return (self.nota_1 + self.nota_2) / 2

    
    def aprobo(self):
        return self.calcular_promedio() >= 6



estudiante1 = Estudiante("Juan", 7, 8)
estudiante2 = Estudiante("Ana", 5, 6)
estudiante3 = Estudiante("Carlos", 4, 5)

# Mostrar promedios y si aprobaron
print(f"{estudiante1.nombre}: Promedio = {estudiante1.calcular_promedio()}, Aprobó = {estudiante1.aprobo()}")
print(f"{estudiante2.nombre}: Promedio = {estudiante2.calcular_promedio()}, Aprobó = {estudiante2.aprobo()}")
print(f"{estudiante3.nombre}: Promedio = {estudiante3.calcular_promedio()}, Aprobó = {estudiante3.aprobo()}")