package vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InserirDadosVeículoCliente extends JFrame{
    private JPanel painelPrincipal;
    private JTextField textFieldMatricula;
    private JTextField textFieldModelo;
    private JTextField textFieldMarca;
    private JTextField textFieldDonoAnterior;
    private JTextField textFieldNumeroDonos;
    private JTextField textFieldDescricao;
    private JButton buttonVoltar;
    private JButton buttonOK;

    public InserirDadosVeículoCliente() {
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
