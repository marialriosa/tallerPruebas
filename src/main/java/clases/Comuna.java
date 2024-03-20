
package clases;

/**
 *
 * @author maria
 */
public class Comuna {
    private int codigo;
    private double presupuesto;
    private String nombre;

    public Comuna(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public int contarNiñosEnComuna() {
        // Implementación para contar niños en la comuna
        return 0;
    }

    public int contarBarrios() {
        // Implementación para contar barrios en la comuna
        return 0;
    }

   
        
    public double calcularPresupuesto(Comuna comuna) {
        int cantidadBarrios = comuna.contarBarrios();
        int cantidadNiños = comuna.contarNiñosEnComuna();

        double presupuestoComuna = (cantidadBarrios * 50000) + (cantidadNiños * 120);

        return presupuestoComuna;
    }
    
}


