package colecoes;

//generics (desde o java 5)
public class VetorDinamico <T>{
    // Variável de classe, ou seja, é compartilhada entre todas as instâncias da classe 
    // e seu valor é constante para toda a classe 
    private static final int LIMIAR_INFERIOR = 4;
        //Vetor do tipo T
        private T [] elementos;
        private int quantidade;
        private int capacidade; //daria para resolver sem essa variavel, usando .length

        //Construtor
        VetorDinamico(){
            this.quantidade = 0;
            this.capacidade = LIMIAR_INFERIOR;
            elementos = (T[]) new Object[this.capacidade];
        }

        public boolean estaVazio(){
            return quantidade == 0;
        }

        private void redimensionar(double fator){
            //1. Alocar um vetor com a capacidade apropriada
            T [] aux = (T[]) new Object[(int)(capacidade * fator)];
            //2. Copiar todo mundo
            for(int i = 0; i < quantidade; i++){
                aux[i] = elementos[i];
            }
            //3. Ajustar a capacidade
            capacidade = (int)(capacidade * fator);
            //4. Ajustar a variavel elementos
            elementos = aux;
        }

        public void remover(){
            if(!estaVazio()){
                quantidade--;
                if(capacidade > LIMIAR_INFERIOR && quantidade == capacidade /4){
                    redimensionar(0.5);
                }
            }
        }

        public boolean estaCheio(){
            return quantidade == capacidade;
        }

        public void adicionar(T e){
            if(estaCheio()){
                redimensionar(2);
            }
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
