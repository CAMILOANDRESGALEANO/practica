
package persona;

import java.util.Scanner;


public class PERSONA {

   
    public static void main(String[] args) {
     
        TT pe = new TT();

        Scanner sc = new Scanner(System.in);
        int respuesta;
        System.out.println("Desea crear una persona?\n1.Si\n2.No");
        respuesta = sc.nextInt();
        if (respuesta == 1) {
            System.out.println(pe.adnombre);
            String nombre = sc.nextLine();
            pe.denombre = nombre;


        } else {
            System.out.println("Necesita crear una persona para continuar intentelo denuevo");
            main(args);
        }
        System.out.println("Desea que me presente?\n1.Si\n2.No");
        respuesta = sc.nextInt();
        if (respuesta == 1) {
            System.out.println("Su nombre es: " + pe.denombre);
        }
        System.out.println("Quiere escucharme hablar?\n1.Si\n2.No");
        respuesta = sc.nextInt();
        if (respuesta == 1) {
            System.out.println(pe.hablar);
        }
        System.out.println("Desea que me vaya a dormir?\n1.Si\n2.No");
        respuesta = sc.nextInt();
        if (respuesta == 1) {
            System.out.println(pe.dormir);
        }
        System.out.println("Quiere escucharme contar?\n1.Si\n2.No");
        respuesta = sc.nextInt();
        if (respuesta == 1) {
            System.out.println(pe.contar);
        }
    }
}
