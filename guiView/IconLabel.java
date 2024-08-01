//GABRIEL ALVES DE FREITAS
//ENZO RAFAEL OLIVEIRA BRITO 
package guiView;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class IconLabel extends JFrame {
	
	JLabel label, image;
	JButton proximo, anterior;
	ImageIcon foto1 = new ImageIcon(getClass().getResource("images/PERSONAGENS.png"));
	ImageIcon foto2 = new ImageIcon(getClass().getResource("images/MORDECAI.PNG"));
	ImageIcon foto3 = new ImageIcon(getClass().getResource("images/RIGBY.png"));
	ImageIcon foto4 = new ImageIcon(getClass().getResource("images/FANTASMAO.png"));
	ImageIcon foto5 = new ImageIcon(getClass().getResource("images/SALTITAO.jpg"));
	ImageIcon foto6 = new ImageIcon(getClass().getResource("images/BENSON.png"));
	ImageIcon foto7 = new ImageIcon(getClass().getResource("images/PAIRULITO.png"));
	ImageIcon foto8 = new ImageIcon(getClass().getResource("images/APENASUMSHOW.png"));
	ImageIcon foto9 = new ImageIcon(getClass().getResource("images/MUSCULOSO.jpg"));
	
	int co = 0;
	ImageIcon[] myImages = {foto1, foto2, foto3, foto4, foto5, foto6, foto7, foto8, foto9};

	public IconLabel() {
		super("Plymouth");
		
		Container c = getContentPane();
		label = new JLabel("Personagens de Apenas um Show");
		label.setFont(new Font("serif", Font.PLAIN, 30));
		label.setHorizontalAlignment(JLabel.CENTER);
		image = new JLabel(myImages[co]);  
		
		proximo = new JButton(">");
		proximo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				co++;
				if (co >= myImages.length) {
					co = 0;
				}
				image.setIcon(myImages[co]);
			}
		});
		
		anterior = new JButton("<");
		anterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				co--;
				if (co < 0) {
					co = myImages.length - 1;
				}
				image.setIcon(myImages[co]);
			}
		});
		
		c.add(BorderLayout.NORTH, label);
		c.add(BorderLayout.CENTER, image);
		c.add(BorderLayout.EAST, proximo);
		c.add(BorderLayout.WEST, anterior);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new IconLabel();
	}
}