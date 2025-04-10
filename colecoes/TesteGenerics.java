package colecoes;

class Musica{

}

public class TesteGenerics {
    public static void main(String[] args) {
        var meusInteiros = new VetorDinamico<Integer>();
        meusInteiros.adicionar(1);
        var minhasMusicas = new VetorDinamico<Musica>();
        minhasMusicas.adicionar(new Musica());
    }
    
}
