package vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InserirDadosVeĆ­culoCliente extends JFrame{
    private JPanel painelPrincipal;
    private JTextField textFieldMatricula;
    private JTextField textFieldModelo;
    private JTextField textFieldMarca;
    private JTextField textFieldDonoAnterior;
    private JTextField textFieldNumeroDonos;
    private JTextField textFieldDescricao;
    private JButton buttonVoltar;
    private JButton buttonOK;

    public InserirDadosVeĆ­culoCliente() {
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
