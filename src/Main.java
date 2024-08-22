import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,monto,op=0,c=0;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Ingrese su apuesta inicial");
            monto= teclado.nextInt();
            do {
                Random numero = new Random();
                a = numero.nextInt(1,4);
                System.out.println("Tu numero aleatorio es: ");
                System.out.println(a);
                if (a==1){
                    monto=monto*2;
                    System.out.println("tu dinero se duplico, ahora tienes: " + monto);
                    System.out.println("Deseas continuar en el juego:");
                    System.out.println("Presiona 1 para continuar y 2 para rendirte");
                    do {
                        op= teclado.nextInt();

                        if (op==1){
                            System.out.println("continuamos");
                        }else if (op==2){
                            System.out.println("Te retiraste y tu monto quedo en: "+monto);
                            break;
                        }else System.out.println("seleccione 1 0 2");
                    }while(op>2);
                }else if (a==2){
                    monto=monto/2;
                    System.out.println("tu dinero se redujo a la mitad, ahora tienes: " + monto);
                    System.out.println("Deseas continuar en el juego:");
                    System.out.println("Presiona 1 para continuar y 2 para rendirte");
                    op= teclado.nextInt();
                    do {
                        if (op == 1) {
                            System.out.println("continuamos");
                        } else if (op == 2) {
                            System.out.println("Te retiraste y tu monto quedo en: " + monto);
                            break;
                        } else System.out.println("seleccione 1 0 2");
                    }while(op>2);
                }else if (a==3){
                    monto = monto-monto;
                    System.out.println("Perdiste, ahora tienes: " + monto);
                    break;
                }
            } while (a!=3 & op!=2);
            do {
                System.out.println("Desea volver a jugar?");
                System.out.println("Presione 1 para SI y 2 para NO");
                c= teclado.nextInt();
            }while (c>2);
        }while(c!=2);


    }
}