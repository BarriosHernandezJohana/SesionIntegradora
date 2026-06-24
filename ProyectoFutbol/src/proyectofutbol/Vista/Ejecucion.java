/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofutbol.Vista;
import proyectofutbol.Controlador.Almacenamiento;
import proyectofutbol.Modelo.Pais;
import proyectofutbol.Modelo.Grupo;

/**
 *
 * @author LAB-USR-LNORTE
 */
public class Ejecucion {   
    public static void main(String[] args) {
    
        Pais p1 = new Pais("Brasil", 5, 22);
        Pais p2 = new Pais("Argentina", 3, 18);
        Pais p3 = new Pais("Alemania", 4, 20);
        Pais p4 = new Pais("España", 1, 16);

        Pais p5 = new Pais("Francia", 2, 17);
        Pais p6 = new Pais("Italia", 4, 18);
        Pais p7 = new Pais("Uruguay", 2, 14);
        Pais p8 = new Pais("Inglaterra", 1, 16);

        
        Grupo grupo1 = new Grupo(p1, p2, p3, p4);
        Grupo grupo2 = new Grupo(p5, p6, p7, p8);

        Almacenamiento almacenamiento = new Almacenamiento(2);

        almacenamiento.agregarGrupo(grupo1);
        almacenamiento.agregarGrupo(grupo2);

        almacenamiento.imprimirReporte();
    }
}