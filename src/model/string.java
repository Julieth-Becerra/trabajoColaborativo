/**
 * Paquete model
 */
package model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Clase con la funcionalidad de manejo de cadenas
 */
public class string {

    /**
     * Cadena de caracteres
     */
    private String string;

    /**
     * Se define la cadena de caracteres inmutable
     */

    public string() {
        string = "Sogamoso ciudad del sol y del acero";
    }

    /**
     * Metodo que retorna el contenido de la cadena
     * @return contenido de la cadena
     */
    public String getString() {
        return string;
    }

    /**
     * Metodo que permite hacer verificacion de validez de un correo
     * @param mail mail a verificar validez
     * @return valor logico que indica si el correo tiene validez
     */
    public boolean mailValidation (String mail){

        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        Matcher matcher = pattern.matcher(mail);

        boolean aux;

        if(matcher.find() == true){
            aux = true;
        } else {
            aux = false;
        }

        return aux;
    }
}
