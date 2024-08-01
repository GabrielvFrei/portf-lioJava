package loginV3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Cadastro extends JFrame implements ActionListener {
    private JTextField userField;
    private JPasswordField passwordField;
    private JComboBox<String> perfilComboBox;

    private List<Usuario> usuariosCadastrados = new ArrayList<>();

    public Cadastro() {
        setTitle("CADASTRO");
        Container c = getContentPane();
        c.setLayout(new GridLayout(4, 2));

        JLabel lblUsuario = new JLabel("Nome de Usuário:");
        c.add(lblUsuario);

        userField = new JTextField();
        c.add(userField);

        JLabel lblSenha = new JLabel("Senha:");
        c.add(lblSenha);

        passwordField = new JPasswordField();
        c.add(passwordField);

        JLabel lblPerfil = new JLabel("Perfil:");
        c.add(lblPerfil);

        perfilComboBox = new JComboBox<>(new String[]{"ADM", "Técnico", "Comum"});
        c.add(perfilComboBox);

        JButton btnCadastrar = new JButton("Cadastrar");
        btnCadastrar.addActionListener(this);
        c.add(btnCadastrar);

        JButton btnLimpar = new JButton("Limpar");
        btnLimpar.addActionListener(this);
        c.add(btnLimpar);

        JButton btnLogin = new JButton("Login");
        btnLogin.addActionListener(this);
        c.add(btnLogin);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void cadastrarUsuario() {
        String nome = userField.getText();
        String senha = new String(passwordField.getPassword());
        String perfil = (String) perfilComboBox.getSelectedItem();

        if (nome.isEmpty() || senha.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos.");
            return;
        }

        for (Usuario usuario : usuariosCadastrados) {
            if (usuario.getNome().equals(nome)) {
                JOptionPane.showMessageDialog(null, "Nome de usuário já cadastrado.");
                return;
            }
        }

        Usuario novoUsuario = new Usuario(nome, senha, perfil);
        usuariosCadastrados.add(novoUsuario);

        JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso.");
        userField.setText("");
        passwordField.setText("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        switch (action) {
            case "Cadastrar":
                cadastrarUsuario();
                break;
            case "Limpar":
                userField.setText("");
                passwordField.setText("");
                break;
            case "Login":
                dispose();
                new Login(usuariosCadastrados).loginTela();
                break;
        }
    }
}
