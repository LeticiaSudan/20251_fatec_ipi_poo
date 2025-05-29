package br.fatec;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        var menu = "1-Cadastrar\n2-Atualizar\n3-Remover\n4-Listar\n0-Sair";
        int op;
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch(op){
                case 1:{
                    try{
                        var nome = JOptionPane.showInputDialog("Nome?");
                        var fone = JOptionPane.showInputDialog("Fone?");
                        var email = JOptionPane.showInputDialog("Email?");
                        var pessoa = new Pessoa(nome, fone, email);
                        var dao = new PessoaDAO();
                        dao.cadastrar(pessoa);
                        JOptionPane.showMessageDialog(null, "Cadastro ok!");
                    }
                    catch(Exception e){
                        e.printStackTrace();
                        JOptionPane.showMessageDialog(null, "Tente novamente mais tarde");
                    }
                    break;
                }
                case 2:{
                    try{
                        var nome = JOptionPane.showInputDialog("Nome?");
                        var fone = JOptionPane.showInputDialog("Fone?");
                        var email = JOptionPane.showInputDialog("Email?");
                        var codigo = Integer.parseInt(JOptionPane.showInputDialog("Código?"));
                        var pessoa = new Pessoa(codigo, nome, fone, email);
                        var dao = new PessoaDAO();
                        dao.atualizar(pessoa);
                        JOptionPane.showMessageDialog(null, "Atualização ok");
                    }
                    catch(Exception e){
                        e.printStackTrace();
                        JOptionPane.showMessageDialog(null, "Sistema indisponivel");
                    }
                    break;
                }
                case 3:{
                    try{
                        var codigo = Integer.parseInt(JOptionPane.showInputDialog("Código?"));
                        var pessoa = new Pessoa(codigo);
                        var dao = new PessoaDAO();
                        dao.deletar(pessoa);
                        JOptionPane.showMessageDialog(null,"Exclusão realizada com sucesso!");
                    }
                    catch(Exception e){
                        e.printStackTrace();
                        JOptionPane.showMessageDialog(null, "Sistema indisponivel");
                    }
                    break;
                }
                case 4:{
                    try{
                        var sb = new StringBuilder("");
                        for(Pessoa p : new PessoaDAO().listar()){
                            sb.append(p).append("\n");
                        }
                        JOptionPane.showMessageDialog(null, sb);
                        // JOptionPane.showMessageDialog(null, new PessoaDAO().listar());
                    }
                    catch(Exception e){
                        e.printStackTrace();
                        JOptionPane.showMessageDialog(null, "Indisponível");
                    }
                }
            }
        }while (op != 0);
    }
}
