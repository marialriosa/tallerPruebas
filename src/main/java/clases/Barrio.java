
package clases;

/**
 *
 * @author maria
 */
public class Barrio {
    private int codigo;
    private String nombre;
    private int añoCreacion;
    private double presupuesto;
    private int cantidadNiños;
    private int cantidadAdultos;
    private int cantidadTotalHabitantes;

    public Barrio(int codigo, String nombre, int añoCreacion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.añoCreacion = añoCreacion;
    }

    public void setCantidadNiños(int cantidadNiños) {
        this.cantidadNiños = cantidadNiños;
    }

    public void setCantidadAdultos(int cantidadAdultos) {
        this.cantidadAdultos = cantidadAdultos;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAñoCreacion() {
        return añoCreacion;
    }

    public int getCantidadNiños() {
        return cantidadNiños;
    }

    public int getCantidadAdultos() {
        return cantidadAdultos;
    }
    
     @Override
    public String toString(){
        return "BARRIO"  +this.codigo+":\n"+ 
               "    Nombre: "+this.nombre+"\n"+
               "    Precio: "+this.añoCreacion+"\n\n";
    }
    
}
