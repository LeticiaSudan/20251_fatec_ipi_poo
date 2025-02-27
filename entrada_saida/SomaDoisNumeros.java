import java.util.Scanner;
public class SomaDoisNumeros{
    static public void main(String [] abc){
        //declaração de variáveis
        Scanner leitor = new Scanner(System.in);
        int a, b, resultado;
        //entrada de dados
        System.out.println("Digite o primeiro valor");
        a = leitor.nextInt();
        System.out.println("Digite o segundo valor");
        b = leitor.nextInt();
        //processamento
        resultado = a + b;
        //saída
        System.out.printf("%d + %d = %d\n", a, b, resultado);
    }
}