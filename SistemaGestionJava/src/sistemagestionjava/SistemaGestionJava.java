package sistemagestionjava;

import java.util.Scanner;

public class SistemaGestionJava {

    public static void main(String[] args) {
        int cantidadClientes;
        var consola = new Scanner(System.in);
        System.out.println("Indique el numero de clientes");
        cantidadClientes = Integer.parseInt(consola.nextLine());
        for(int i = 0; i<=cantidadClientes; i++){
            Clientes cliente[i]= new Clientes();
           
        }
        
    }
    
}
