package modelos;

public class VerificarInteger {
     public boolean verificarInteger(String numero) {
        try {
            Integer.parseInt(numero);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
}}
