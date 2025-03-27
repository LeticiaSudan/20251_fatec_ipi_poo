package sobrecarga;
//critérios que diferenciam métodos: 
//1 - Quantidade de parâmetros
//2 - Tipos dos parâmetros
//3 - Ordem dos parâmetros
public class Calculadora {
    public long somar(long a, long b){
        return a + b;
    }

    // public long somar(long x, long y) {

    // } o compilador não sabe diferenciar, pois mudar o nome dos parâmetros não faz dele diferente do de cima, por conta disso esse método não poderia se chamar somar

    public long somar(String s1, String s2) {
        return Long.parseLong(s1) + Long.parseLong(s2); //é igual o int, só que ocupa mais espaço na memória
    }

    public long somar(long a, long b, long c){
        return a + b + c;
    }

    public long somar(String s1, long l) {
        return Long.parseLong(s1) + l;
    }

    public long somar(long l, String s) {
        //não vale usar + e nem long.parseLong
        return somar(s, l);
    }
    //posso usar o mesmo nome para os vários métodos, pois o compilador consegue diferenciar qual você quer usar, isso se chama sobrecarga de métodos
}