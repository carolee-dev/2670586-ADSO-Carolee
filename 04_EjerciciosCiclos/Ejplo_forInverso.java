import java.util.Scanner;

public class Ejplo_forInverso{
	public static void main(String[]args){
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("--> Ingrese número de Tabla de Multiplicar a mostrar: ");
		int numero = entrada.nextInt();

		System.out.print("--> Ingrese la cantidad de Múltiplos: ");
		int multiplos = entrada.nextInt();

        /*
        En ciclo 'for' NO hay que crear variable iteradora.
        Está dentro de la estructura:
        for(variable iteradora ; condición ; incremento o decremento){
            Bloque de código
        }
        */

        for(int contador = multiplos; contador >= 0; contador = contador - 1){
            int resultado = numero * contador;
            System.out.println(numero+" x "+contador+" = "+resultado);
        }

	}
}