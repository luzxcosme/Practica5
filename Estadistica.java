import java.util.List;

class Estadisticas {
    private List<Double> datos;

    public void setDatos(List<Double> datos) {
        this.datos = datos;
    }
    public List<Double> getDatos() {
        return datos;
    }
    public double promedio() {
        double suma = 0;
        for (double num : datos) {
            suma += num;
        }
        return suma / datos.size();
    }
    
    public double desviacion() {
        double prom = promedio();
        double suma = 0;
        for (double num : datos) {
            suma += Math.pow(num - prom, 2);
        }
        return Math.sqrt(suma / (datos.size() - 1));
    }
    
    public String toString() {
        return String.format("El promedio es %.2f\nLa desviación estándar es %.6f", promedio(), desviacion());
    }
    
    public static void main(String[] args) {
        List<Double> valores = List.of(1.9, 2.5, 3.7, 2.0, 1.0, 6.0, 3.0, 4.0, 5.0, 2.0);
        Estadisticas stats = new Estadisticas();
        stats.setDatos(valores);
        System.out.println(stats);
    }
