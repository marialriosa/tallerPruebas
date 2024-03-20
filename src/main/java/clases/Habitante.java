
package clases;

/**
 *
 * @author maria
 */
public class Habitante {
    
    ////////////////////////////////////////////////////////////////////////////
    //Atributos 
    
    
    
    private int id;
    private String nombre;
    private int edad;
    private char sexo;

    
////////////////////////////////////////////////////////////////////////////////
    //constructor 
    public Habitante(int id, String nombre, int edad, char sexo) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }
////////////////////////////////////////////////////////////////////////////////
//metodos de acceso 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

   
}
