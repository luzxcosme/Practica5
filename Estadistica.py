import math
class Estadisticas:
    datos = []
    def setDatos(self, datos):
        self.datos = datos
    def getDatos(self):
        return self.datos
    def promedio(self):
        return sum(self.datos) / len(self.datos)
    def desviacion(self):
        prom = self.promedio()
        suma = sum((x - prom) ** 2 for x in self.datos)
        return math.sqrt(suma / (len(self.datos) - 1))
    
    def __str__(self):
        return f"El promedio es {self.promedio():.2f}\nLa desviación estándar es {self.desviacion():.6f}"

valores = [1.9, 2.5, 3.7, 2, 1, 6, 3, 4, 5, 2]
stats = Estadisticas()
stats.setDatos(valores)
print(stats)
