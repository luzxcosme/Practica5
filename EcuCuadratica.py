import math
class EcuacionCuadratica:
    def __init__(self, x=0, y=0, z=0):
        self.x = x
        self.y = y
        self.z = z
    def setX(self, x):
        self.x = x
    def setY(self, y):
        self.y = y  
    def setZ(self, z):
        self.z = z 
    def get_discriminante(self):
        return self.y ** 2 - 4 * self.x * self.z
    
    def get_raiz(self):
        d = self.get_discriminante()
        if d >= 0:
            return (-self.y + math.sqrt(d)) / (2 * self.x)
        else:
            return None

    def get_raiz2(self):
        d = self.get_discriminante()
        if d >= 0:
            return (-self.y - math.sqrt(d)) / (2 * self.x)
        else:
            return None
    
    def __str__(self):
        d = self.get_discriminante()
        if d > 0:
            return f"tiene dos raices: {self.get_raiz()} y {self.get_raiz2()}"
        elif d == 0:
            return f"tiene una raiz: {self.get_raiz()}"
        else:
            return "raiz real"

eq1 = EcuacionCuadratica()
eq1.setX(1.0)
eq1.setY(3)
eq1.setZ(1)
print(eq1)
