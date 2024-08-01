package telaLogin;
//Gabriel Alves de Freitas

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class telaLogins extends JFrame{
		
	private JTextField user;
	private JPasswordField password;
	

	public telaLogins() {	
  	
      JFrame frame = new JFrame();
      frame.setTitle("Tela de Login");
      Container c = frame.getContentPane();
      c.setLayout(new GridLayout(3,2));

      JLabel lblUsuario = new JLabel("Usúario:");
      c.add(lblUsuario);
      
      user = new JTextField(); 
      c.add(user);
      
      JLabel lblSenha = new JLabel("Senha:");
      c.add(lblSenha);
      
      password = new JPasswordField();
      
      c.add(password);
      
      
      
     
      JButton btnok = new JButton("OK");
      btnok.addActionListener(new ActionListener(){ 
      	public void actionPerformed(ActionEvent e) {
      		Logar();
      	}
      });
      
      JButton btncancel = new JButton("CANCELAR");
      btncancel.addActionListener(new ActionListener(){
      	public void actionPerformed(ActionEvent e) {
    		user.setText("");
    		password.setText("");
      	}
      });
      
      c.add(btnok);
      c.add(btncancel);
      
      

      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(300, 150);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
      
  }
  
	private void Logar() {
	    String usuario = user.getText();
	    String senha = new String(password.getPassword());
	    if (usuario.equals("Admim")&&(senha.equals("123abc"))) {
	        JOptionPane.showMessageDialog(null, "Login Validado!", "Login", JOptionPane.INFORMATION_MESSAGE);
	    }else {
	    	JOptionPane.showMessageDialog(null, "Login incorreto!", "Login", JOptionPane.INFORMATION_MESSAGE);
	    }
	}

	public static void main(String[] args) {
	    new telaLogins();
	}

}
