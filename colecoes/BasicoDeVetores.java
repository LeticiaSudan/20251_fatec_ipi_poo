package colecoes;

public class BasicoDeVetores {
    public static void main(String[] args) {
        //declaração de vetores
        //int v1[10];
        //int [] v1 = new int[10];
        // var v1 = new int[4];
        //v1[0] = 5;
        //v1[1] = 7;
        //v1[2] = 2;
        //v1[3] = 2;
        int [] v1 = {5, 7, 2, 2};
        //No java a alocação de memória é sempre dinâmica
        System.out.println(v1.length);
        
        //Calcular a média do vetor v1
        var contador = 0.0;
        for(int i = 0; i < v1.length; i++){
            
            contador += v1[i];
        }
        var media = contador/v1.length;
        System.out.println(media);
    }
}