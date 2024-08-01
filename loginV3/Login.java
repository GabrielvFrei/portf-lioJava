package loginV3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class Login extends JFrame implements ActionListener {
    private JTextField userField;
    private JPasswordField passwordField;
    private List<Usuario> usuariosCadastrados;
    private int tentativas = 0;

    public Login(List<Usuario> usuariosCadastrados) {
        this.usuariosCadastrados = usuariosCadastrados;
    }

    public void loginTela() {
        setTitle("LOGIN");
        Container c = getContentPane();
        c.setLayout(new GridLayout(4, 2));

        JLabel lblUsuario = new JLabel("Nome de Usuário:");
        c.add(lblUsuario);

        userField = new JTextField();
        c.add
