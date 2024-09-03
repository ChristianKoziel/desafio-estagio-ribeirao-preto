import java.util.ArrayList;
import java.util.List;

public class SequenciaLogica {
    public static void main(String[] args) {

        //exercicio a)
        List<Integer> numerosImpares = new ArrayList<>();
        int contador = 0;
        int numero = 1; 

        while (contador < 5) {
            numerosImpares.add(numero);
            numero += 2; // Próximo número ímpar
            contador++;
        }

        //exercicio b)
        int[] sequencia = {2, 4, 8, 16, 32, 64};
        int proximoNumero = sequencia[sequencia.length - 1] * 2;

        int limite = 7; 
        int[] quadradosPerfeitos = new int[limite + 1]; 

        for (int i = 0; i <= limite; i++) {
            quadradosPerfeitos[i] = i * i; 
        }

        //exercicio c)
        int proximoNumero2 = limite * limite; 
        
        int limitePar = 10; 
        int[] quadradosDePares = new int[limitePar / 2 + 1]; 

        for (int i = 0; i <= limitePar / 2; i++) {
            quadradosDePares[i] = (i * 2) * (i * 2); 
        }

        //exercicio d)
        int proximoQuadradoPar = 10 * 10; 
        
        //exercicio e)
        int termos = 7; 
        int[] fibonacci = new int[termos]; 

        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < termos; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2]; 
        }

        int proximoNumeroFibonacci = fibonacci[termos - 1] + fibonacci[termos - 2]; 

        //exercicio f)
        int ultimoNumero = 19;
        int proximo = ultimoNumero + 1; 

        System.out.println("a) " + numerosImpares); 
        System.out.println("b) " + proximoNumero); 
        System.out.println("c) " + proximoNumero2);
        System.out.println("d) " + proximoQuadradoPar);
        System.out.println("e) " + proximoNumeroFibonacci);
        System.out.println("f) " + proximo); 
    }
}
