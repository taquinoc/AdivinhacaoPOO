/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advinhacao;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author e6661387
 */
public class Game {

    Jogador j1 = new Jogador();
    Jogador j2 = new Jogador();
    Jogador j3 = new Jogador();
    Random numeroAleatorio = new Random();

    public void iniciarJogo() {

        JOptionPane.showMessageDialog(null, "Bem-vindo, o jogo será iniciado");
        JOptionPane.showMessageDialog(null, "Carregando jogadores e gerando número aleatório");
        j1.nome = JOptionPane.showInputDialog("Insira o nome do Jogador 1");
        j2.nome = JOptionPane.showInputDialog("Insira o nome do Jogador 2");
        j3.nome = JOptionPane.showInputDialog("Insira o nome do Jogador 3");
        j1.palpite = Integer.parseInt(JOptionPane.showInputDialog(j1.nome+", por favor insira seu palpite de 1 a 5. "));
        j2.palpite = Integer.parseInt(JOptionPane.showInputDialog(j2.nome+", por favor insira seu palpite de 1 a 5. "));
        j3.palpite = Integer.parseInt(JOptionPane.showInputDialog(j3.nome+", por favor insira seu palpite de 1 a 5. "));

    }

    void verificarPalpites() {

        int num = numeroAleatorio.nextInt(4)+1;

        JOptionPane.showMessageDialog(null, "O número randomico escolhido é: " + num);
        JOptionPane.showMessageDialog(null, "Verificando números e descobrindo o ganhador!");
        JOptionPane.showMessageDialog(null, "Os palpites dos jogadores: \n"+j1.nome+" = " + j1.palpite + "\n"+j2.nome+" = " + j2.palpite + "\n"+j3.nome+" = " + j3.palpite + "\n");

        if (j1.palpite == num) {
            JOptionPane.showMessageDialog(null, "Parabéns,"+j1.nome+" você ganhou!");
        }
        if (j2.palpite == num) {
            JOptionPane.showMessageDialog(null, "Parabéns,"+j2.nome+" você ganhou!");
        }

        if (j3.palpite == num) {
            JOptionPane.showMessageDialog(null, "Parabéns, "+j3.nome+" você ganhou!");
        }
        
        if(j1.palpite != num && j2.palpite != num && j3.palpite != num){
            JOptionPane.showMessageDialog(null, "Ninguém ganhou :( tente novamente!");
        }
    }
}
