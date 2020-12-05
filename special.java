import javax.swing.*;
import java.awt.*;

public class special extends JFrame{
	private JPanel MainPanel;
	private JLabel InfoLabel;
	private JPanel InfoPanel;
	private JPanel InfoIconPanel;
	private JLabel InfoIconLabel;
	private JPanel DetailPanel;
	private JPanel ImgPanel;
	private JTextField TitleTextField;
	private JEditorPane DescriptionText;
	private JTextArea DisclaimerText;
	private JPanel DisclaimerPanel;
	private JButton ContactButton;
	private JButton InventoryButton;
	private JButton PictureButton;
	private JButton publishButton;
	private JLabel ImgLabel;

	special(){
		ImageIcon imageIcon = new ImageIcon("src/images/info.png"); // load the image to a imageIcon
		Image image = imageIcon.getImage(); // transform it
		Image newimg = image.getScaledInstance(30, 30,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
		imageIcon = new ImageIcon(newimg);  // transform it back
		InfoIconLabel = new JLabel(imageIcon);
		InfoIconPanel.add(InfoIconLabel);


		ImageIcon CarIcon = new ImageIcon("src/images/car1.png"); // load the image to a imageIcon
		Image car = CarIcon.getImage(); // transform it
		Image img = car.getScaledInstance(300, 150,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
		CarIcon = new ImageIcon(img);  // transform it back
		ImgLabel = new JLabel(CarIcon);
		ImgPanel.add(ImgLabel);
	}


	public static void main(String[] args) {
		special sp = new special();
		sp.setContentPane(sp.MainPanel);
		sp.setDefaultCloseOperation(EXIT_ON_CLOSE);
		sp.setVisible(true);
		sp.setExtendedState(JFrame.MAXIMIZED_BOTH);
		sp.setMinimumSize(new Dimension(1070,700));
	}
}
