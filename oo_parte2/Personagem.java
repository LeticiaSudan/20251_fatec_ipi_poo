package oo_parte2;

public class Personagem {
    String nome = null; //já estava implicito
    int energia = 10;
    int fome = 0; //já estava implicito
    int sono = 0; //já estava implicito
    //porém escrever mesmo assim deixa o código mais legível

    void cacar(){
        if(energia >=2){
            System.out.println(nome + " esta caçando");
            energia -=2; //mesmo que dizer energia = energia -2
        }
        else{
            System.out.println(nome + " esta sem energia para cacar");
        }
        //outras formas de fazer condição:
        fome = fome < 10 ? fome + 1 : fome; //se fome for menor que 10 ele faz fome + 1, senão ele devolve fome = fome
        sono = Math.min(sono + 1, 10); // min retorna o menor dos dois valores passados nos parenteses
    }

    void comer(){

        if(fome >= 1){
            System.out.print(nome + " esta comendo\n");
            fome -= 1;
        }
        else{
            System.out.println(nome + " nao esta com fome");
        }
        energia = Math.min(energia + 1, 10); // para não deixar a energia passar de 10

    }

    void dormir(){
        if(sono >= 1){
            System.out.printf("%s esta dormindo\n", nome);
            sono -= 1;
        }
        else{
            System.out.println(nome + " nao esta com sono");
        }
        energia = Math.min(energia + 1, 10); // para não deixar a energia passar de 10
        
    }

    void status(){
        System.out.println("===========================");
        System.out.println("Energia atual: " + energia);
        System.out.println("Fome atual: " + fome);
        System.out.println("Sono atual: " + sono);
        System.out.println("===========================");
    }

    //versão elegante do exibir Status, "jeito certo"
    @Override
    public String toString(){
        return String.format(
"%s: e: %d, f: %d, s: %d",
        nome, energia, fome, sono
        );
    }

}