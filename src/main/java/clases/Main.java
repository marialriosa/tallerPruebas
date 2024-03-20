/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author maria
 */
public class Main {
    public static void main(String[] args) {
        // Crear un nuevo barrio
        Barrio barrio = new Barrio(101, "Nuevo Barrio", 2024);

        // Establecer la cantidad de niños y adultos en el barrio
        barrio.setCantidadNiños(15);
        barrio.setCantidadAdultos(40);

        // Obtener la cantidad de niños y adultos en el barrio
        int cantidadNiños = barrio.getCantidadNiños();
        int cantidadAdultos = barrio.getCantidadAdultos();

        // Imprimir la información del nuevo barrio
        System.out.println("Nuevo barrio creado:");
        System.out.println("Código: " + barrio.getCodigo());
        System.out.println("Nombre: " + barrio.getNombre());
        System.out.println("Año de creación: " + barrio.getAñoCreacion());
        System.out.println("Cantidad de niños: " + cantidadNiños);
        System.out.println("Cantidad de adultos: " + cantidadAdultos);
        
        
    }
}
