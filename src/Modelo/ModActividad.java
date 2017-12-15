/*
 * Adquirir consciencia sobre la respiracion
 * sin lugar a dudas es bueno
 * 
 * El aire entra
 *                 El aire sale
 * 
 * Dentro de ti
 *                 Fuera de ti
 * 
 *         Todo fluye
 */
package Modelo;

/**
 *
 * @author poncho
 */
public class ModActividad {
    private int idActividad, frecuencia, duracionActividad, duracionDescanso, ciclo;
    private String tipo;
    private ModAnimo ini, fin, productividad;
    private ModUsuario u;
    
        public ModActividad() {
        this.idActividad = 0;
        this.frecuencia = 0;
        this.tipo = "";
    }
    
    public int getDuracionActividad() {
        return duracionActividad;
    }

    public void setDuracionActividad(int duracionActividad) {
        this.duracionActividad = duracionActividad;
    }

    public int getDuracionDescanso() {
        return duracionDescanso;
    }

    public void setDuracionDescanso(int duracionDescanso) {
        this.duracionDescanso = duracionDescanso;
    }

    public int getCiclo() {
        return ciclo;
    }

    public void setCiclo(int ciclo) {
        this.ciclo = ciclo;
    }

    public ModAnimo getIni() {
        return ini;
    }

    public void setIni(ModAnimo ini) {
        this.ini = ini;
    }

    public ModAnimo getFin() {
        return fin;
    }

    public void setFin(ModAnimo fin) {
        this.fin = fin;
    }

    public ModAnimo getProductividad() {
        return productividad;
    }

    public void setProductividad(ModAnimo productividad) {
        this.productividad = productividad;
    }



    public int getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(int idActividad) {
        this.idActividad = idActividad;
    }

    public int getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(int frecuencia) {
        this.frecuencia = frecuencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ModUsuario getU() {
        return u;
    }

    public void setU(ModUsuario u) {
        this.u = u;
    }
}
    