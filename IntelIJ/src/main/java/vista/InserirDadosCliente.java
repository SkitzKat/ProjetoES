package vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InserirDadosCliente extends JFrame{
    private JPanel painelPrincipal;
    private JTextField textFieldNomeCliente;
    private JTextField textFieldNIFCliente;
    private JTextField textFieldContactoCliente;
    private JTextField textFieldMoradaCliente;
    private JButton buttonOK;
    private JButton buttonVoltar;

    public InserirDadosCliente() {
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
