package oo_parte2;
import java.util.Random;
import java.lang.reflect.Method;

public class JogoV2 {
    public static void main(String[] args) throws Exception {
        var gerador = new Random();
        //var (feito pelo compilador)
        
        var p1 = new Personagem();
        var p2 = new Personagem("Lebron", 10, 10, 0);
        var p3 = new Personagem("Soneca", 4, 4, 10);
        Personagem [] personagens = {p1, p2, p3}; // coloca todos os personagens em um vetor
        

        while(true){
            //vai sortear qual personagem vai jogar
            var quemVaiJogar = gerador.nextInt(personagens.length); 

            //Descobrir quantos metodos a classe Personagem possui
            // Obtém a classe Personagem
            Class<?> clazz = Personagem.class;
            // Obter todos os métodos públicos (incluindo herdados)
            Method[] metodosPublicos = clazz.getMethods();
            System.out.println("Numero de metodos publicos (incluindo herdados): " + metodosPublicos.length);
            // Obter todos os métodos declarados na classe (não herdados)
            Method[] metodosDeclarados = clazz.getDeclaredMethods();
            System.out.println("Numero de metodos declarados (não herdados): " + metodosDeclarados.length);

            //sorteia a acao do personagem
            var oQueFazer = 1 + gerador.nextInt(3); //[0, 3] vai de 0 até 2, por isso somamos + 1, pois queremos os valores 1, 2 ou 3
            switch (oQueFazer) {
                case 1:
                    personagens[quemVaiJogar].cacar();
                    //p1.status();
                    break;
                case 2:
                    personagens[quemVaiJogar].comer();
                    //p1.status();
                    break;
                case 3:
                    personagens[quemVaiJogar].dormir();
                    //p1.status();
                    break;
            
            }
            System.out.println(personagens[quemVaiJogar]);
            Thread.sleep(4000); //programa pausa por 8s

        }  
    }
}
