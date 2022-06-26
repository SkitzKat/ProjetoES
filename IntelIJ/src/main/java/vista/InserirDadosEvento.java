package vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InserirDadosEvento extends JFrame{
    private JPanel painelPrincipal;
    private JTextField txtLocal;
    private JTextField txtDataInicio;
    private JTextField txtDataFim;
    private JTextField txtNVeiculos;
    private JButton buttonOK;
    private JButton buttonVoltar;

    public InserirDadosEvento() {
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
