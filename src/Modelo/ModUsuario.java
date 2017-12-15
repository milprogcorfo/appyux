    /*
 * Adquirir consciencia sobre
 * nuestra respiracion es una
 * buena práctica, sin duda.
 * 
 * El aire entra
 *               El aire sale
 * Dentro de ti
 *               Fuera de ti
 *               
 *      
 *               El futuro es ilusión
 *       Las cosas fluyen 
 *               
 * El pasado es ilusión
 *               
 *     El presente es verdad 
 */
package Modelo;

public class ModUsuario {
    private String usuario, contrasenha, signoZodiacal;
    private int identificador;
    
    public ModUsuario() {
        this.usuario = "";
        this.contrasenha = "";
        this.identificador = 0;
        this.signoZodiacal = "";
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContrasenha(String contrasenha) {
        this.contrasenha = contrasenha;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContrasenha() {
        return contrasenha;
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getSignoZodiacal() {
        return signoZodiacal;
    }

    public void setSignoZodiacal(String signoZodiacal) {
        this.signoZodiacal = signoZodiacal;
    }

    
}
