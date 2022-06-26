package vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RequisitarPeca extends JFrame{
    private JPanel painelPrincipal;
    private JTextField textFieldNomePecaRequisitar;
    private JTextField textFieldQuantidadePecaRequisitar;
    private JButton buttonOK;
    private JButton buttonVoltar;

    public RequisitarPeca() {
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
