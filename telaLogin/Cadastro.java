package gui;

//KAUAN LEONARDO FELIPE ROSSI
//GABRIEL LIMA ANDRADE

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Cadastro extends JFrame implements ActionListener{

	private JTextField user1;
	private JPasswordField senha1;
	private String usuario="";


	private String senha="";
	
	
	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public void cadastroMenu() {
		
		setTitle("CADASTRO");
		Container c = getContentPane();
		c.setLayout(new GridLayout(3,2));
		
		JLabel lblUsuario = new JLabel("Usúario:");//escrever na label
        c.add(lblUsuario);//adiciona a label no container
        
        user1 = new JTextField(); //seta user como um campo de Texto
        c.add(user1);//adiciona no layout
        
        JLabel lblSenha = new JLabel("Senha:");//escrever na label
        c.add(lblSenha);//adiciona no layout
        
        senha1 = new JPasswordField();//seta senha como um campo de Password
        c.add(senha1);//adiciona o campo de digitação
        
        JButton btncontinuar = new JButton("Continuar");//botão de Continuar
        btncontinuar.addActionListener(new ActionListener(){//quando eu clicar no botão ativa uma funçao
        	public void actionPerformed(ActionEvent e) {
        		Cadastrar();
        	}
        });
        
        JButton btncancel = new JButton("CANCELAR");//botão de cancelar
        btncancel.addActionListener(new ActionListener(){//quando eu clicar no botão ativa uma funçao
        	public void actionPerformed(ActionEvent e) {
        		senha1.setText("");
        		user1.setText("");
        	}
        });
        
        c.add(btncontinuar);//adiciona o botão de ok
        c.add(btncancel);//adiciona o botao de cancelar

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//fazer o x da janela fechar
        setSize(300, 150);//setar o tamanho da ja
        setLocationRelativeTo(null);//Centralizar a janela na tela
        setVisible(true);//deixar a janela visivel
	}
	
	
	private void Cadastrar() {
		
		String Senha= new String(senha1.getPassword());
		
		if(usuario=="") {
			if(user1.getText().equals("") || Senha.equals("")) {
				JOptionPane.showMessageDialog(null, "Digite algum valor");
			}else {
				usuario=user1.getText();
				senha= new String(senha1.getPassword());
				JOptionPane.showMessageDialog(null, "Confirme seus dados novamente", "CONFIRMAR CADASTRO",JOptionPane.INFORMATION_MESSAGE);
				user1.setText("");
				senha1.setText("");
			}
		}else {
			
			if(user1.getText().equals("") || Senha.equals("")) {
				JOptionPane.showMessageDialog(null, "Digite algum valor");

			}else {
				if(user1.getText().equals(usuario) && Senha.equals(senha)) {
					Login login = new Login(user1.getText(),Senha);
					
					JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso");
					
					setSenha(Senha);
					setUsuario(usuario);
					
					login.loginTela();
					setVisible(false);
				}else {
					JOptionPane.showMessageDialog(null, "Erro no cadastro");
					user1.setText("");
					senha1.setText("");
					usuario="";
					senha="";
				}
			}
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
