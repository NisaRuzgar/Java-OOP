package business;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Presentation extends JFrame{
	
	public Presentation(){
		
		setSize(400,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container cp = getContentPane();
		
		CardLayout cl = new CardLayout();
		JPanel cards = new JPanel(cl); // Parent panel
		
		Border border = BorderFactory.createEmptyBorder(10, 10, 10, 10);
		
		
		// First panel ( Cargo information and price calculation )
		
				JLabel labelWeight = new JLabel("");
				JLabel labelDate = new JLabel("Current date:");
				JLabel labelTransport = new JLabel("Transportation type:");
				JLabel labelWhoPays = new JLabel("Who pays:");
				JTextField tfWeight = new JTextField(15);
				JTextField tfDate = new JTextField(15);
				String[] dataTransport = {"RAIL", "AIR", "ROAD"};
				JComboBox<String> listTransport = new JComboBox<String>(dataTransport);
				String[] dataWhoPays = {"Sender", "Receiver"};
				JComboBox<String> listWhoPays = new JComboBox<String>(dataWhoPays);
				JButton butPrice = new JButton("Calculate Price");
				JLabel labelError = new JLabel();
				
				GridLayout gl1 = new GridLayout(6,2);
				gl1.setHgap(5);
				gl1.setVgap(5);
				JPanel cardPriceCalculation = new JPanel(gl1);
				cardPriceCalculation.setBorder(border);
				
				cardPriceCalculation.add(labelWeight);
				cardPriceCalculation.add(tfWeight);
				cardPriceCalculation.add(labelDate);
				cardPriceCalculation.add(tfDate);
				cardPriceCalculation.add(labelTransport);
				cardPriceCalculation.add(listTransport);
				cardPriceCalculation.add(labelWhoPays);
				cardPriceCalculation.add(listWhoPays);
				cardPriceCalculation.add(butPrice);
				cardPriceCalculation.add(labelError);
				
				
				
				setVisible(true);
		
	}
	
	public static void main(String[] args) throws ParseException{
		

		Presentation gui = new Presentation();
		
		
	}
	
	
	
}
