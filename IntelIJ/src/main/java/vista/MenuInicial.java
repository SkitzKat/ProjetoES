package vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuInicial extends JFrame{
    private JPanel painelPrincipal;
    private JButton buttonConsultarDados;
    private JButton buttonEfetuarTransacao;
    private JButton buttonAdicionarEvento;
    private JButton buttonAdicionarPecasStock;
    private JButton buttonRequisitarPecasSede;
    private JButton buttonSair;

    public MenuInicial() {

        setContentPane(painelPrincipal);
        pack();
        setVisible(true);


        buttonConsultarDados.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        buttonEfetuarTransacao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        buttonAdicionarEvento.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        buttonAdicionarPecasStock.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        buttonRequisitarPecasSede.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        buttonSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        new MenuInicial();
    }
}
