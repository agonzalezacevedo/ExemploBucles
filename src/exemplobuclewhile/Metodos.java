package exemplobuclewhile;

import java.util.Scanner;

/**
 * @author agonzalezacevedo
 */
public class Metodos {
    private int numero;
    Scanner sc=new Scanner(System.in);
    
    public void pedirDatos(){
        System.out.println("Teclea un numero: ");
        numero= sc.nextInt();
    }
    
    public void mostrarDatos(){    
        while(numero!=0){
            System.out.println(numero);
            pedirDatos();
        }
        System.out.println("Rematamos");
    }
}
