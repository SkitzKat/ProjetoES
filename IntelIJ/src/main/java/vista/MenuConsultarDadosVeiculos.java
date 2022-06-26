package vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuConsultarDadosVeiculos extends JFrame{
    private JPanel painelPrincipal;
    private JButton buttonConsultarVeiculosEmpresa;
    private JButton buttonConsultarVeiculosFilial;
    private JButton buttonVoltar;

    public MenuConsultarDadosVeiculos() {
        buttonConsultarVeiculosEmpresa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        buttonConsultarVeiculosFilial.addActionListener(new ActionListener() {
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
