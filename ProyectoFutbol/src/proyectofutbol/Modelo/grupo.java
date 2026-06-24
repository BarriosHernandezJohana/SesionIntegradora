/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofutbol.Modelo;

/**
 *
 * @author Luis
 */
public class grupo {
    private Pais pais1; 
    private Pais pais2; 
    private Pais pais3; 
    private Pais pais4;
    
    public grupo(Pais pais1,Pais pais2,Pais pais3,Pais pais4){
        this.pais1=pais1;
        this.pais2=pais2;
        this.pais3=pais3;
        this.pais4=pais4;
    }

    /**
     * @return the pais1
     */
    public Pais getPais1() {
        return pais1;
    }

    /**
     * @param pais1 the pais1 to set
     */
    public void setPais1(Pais pais1) {
        this.pais1 = pais1;
    }

    /**
     * @return the pais2
     */
    public Pais getPais2() {
        return pais2;
    }

    /**
     * @param pais2 the pais2 to set
     */
    public void setPais2(Pais pais2) {
        this.pais2 = pais2;
    }

    /**
     * @return the pais3
     */
    public Pais getPais3() {
        return pais3;
    }

    /**
     * @param pais3 the pais3 to set
     */
    public void setPais3(Pais pais3) {
        this.pais3 = pais3;
    }

    /**
     * @return the pais4
     */
    public Pais getPais4() {
        return pais4;
    }

    /**
     * @param pais4 the pais4 to set
     */
    public void setPais4(Pais pais4) {
        this.pais4 = pais4;
    }
    
    @Override
    public String toString() {
        return "pais1: " + pais1 + 
               " | pais2: " + pais2 + 
               " | pais3: " + pais3 +
               " | pais4: " + pais4;
    }
}     


