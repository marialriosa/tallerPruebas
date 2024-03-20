
package clases;

/**
 *
 * @author maria
 */
public class SecretariaPlaneacion {
    private int id;
    private String ciudad;

    public SecretariaPlaneacion(int id, String ciudad) {
        this.id = id;
        this.ciudad = ciudad;
    }

    public double calcularPresupuesto(Comuna comuna) {
        int cantidadBarrios = comuna.contarBarrios();
        int cantidadNiños = comuna.contarNiñosEnComuna();

        double presupuestoComuna = (cantidadBarrios * 50000) + (cantidadNiños * 120);
        
        return presupuestoComuna;
    }

    public void repartirPresupuesto() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public double calcularPresupuesto() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}