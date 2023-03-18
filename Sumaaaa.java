import java.util.Scanner;

public class Sumaaaa
{
    public static void main( String[] args ){
        Scanner teclado = new Scanner( System.in );
    int n1, n2, suma;

        System.out.print( "Introduzca primer número: " );
        n1 = teclado.nextInt();

        System.out.print( "Introduzca segundo número: " );
        n2 = teclado.nextInt();

        suma = n1 + n2;

        System.out.println( "La suma de " + n1 + " más " + n2 + " es " + suma + "." );
    }
}