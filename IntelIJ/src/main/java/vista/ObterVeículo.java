package vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ObterVeículo extends JFrame{
    private JPanel painelPrincipal;
    private JTextField textFieldMatriculaVeiculoEscolhido;
    private JButton buttonOK;
    private JButton buttonVoltar;

    public ObterVeículo() {
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
