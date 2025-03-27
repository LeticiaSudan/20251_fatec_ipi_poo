package oo_parte2;
import java.util.Random;

public class JogoV2 {
    public static void main(String[] args) throws Exception {
        var gerador = new Random();
        //var (feito pelo compilador)
        var p1 = new Personagem();
        p1.nome = "Leticia";
        while(true){
            //1. Caçar
            //2. Comer
            //3. Dormir
            var oQueFazer = 1 + gerador.nextInt(3); //[0, 3] vai de 0 até 2, por isso somamos + 1, pois queremos os valores 1, 2 ou 3
            switch (oQueFazer) {
                case 1:
                    p1.cacar();
                    //p1.status();
                    break;
                case 2:
                    p1.comer();
                    //p1.status();
                    break;
                case 3:
                    p1.dormir();
                    //p1.status();
                    break;
            
            }
            System.out.println(p1);
            Thread.sleep(4000); //programa pausa por 8s

        }  
    }
}
