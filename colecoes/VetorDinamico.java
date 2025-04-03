package colecoes;

public class VetorDinamico {
    private static final int LIMIAR_INFERIOR = 4;
        private int [] elementos;
        private int quantidade;
        private int capacidade; //daria para resolver sem essa variavel, usando .length

        //Construtor
        VetorDinamico(){
            quantidade = 0;
            capacidade = LIMIAR_INFERIOR;
            elementos = new int[capacidade];
        }

        public void adicionar(int e){
            elementos[quantidade++] = e;
        }

        //Converte tudo em uma única String
        public String toString(){
            // String s = "a" + "b";
            var sb = new StringBuilder("");
            sb.append("Quantidade: ").append(quantidade).append("\n");
            sb.append("Capacidade: ").append(capacidade).append("\n");
            for(int i = 0; i < quantidade; i++){
                sb.append(elementos[i]).append(i != quantidade - 1 ? " ": ""); //se não for o último elemento ele dá espaço
            }
            return sb.toString();
        }
}
