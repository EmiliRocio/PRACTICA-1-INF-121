# INTRODUCCIÓN A LA PROGRAMACIÓN ORIENTADA A OBJETOS EN PYTHON
#Crea una clase Coche con marca, modelo y velocidad
#a) Agrega un método acelerar () que aumente la velocidad en 10
#b) Agrega un método frenar () que disminuya la velocidad en 5
#c) Crea dos coches, aceléralos, frénalos y muestra sus velocidades

class Coche:
    
    def __init__(self, marca, modelo):
        self.marca = marca    
        self.modelo = modelo    
        self.velocidad = 0 

    
    def acelerar(self):
        self.velocidad += 10
        print(f"{self.marca} {self.modelo} aceleró. Velocidad actual: {self.velocidad} km/h")

    
    def frenar(self):
        if self.velocidad >= 5:  
            self.velocidad -= 5
        else:
            self.velocidad = 0
        print(f"{self.marca} {self.modelo} frenó. Velocidad actual: {self.velocidad} km/h")



coche1 = Coche("Toyota", "Corolla")
coche2 = Coche("Ford", "Mustang")


coche1.acelerar()  
coche1.acelerar()  
coche1.frenar()    

coche2.acelerar()  
coche2.frenar()    