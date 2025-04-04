package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class IMC extends JFrame {
    private JPanel pnlPrincipal;
    private JLabel lblTextoPainel;
    private JLabel lblMiniTexto;
    private JButton btnPeso;
    private JButton btnAltura;

    public IMC() {
        setTitle("Índice de massa corporal");
        setSize(500, 400);
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Components();
        setVisible(true);
    }

    private void Components() {

        pnlPrincipal = new JPanel();
        pnlPrincipal.setLayout(null);

        pnlPrincipal.setBounds(10, 115, 500, 100);
        pnlPrincipal.setBackground(new Color( 100, 172, 193));
        getContentPane().add(pnlPrincipal);

        lblTextoPainel = new JLabel("Indice de massa corporal(IMC)");
        lblTextoPainel.setBounds(10, 10, 200, 25);
        lblTextoPainel.setForeground(Color.white);
        pnlPrincipal.add(lblTextoPainel);

        lblMiniTexto = new JLabel("Uma medida da gordura corporal em adultos");
        lblMiniTexto.setForeground(Color.white);
        lblMiniTexto.setBounds(10, 23, 500, 25);
        pnlPrincipal.add(lblMiniTexto);
        getContentPane().add(pnlPrincipal);

        btnPeso = new JButton(new AbstractAction("Peso") {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        btnPeso.setBounds(65, 150, 250, 25);
        getContentPane().add(btnPeso);

        lblTextoPainel.setBounds(10, 10, 200, 25);
        btnPeso.setLayout(null);
    }
}
