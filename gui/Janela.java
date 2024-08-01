//Gabriel Alves de Freitas
package gui;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Janela {

	public Janela() {
		JFrame frame = new JFrame();
		frame.setTitle("FanPage");
		Container sContainer = frame.getContentPane();
		JPanel leftContainer = new JPanel();
		JPanel rightContainer = new JPanel();
		sContainer.setLayout(new GridLayout(1,2));
		leftContainer.setLayout(new GridLayout(2,1));
		rightContainer.setLayout(new GridLayout(4,1));
		sContainer.add(leftContainer);
		sContainer.add(rightContainer);
		JButton btnOk = new JButton();
		JButton btnCancel = new JButton();
		JButton btnLike = new JButton();
		JButton btnShare = new JButton();
		JButton btnDislike = new JButton();
		JButton btnReport = new JButton();
		btnOk.setText("Ok");
		btnCancel.setText("Cancelar");
		btnLike.setText("Curtiu");
		btnShare.setText("Compartilhar");
		btnDislike.setText("Não Curtiu");
		btnReport.setText("Denunciar");
		leftContainer.add(btnOk);
		leftContainer.add(btnCancel);
		rightContainer.add(btnLike);
		rightContainer.add(btnShare);
		rightContainer.add(btnDislike);
		rightContainer.add(btnReport);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 200);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Janela();
		
	}
}
