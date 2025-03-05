import java.util.Scanner;
public class LinhaComando{
    public static void main(String [] args){
        //declaração de variáveis
        double custoFabrica, custoFinal;
        //entrada de dados
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o custo de fábrica do carro:");
        custoFabrica = leitor.nextDouble();
        //processamento 
        custoFinal = custoFabrica + (custoFabrica * 0.28) + (custoFabrica * 0.45);
        //saída
        System.out.println("O custo final do carro é: R$" + custoFinal);
    }
}