package oo_parte2;
import java.util.Random;


public class Personagem {
    //encapsular variaveis para que não sejam alteradas. Ex: energia = 500, seria roubado
    private String nome = null; //null já estava implicito
    private String[] possiveisNomes = {"Steve", "Alex", "Mark"}; //nomes padroes que serao randomizados quando um objeto for instanciado
    private int energia = 10;
    private int fome = 0; //0 já estava implicito, porém escrever mesmo assim deixa o código mais legível
    private int sono = 0; 
    

    //construtor
    public Personagem(){
        nome = obterNomeAleatorio();
        energia = 10;
        fome = 0;
        sono = 0;
     }

    private String obterNomeAleatorio(){
        var gerador = new Random();
        return possiveisNomes[gerador.nextInt(possiveisNomes.length)];
    }

    //construtor novo
    //deve ser possivel construir um Personagem com dados passados pela classe cliente
    //se algum valor for invalido usar aquele que é padrao para a respectiva propriedade
    //incluir a validacao de nome: somente valem nomes que tenham pelo menos 4 caracteres
    //se essa regra for violada, atribuir um nome aleatorio
    public Personagem(String nome, int enegia, int fome, int sono){
        this.nome = 
            nome.length() >=4 ?
            nome:
            obterNomeAleatorio();

        this.energia = 
            energia >=0 && energia <=10 ?
            energia:
            10;

        if(fome >= 0 && fome <=10){
            this.fome = fome;
        }
        else{
            this.fome = 0;
        }

        if(sono >=0 && sono <=10){
            this.sono = sono;
        }
        else{
            this.sono = 0;
        }
    }

    public void cacar(){
        if(energia >=2){
            System.out.println(nome + " esta cacando");
            energia -=2; //mesmo que dizer energia = energia -2
        }
        else{
            System.out.println(nome + " esta sem energia para cacar");
        }
        //outras formas de fazer condição:
        fome = fome < 10 ? fome + 1 : fome; //se fome for menor que 10 ele faz fome + 1, senão ele devolve fome = fome
        sono = Math.min(sono + 1, 10); // min retorna o menor dos dois valores passados nos parenteses
    }

    public void comer(){

        if(fome >= 1){
            System.out.print(nome + " esta comendo\n");
            fome -= 1;
        }
        else{
            System.out.println(nome + " nao esta com fome");
        }
        energia = Math.min(energia + 1, 10); // para não deixar a energia passar de 10

    }

    public void dormir(){
        if(sono >= 1){
            System.out.printf("%s esta dormindo\n", nome);
            sono -= 1;
        }
        else{
            System.out.println(nome + " nao esta com sono");
        }
        energia = Math.min(energia + 1, 10); // para não deixar a energia passar de 10
        
    }

    public void status(){
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