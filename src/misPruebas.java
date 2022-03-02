
import java.util.Scanner;


public class misPruebas {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = 0;
        
        String letras[]={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","X","Y","Z"};
        for (int i = 0; i < 11; i++) {
            String misNumero = String.format("%08d", numero++);
            System.out.println(misNumero.concat(letras[(int)(Math.random()*letras.length-1)]));
        }
    }
}
