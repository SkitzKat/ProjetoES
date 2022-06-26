package vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdicionarPecaAoStock extends JFrame{
    private JPanel painelPrincipal;
    private JTextField textFieldNomePecaAdicionar;
    private JTextField textFieldQuantidadePecaAdicionar;
    private JTextField textFieldLocalPecaAdicionar;
    private JButton buttonOK;
    private JButton buttonVoltar;


    public AdicionarPecaAoStock() {
        buttonOK.addActionListener(new ActionListener() {
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
