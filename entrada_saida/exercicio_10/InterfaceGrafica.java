import javax.swing.JOptionPane;
public class InterfaceGrafica{
    public static void main(String [] args){
        //declaração de variáveis
        double custoFabrica, custoFinal;
        //entrada de dados
        custoFabrica = Double.parseDouble(JOptionPane.showInputDialog("Informe o custo de fábrica do carro: "));
        //processamento
        custoFinal = custoFabrica + (custoFabrica * 0.28) + (custoFabrica * 0.45);
        //saída de dados
        JOptionPane.showMessageDialog(null, "O custo final do carro é de: R$ " + custoFinal);
    }
}