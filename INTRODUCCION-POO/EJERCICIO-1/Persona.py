# INTRODUCCIÓN A LA PROGRAMACIÓN ORIENTADA A OBJETOS EN PYTHON
#Crea una clase Persona con nombre, edad y ciudad
#a) Agrega un método para mostrar el saludo: “Hola, soy {nombre} de {ciudad}”
#b) Crea tres personas y muestra su saludo
#c) Agrega un método para verificar si es mayor de edad

class Persona:
    
    def __init__(self, nombre, edad, ciudad):
        self.nombre = nombre  
        self.edad = edad      
        self.ciudad = ciudad  

    
    def saludo(self):
        return f"Hola, soy {self.nombre} de {self.ciudad}"

    
    def es_mayor_de_edad(self):
        return self.edad >= 18  



persona1 = Persona("Juan", 25, "Madrid")
persona2 = Persona("Ana", 17, "Barcelona")
persona3 = Persona("Carlos", 30, "Valencia")

# Mostrar saludos
print(persona1.saludo()) 
print(persona2.saludo())  
print(persona3.saludo())  

# Verificar si son mayores de edad
print(f"{persona1.nombre} es mayor de edad: {persona1.es_mayor_de_edad()}")
print(f"{persona2.nombre} es mayor de edad: {persona2.es_mayor_de_edad()}")
print(f"{persona3.nombre} es mayor de edad: {persona3.es_mayor_de_edad()}")