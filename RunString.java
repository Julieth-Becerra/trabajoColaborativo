/**
 * Paquete de ejecucion
 */
package Run;
import java.util.Scanner;
import model.string;

/**
 * Clase que permite la ejecucion del programa
 */
public class RunString {
    /**
     * Se crea Scanner
     */
    Scanner sc = new Scanner(System.in);
    /**
     * Se crea objeto de tipo string() (clase modelo)
     */
    string object = new string();

    /**
     * Menu del programa
     */

    public void menu() {

        byte opc = 0;

        while (opc != 12) {

            System.out.println("***** MENU PRINCIPAL *****" +
                    "\n1. Convertir en nombre propio" +
                    "\n2. Buscar cadena" +
                    "\n3. Encriptar" +
                    "\n4. Desencriptar" +
                    "\n5. Llenar caracteres" +
                    "\n6. Borrar caracteres" +
                    "\n7. Intersección" +
                    "\n8. Diferencia" +
                    "\n9. Borrar caracteres" +
                    "\n10. Validar correo electrónico" +
                    "\n11. Salida");
            opc = sc.nextByte();

            switch (opc) {

                case 1:
                    System.out.println("Verificacon de mail");
                    break;
                case 2:
                    System.out.println("Verifcion de mail");
                    break;
                case 3:
                    System.out.println("*** Encriptar texto ***");
                    System.out.println("Digite texto a encriptar ");
                    String text = sc.next();
                    System.out.println("Digite valor de desplazamiento");
                    int key = sc.nextInt();
                    System.out.println("Texto encriptado: " + encrypt(text, key));
                    break;
                case 4:
                    System.out.println("*** Desencriptar texto ***");
                    System.out.println("Digite texto a desencriptar");
                    String textD = sc.next();
                    System.out.println("Digite valor de desplazamiento");
                    int keyD = sc.nextInt();
                    System.out.println("Texto desencriptado: " + decrypt(textD, keyD));
                    break;
                case 5:
                    System.out.println("Verificacion de mail");
                    break;
                case 6:
                    System.out.println("Veficacion de mail");
                    break;
                case 7:
                    System.out.println("Verificacion ");
                    break;
                case 8:
                    System.out.println("Verif mail");
                    break;
                case 9:
                    System.out.println("Vercacion de mail");
                    break;
                case 10:
                    System.out.println("*** Verificacion de mail ***");
                    requestMail();
                    break;
                case 11:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        }

    }

    /**
     * Metodo de encriptacion de caracteres (cifrado César)
     * @param text texto a encriptar
     * @param key valor de desplazamiento en abecedario
     * @return texto encriptado
     */
    public static String encrypt (String text, int key ) {
        StringBuilder cifrar = new StringBuilder();
        key = key % 26;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) >= 'a' && text.charAt(i) <= 'z') {
                if ((text.charAt(i) + key) > 'z') {
                    cifrar.append((char) (text.charAt(i) + key - 26));
                } else {
                    cifrar.append((char) (text.charAt(i) + key));
                }
            } else if (text.charAt(i) >= 'A' && text.charAt(i) <= 'Z') {
                if ((text.charAt(i) + key) > 'Z') {
                    cifrar.append((char) (text.charAt(i) + key - 26));
                } else {
                    cifrar.append((char) (text.charAt(i) + key));
                }
            }
        }
        return cifrar.toString();
    }

    /**
     * Metodo de desencriptacion de caracteres (cifrado César)
     * @param text texto a desencriptar
     * @param key valor de dezplazamiento en abecedario
     * @return texto desencriptado
     */
    public static String decrypt (String text , int key) {
        StringBuilder cifrar = new StringBuilder();
        key = key % 26;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) >= 'a' && text.charAt(i) <= 'z') {
                if ((text.charAt(i) - key) < 'a') {
                    cifrar.append((char) (text.charAt(i) - key + 26));
                } else {
                    cifrar.append((char) (text.charAt(i) - key));
                }
            } else if (text.charAt(i) >= 'A' && text.charAt(i) <= 'Z') {
                if ((text.charAt(i) - key) < 'A') {
                    cifrar.append((char) (text.charAt(i) - key + 26));
                } else {
                    cifrar.append((char) (text.charAt(i) - key));
                }
            }
        }
        return cifrar.toString();
    }

    /**
     * Metodo donde se solicita al usuario digitar un correo para hacer la verificacion de validez
     */
    public void requestMail(){
        System.out.println("Digite mail a verificar");
        String mail = sc.next();
        System.out.println(object.mailValidation(mail));
    }

    /**
     * Metodo principal
     * @param args args
     */
    public static void main (String[]args){

        RunString run = new RunString();
        run.menu();

    }

}
