
package Main;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
                Scanner sc = new Scanner (System.in);
        int op;
        System.out.println("Archivos :D");
        do{
            System.out.println("\n1.Arboles AVL\n2.Heap\n3.Arbol expresion aritmetica\n4.Salir\n");
            op=sc.nextInt();
            switch(op){
                case 1:
                    System.out.println("Arboles AVL");
                            
                    
                    break;
                case 2:
                    System.out.println("Heap");
                   
                    break;
                case 3:
                    System.out.println("Arbol de expresion aritmetica");
                   
                    break;
                case 4:
                    System.out.println("Salir");
                    
                    break;
                default:
                    if (op>4 || op <1){
                        System.out.println("Opción inválida.");
                    }
                    break;
            }
        }while(op!=4);
    }
}