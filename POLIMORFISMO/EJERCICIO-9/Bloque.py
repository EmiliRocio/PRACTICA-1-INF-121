from abc import ABC, abstractmethod

class Bloque(ABC):
    @abstractmethod
    def accion(self):
        pass
    
    @abstractmethod
    def romper(self):
        pass
    
    def colocar(self, orientacion="el suelo"):
        print(f"Bloque colocado en {orientacion}")

class BloqueCofre(Bloque):
    def __init__(self, capacidad, resistencia, tipo):
        self.capacidad = capacidad
        self.resistencia = resistencia
        self.tipo = tipo
    
    def accion(self):
        print(f"Abriendo cofre de tipo {self.tipo} con capacidad {self.capacidad}")
    
    def romper(self):
        print("Rompiendo cofre... ¡Puede soltar objetos!")

class BloqueTnt(Bloque):
    def __init__(self, danio):
        self.danio = danio
    
    def accion(self):
        print(f"¡Explotando TNT con daño {self.danio}!")
    
    def romper(self):
        print("¡Cuidado! Romper TNT puede hacerla explotar")

class BloqueHorno(Bloque):
    def __init__(self, capacidad_comida):
        self.capacidad_comida = capacidad_comida
    
    def accion(self):
        print(f"Cocinando comida en horno (capacidad: {self.capacidad_comida})")
    
    def romper(self):
        print("Rompiendo horno... ¡Puede soltar comida cocinada!")
    
    def colocar(self, orientacion="el suelo"):
        if orientacion == "el suelo":
            print("Horno colocado con la abertura hacia el frente")
        else:
            print(f"Horno colocado en {orientacion}")

if __name__ == "__main__":
    # a) Instanciar bloques
    cofre1 = BloqueCofre(27, 10, "Roble")
    cofre2 = BloqueCofre(54, 15, "Ender")
    tnt1 = BloqueTnt(10)
    tnt2 = BloqueTnt(20)
    horno1 = BloqueHorno(3)
    horno2 = BloqueHorno(6)
    
    bloques = [cofre1, cofre2, tnt1, tnt2, horno1, horno2]
    
    # b) Acciones de bloques
    for bloque in bloques:
        bloque.accion()
    
    print()
    
    # c) Colocar bloques
    cofre1.colocar()
    tnt1.colocar("la pared")
    horno1.colocar()
    horno2.colocar("el techo")
    
    print()
    
    # d) Romper bloques
    for bloque in bloques:
        bloque.romper()