package colecoes;

public class BasicoDeVetores2 {
    public static void main(String[] args) {
        int [] v = {1, 2};
        manipulaVetor(v);
        System.out.println(v[0]);
        System.out.println(v[1]);
        //Passagem de parâmetro por valor e por referência
        // int b = 3;
        // manipulaValor(b);
        // System.out.println(b);
    }

    //Passagem por cópia da referência, ele passa uma cópia do endereço do vetor
    static void manipulaVetor(int [] x){
        x[0] = 10;
        x[1] = 20;
    }

    //Desse modo ele não consegue modificar o valor, somente cria uma cópia do valor passado
    static void manipulaValor(int a){
        a = 2;
    }
}