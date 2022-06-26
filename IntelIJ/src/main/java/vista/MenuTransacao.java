package vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuTransacao extends JFrame{
    private JPanel painelPrincipal;
    private JButton buttonClienteCompraVeiculo;
    private JButton buttonClienteVendeVeiculo;
    private JButton buttonClienteTrocaVeiculo;
    private JButton buttonVoltar;

    public MenuTransacao() {
        buttonClienteCompraVeiculo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        buttonClienteVendeVeiculo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        buttonClienteTrocaVeiculo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        buttonVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
