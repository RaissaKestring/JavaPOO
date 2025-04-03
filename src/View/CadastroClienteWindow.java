package View;

import javax.swing.*;
import java.awt.event.ActionEvent;

// Passo 1: Usar herança para escolher uma janela
// Passo 2: Criar o construtor
// Passo 3: Definir os componentes usados na tela

public class CadastroClienteWindow extends JFrame {

    private JLabel lblNome, lblCpf;
    private JTextField txfNome, txfCpf;
    private JButton btnSalvar;

    public CadastroClienteWindow() {
        setTitle("Cadastro de Cliente");
        setSize(500, 160);
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        componentesCriar();
        setVisible(true);
    }

    private void componentesCriar() {
        lblNome = new JLabel("Nome: ");
        lblNome.setBounds(10, 10, 50, 25);
        getContentPane().add(lblNome);

        txfNome = new JTextField();
        txfNome.setBounds(65, 10, 250, 25);
        getContentPane().add(txfNome);

        lblCpf = new JLabel("CPF: ");
        lblCpf.setBounds(10, 45, 50, 25);
        getContentPane().add(lblCpf);

        txfCpf = new JTextField();
        txfCpf.setBounds(65, 45, 250, 25);
        getContentPane().add(txfCpf);

        btnSalvar = new JButton(new AbstractAction("Salvar") {

            //Required field modal
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txfNome.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(txfNome, "Campo nome obrigatório!");
                    return;
                }

                if(txfCpf.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(txfCpf, "Campo CPF obrigatório!");
                    return;
                }

                JOptionPane.showMessageDialog(btnSalvar, "Cliente salvo! :D");
            }
        });
        btnSalvar.setBounds(65, 80, 250, 25);
        getContentPane().add(btnSalvar);
    }
}
