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
public class ModAnimo {
  private String tipo, descripción;
  private int idanimo, frecuencia;
  private ModUsuario u;

    public ModAnimo() {
        this.tipo = "";
        this.idanimo = 0;
        this.frecuencia = 0;
        this.descripción = "";
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public ModUsuario getU() {
        return u;
    }

    public void setU(ModUsuario u) {
        this.u = u;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getIdanimo() {
        return idanimo;
    }

    public void setIdanimo(int idanimo) {
        this.idanimo = idanimo;
    }

    public int getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(int frecuencia) {
        this.frecuencia = frecuencia;
    }
  @Override
    public boolean equals(Object o){
        if (((ModAnimo)o).getIdanimo() == this.getIdanimo())
        {
            return true;
    } else {
            return false;
    }  
}
}
