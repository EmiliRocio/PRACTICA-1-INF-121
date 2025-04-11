#a) Instanciar 1 Cocinero, 2 objetos Mesero y 2 objetos Administrativo.
#b) Sobrecargar el método SueldoTotal para mostrar el sueldo total,sumándole las horas extra, considerando el sueldo por hora y la propina en caso de los meseros.
#c) Sobrecargar el método para mostrar a aquellos Empleados que tengan SueldoMes igual a X.
from abc import ABC, abstractmethod

class Empleado(ABC):
    def __init__(self, nombre, sueldobase):
        self.nombre = nombre
        self.sueldobase = sueldobase
    
    @abstractmethod
    def sueldo_total(self):
        pass
    
    def mostrar(self):
        print(f"Nombre: {self.nombre}")
        print(f"Sueldo base: {self.sueldobase}")
    
    @staticmethod
    def mostrar_por_sueldo(empleados, x):
        for emp in empleados:
            if emp.sueldobase == x:
                emp.mostrar()

class Cocinero(Empleado):
    def __init__(self, nombre, sueldobase, horas_extra, sueldo_hora):
        super().__init__(nombre, sueldobase)
        self.horas_extra = horas_extra
        self.sueldo_hora = sueldo_hora
    
    def sueldo_total(self):
        return self.sueldobase + (self.horas_extra * self.sueldo_hora)
    
    def mostrar(self):
        super().mostrar()
        print(f"Horas extra: {self.horas_extra}")
        print(f"Sueldo por hora: {self.sueldo_hora}")
        print(f"Sueldo total: {self.sueldo_total()}")

class Mesero(Empleado):
    def __init__(self, nombre, sueldobase, horas_extra, sueldo_hora, propina):
        super().__init__(nombre, sueldobase)
        self.horas_extra = horas_extra
        self.sueldo_hora = sueldo_hora
        self.propina = propina
    
    def sueldo_total(self):
        return self.sueldobase + (self.horas_extra * self.sueldo_hora) + self.propina
    
    def mostrar(self):
        super().mostrar()
        print(f"Horas extra: {self.horas_extra}")
        print(f"Sueldo por hora: {self.sueldo_hora}")
        print(f"Propina: {self.propina}")
        print(f"Sueldo total: {self.sueldo_total()}")

class Administrativo(Empleado):
    def __init__(self, nombre, sueldobase, cargo):
        super().__init__(nombre, sueldobase)
        self.cargo = cargo
    
    def sueldo_total(self):
        return self.sueldobase
    
    def mostrar(self):
        super().mostrar()
        print(f"Cargo: {self.cargo}")
        print(f"Sueldo total: {self.sueldo_total()}")

if __name__ == "__main__":
    # a) Instanciar empleados
    cocinero = Cocinero("Juan", 2000, 10, 15.5)
    mesero1 = Mesero("Pedro", 1500, 8, 10.0, 200.0)
    mesero2 = Mesero("Maria", 1600, 5, 10.0, 150.0)
    admin1 = Administrativo("Laura", 2500.0, "Gerente")
    admin2 = Administrativo("Carlos", 1800.0, "Asistente")
    
    # b) Mostrar sueldos totales
    empleados = [cocinero, mesero1, mesero2, admin1, admin2]
    for emp in empleados:
        emp.mostrar()
        print()
    
    # c) Mostrar empleados con sueldobase = 1500
    print("\nEmpleados con sueldo base = 1500:")
    Empleado.mostrar_por_sueldo(empleados, 1500)