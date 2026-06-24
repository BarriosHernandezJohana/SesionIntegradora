/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofutbol.Controlador;

/**
 *
 * @author LAB-USR-LNORTE
 */
public class Almacenamiento {
    
    private Grupo [] listaGrupos;
    private int nroGrupos;

    public Almacenamiento (int nroGrupos) {
        this.nroGrupos = nroGrupos;
        this.listaGrupos = new Grupo [nroGrupos];
    }

    public void setGrupo(Grupo grupo) {
        listaGrupos[posicion]= grupo ;
    }

    public void imprimirReporte(Grupo[]listaGrupos) {
        System.out.println("=== REPORTE DE GRUPOS ===");

        for (int i = 0; i < listaGrupos.size(); i++) {
            System.out.println("Grupo " + (i + 1));
            System.out.println(listaGrupos.get(i));
            System.out.println("--------------------");
        }
    }
}