package View;

import javax.swing.*;
import java.awt.*;

public class IMC extends JFrame {
    private JPanel pnlPrincipal;
    private JLabel lblTextoPainel;
    private JLabel lblMiniTexto;

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
        pnlPrincipal.setBounds(10, 115, 500, 100);
        pnlPrincipal.setBackground(new Color( 100, 172, 193));
        getContentPane().add(pnlPrincipal);

        lblTextoPainel = new JLabel("Indice de massa corporal(IMC)");
        lblTextoPainel.setForeground(Color.white);
        pnlPrincipal.add(lblTextoPainel);
        getContentPane().add(pnlPrincipal);

        lblMiniTexto = new JLabel("Uma medida da gordura corporal em adultos");
        lblMiniTexto.setBounds(10, 200, 1, 100);
        lblMiniTexto.setForeground(Color.white);
        pnlPrincipal.add(lblMiniTexto);
        getContentPane().add(lblMiniTexto);
    }
}
