from abc import ABC, abstractmethod

class Animal(ABC):
    def __init__(self, nombre):
        self.nombre = nombre
    
    @abstractmethod
    def hacer_sonido(self):
        pass
    
    @abstractmethod
    def moverse(self):
        pass
    
    def mostrar_info(self):
        print(f"Nombre: {self.nombre}")

class Perro(Animal):
    def __init__(self, nombre, edad, raza):
        super().__init__(nombre)
        self.edad = edad
        self.raza = raza
    
    def hacer_sonido(self):
        print(f"{self.nombre} dice: ¡Guau guau!")
    
    def moverse(self):
        print(f"{self.nombre} está corriendo")
    
    def mostrar_info(self):
        super().mostrar_info()
        print(f"Edad: {self.edad}")
        print(f"Raza: {self.raza}")

class Gato(Animal):
    def __init__(self, nombre, color):
        super().__init__(nombre)
        self.color = color
    
    def hacer_sonido(self):
        print(f"{self.nombre} dice: ¡Miau miau!")
    
    def moverse(self):
        print(f"{self.nombre} está saltando")
    
    def mostrar_info(self):
        super().mostrar_info()
        print(f"Color: {self.color}")

class Pajaro(Animal):
    def __init__(self, nombre, tipo):
        super().__init__(nombre)
        self.tipo = tipo
    
    def hacer_sonido(self):
        print(f"{self.nombre} dice: ¡Pío pío!")
    
    def moverse(self):
        print(f"{self.nombre} está volando")
    
    def mostrar_info(self):
        super().mostrar_info()
        print(f"Tipo: {self.tipo}")

if __name__ == "__main__":
    # a) Instanciar animales
    perro = Perro("Rex", 3, "Labrador")
    gato = Gato("Misi", "Negro")
    pajaro = Pajaro("Piolín", "Canario")
    
    # Mostrar información
    perro.mostrar_info()
    gato.mostrar_info()
    pajaro.mostrar_info()
    
    print()
    
    # b) Hacer sonidos
    perro.hacer_sonido()
    gato.hacer_sonido()
    pajaro.hacer_sonido()
    
    print()
    
    # c) Moverse
    perro.moverse()
    gato.moverse()
    pajaro.moverse()