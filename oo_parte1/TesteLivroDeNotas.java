//Criação da classe TesteLivroDeNotas para testar a classe LivroDeNotas
public class TesteLivroDeNotas{
    // Método principal que inicia a execução do programa, tem como parâmetro um array de strings
    public static void main(String[] args){
        //1.Construir um livro de notas
        //Criação de objetos da classe LivroDeNotas
        LivroDeNotas livroDeNotas = new LivroDeNotas();
        LivroDeNotas livroDeNotas2 = new LivroDeNotas();
        //Uso do método setNomeDaDisciplina para definir o nome da disciplina
        livroDeNotas.nomeDaDisciplina = "Java";
        livroDeNotas2.nomeDaDisciplina = "Python";
        //2.Acionar o comportamento de exibir uma mensagem de boas vindas
        livroDeNotas.exibirMensagem();
        livroDeNotas2.exibirMensagem();
    }
}