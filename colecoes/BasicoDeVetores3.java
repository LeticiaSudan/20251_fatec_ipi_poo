package colecoes;

class Veiculo{
    String placa;
    int ano;


//Construtor
Veiculo(String placa, int ano){
    this.placa = placa;
    this.ano = ano;
}
}

public class BasicoDeVetores3 {
    public static void main(String[] args) {
        //Os dois jeitos de escrever fazem a mesma coisa
        Veiculo [] veiculos = new Veiculo[4]; //melhor jeito 
        //Veiculo veiculos [] = new Veiculo[4];
        veiculos[0] = new Veiculo("abc-1234", 2000);
        trocaValor(veiculos);
        System.out.println(veiculos[0].ano);
    }

    //Não troca, pois é uma cópia do dado que está sendo passada e não a referência do endereço
    static void trocaValorV2(int ano){
        ano = 2001;
    }

    static void trocaValor(Veiculo [] veiculos){
        veiculos[0].ano = 2001;
    }
}