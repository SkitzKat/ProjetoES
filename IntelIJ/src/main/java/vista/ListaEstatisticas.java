package vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListaEstatisticas extends JFrame{
    private JPanel painelPrincipal;
    private JLabel marcaMaisVendida;
    private JLabel modeloMaisVendido;
    private JLabel melhorCliente;
    private JLabel melhorFilial;
    private JButton buttonVoltar;

    public ListaEstatisticas() {
        buttonVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
