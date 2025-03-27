package oo_parte2;

public class JogoV1 {
    public static void main(String[] args) {
        //1. Construir um objeto do tipo personagem
        Personagem p1 = new Personagem();
        //Atribua um nome ao seu personagem
        
        //3. Fazer com que ele execute todos os seus comportamentos, na ordem que você desejar
        p1.cacar();
        p1.status();
        p1.comer();
        p1.status();
        p1.dormir();
        p1.status();
    }
}
