//Criação da classe LivroDeNotas, classe é um modelo/blueprint a ser utilizado para criar objetos
class LivroDeNotas{
    //É um atributo(variável) da classe LivroDeNotas, ele armazenará o nome da disciplina
    String nomeDaDisciplina;

    //Método(função) que permite definir o nome da disciplina
    void setNomeDaDisciplina(String nomeDaDisciplina){
        //this se refere a variável criada na linha 4 da classe LivroDeNotas e não ao parâmetro desse método
        //Quando o método for chamado, o valor passado como argumento será atribuído a variável nomeDaDisciplina da linha 4
        this.nomeDaDisciplina = nomeDaDisciplina;
    }

    //Método(função) que exibe uma mensagem de boas vindas usando a variável nomeDaDisciplina
    void exibirMensagem(){
        System.out.println("Bem-vindo ao livro de notas da disciplina " + nomeDaDisciplina + "!");
    }
}