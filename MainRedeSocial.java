package br.com.redesocial;
import javax.swing.JOptionPane;
import java.util.ArrayList;
public class MainRedeSocial {

    public static void main(String[] args) {

        String dataCriacao, nomeUsuario, dataNascimento, senha;
        String dataPublicacao, textoPublicacao, linkMidia;

        dataCriacao= JOptionPane.showInputDialog("Informe a data:");
        nomeUsuario = JOptionPane.showInputDialog("Informe o nome:");
        dataNascimento = JOptionPane.showInputDialog("Informe a data de nascimento:");
        senha = JOptionPane.showInputDialog("Informe a senha:");
        RedeSocial redeSocial1 = new RedeSocial(dataCriacao, nomeUsuario, dataNascimento, senha);
        Publicacao publi1;//INSTANCIA A CLASSE

        ArrayList<Publicacao> publi = new ArrayList<>();
        for (int i=0; i<3; i++){

            dataPublicacao = JOptionPane.showInputDialog("Digite a data da Publicação:");
            textoPublicacao = JOptionPane.showInputDialog("Digite o texto da Publicação:");
            linkMidia = JOptionPane.showInputDialog("Digite o link da Publicação:");
            publi1 = new Publicacao(dataPublicacao, textoPublicacao, linkMidia);//CRIA O OBJETO E RESETA ELE A CADA LOOP
            publi.add(publi1);//INSERE O OBJETO COM SEUS DADOS NO VETOR
            redeSocial1.inserePublicacao(publi1);//INSERE O OBJETO NA REDE SOCIAL
        }
        redeSocial1.imprimePublicacoes();
    }
}