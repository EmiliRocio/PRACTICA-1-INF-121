from abc import ABC, abstractmethod

class Ambiente(ABC):
    @abstractmethod
    def mostrar(self):
        pass
    
    @abstractmethod
    def cantidad_muebles(self):
        pass
    
    def cantidad_muebles(self, adicional=0):
        return self.cantidad_muebles() + adicional

class Oficina(Ambiente):
    def __init__(self, sillas, escritorios, estanterias):
        self.mr_sillas = sillas
        self.mr_escritorios = escritorios
        self.mr_estanterias = estanterias
    
    def mostrar(self):
        print("Oficina:")
        print(f"Sillas: {self.mr_sillas}")
        print(f"Escritorios: {self.mr_escritorios}")
        print(f"Estanterías: {self.mr_estanterias}")
    
    def cantidad_muebles(self):
        return self.mr_sillas + self.mr_escritorios + self.mr_estanterias

class Aula(Ambiente):
    def __init__(self, nombre, capacidad, proyectores):
        self.nombre = nombre
        self.capacidad = capacidad
        self.proyectores = proyectores
    
    def mostrar(self):
        print(f"Aula {self.nombre}:")
        print(f"Capacidad: {self.capacidad}")
        print(f"Proyectores: {self.proyectores}")
    
    def cantidad_muebles(self):
        return self.capacidad + self.proyectores

class Laboratorio(Ambiente):
    def __init__(self, nombre, capacidad, mobiliario):
        self.nombre = nombre
        self.capacidad = capacidad
        self.mobiliario = mobiliario
    
    def mostrar(self):
        print(f"Laboratorio {self.nombre}:")
        print(f"Capacidad: {self.capacidad}")
        print(f"Mobiliario especial: {self.mobiliario}")
    
    def cantidad_muebles(self):
        return self.capacidad + self.mobiliario

if __name__ == "__main__":
    #  Instanciar objetos
    oficina1 = Oficina(10, 5, 3)
    oficina2 = Oficina(8, 4, 2)
    aula1 = Aula("A101", 30, 2)
    aula2 = Aula("B205", 25, 1)
    lab1 = Laboratorio("L303", 20, 15)
    
    #  Mostrar datos
    ambientes = [oficina1, oficina2, aula1, aula2, lab1]
    for amb in ambientes:
        amb.mostrar()
        print(f"Total muebles: {amb.cantidad_muebles()}")
        print(f"Total con 5 extras: {amb.cantidad_muebles(5)}")
        print()