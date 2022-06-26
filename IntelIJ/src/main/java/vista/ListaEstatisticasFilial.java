package vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListaEstatisticasFilial extends JFrame{
    private JPanel painelPrincipal;
    private JLabel marcaMaisVendidaFilial;
    private JLabel modeloMaisVendidoFilial;
    private JButton buttonVoltar;

    public ListaEstatisticasFilial() {
        buttonVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
