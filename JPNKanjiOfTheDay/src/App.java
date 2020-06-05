import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import java.util.Properties;

import javax.imageio.*;
import javax.swing.border.*;

import java.util.*;
import java.text.DateFormat;
import org.jdatepicker.*;
import org.jdatepicker.impl.DateComponentFormatter;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;
import java.text.SimpleDateFormat;

public class App {

	public static void main(String[] args) throws IOException
	{
		JPanel p1 = new JPanel();
		BoxLayout bex = new BoxLayout(p1, BoxLayout.Y_AXIS);
		p1.setLayout(bex);
		
		JPanel p30 = new JPanel();
		JPanel p29 = new JPanel();
		JPanel p28 = new JPanel();
		JFrame f = new JFrame("Kanji of the Day");
		BoxLayout bax = new BoxLayout(p30, BoxLayout.Y_AXIS);
		BoxLayout bix = new BoxLayout(p29, BoxLayout.Y_AXIS);	
		BoxLayout baxter = new BoxLayout(p28, BoxLayout.Y_AXIS);
		p30.setLayout(bax);
		p29.setLayout(bix);
		p28.setLayout(baxter);
		JLabel l = new JLabel("Kanji of the Day: ");
		JLabel l4 = new JLabel("Kanji of the Day: ");		
		JLabel l5 = new JLabel("Kanji of the Day: ");	
		p30.add(l);
		
	//	try {
			BufferedImage kanji = ImageIO.read(new File("C:/Downloads/hana.PNG"));
			JLabel kanjiImage = new JLabel(new ImageIcon(kanji));
			p30.add(kanjiImage);
	//	} catch (IOException e) {
			// TODO Auto-generated catch block
	//		e.printStackTrace();
	//	}
		
		p30.setBorder(new EmptyBorder(new Insets(0, 0, 75, 0)));
		JLabel l2 = new JLabel("Meaning/s: ");
		JLabel l3 = new JLabel("Flower");
		p30.add(l2);
		p30.add(l3);
		
		JLabel strokes = new JLabel("Strokes: ");
		p30.add(strokes);
		
	//	try {
			BufferedImage strokeImage = ImageIO.read(new File("C:/Downloads/hanastrokes.PNG"));
			JLabel steerokeImage = new JLabel(new ImageIcon(strokeImage));
			p30.add(steerokeImage);
		//} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		//}		
		
		JButton nextKanji = new JButton("Next Kanji");
		//p.add(nextKanji);
		
	/*	JPanel p2 = new JPanel();
		JLabel l2 = new JLabel("Meaning/s: ");
		JLabel l3 = new JLabel("Flower");

		BoxLayout bax2 = new BoxLayout(p2, BoxLayout.Y_AXIS);
		
		p2.setLayout(bax2);
		p2.add(l2);
		p2.add(l3);
		p2.setBorder(new EmptyBorder(new Insets(150, 175, 75, 100)));
		*/
		Properties dateFormat = new Properties();
		dateFormat.put("text.today", "today");
		dateFormat.put("text.month", "month");
		dateFormat.put("year", "year");
		UtilDateModel calendar = new UtilDateModel();
		calendar.setSelected(true);
		JDatePanelImpl calendarPanel = new JDatePanelImpl(calendar, dateFormat);
		JDatePickerImpl calendarPicker = new JDatePickerImpl(calendarPanel, new DateComponentFormatter());
		

		
	//	p30.add(calendarPicker);
		p1.add(p30);
		f.add(p1);
		f.add(calendarPicker, BorderLayout.PAGE_END);
		//f.add(calendarPicker);
		//f.add(p2);
		f.setSize(1000, 500);
//		System.out.println(convertedDate);

	
		
		f.setLocationRelativeTo(null);;
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
		p29.add(l4);
		kanji = ImageIO.read(new File("C:/Downloads/natsu.PNG"));
		kanjiImage = new JLabel(new ImageIcon(kanji));
		p29.add(kanjiImage);
		p29.setBorder(new EmptyBorder(new Insets(0, 0, 75, 0)));
		l2 = new JLabel("Meaning/s: ");
		l3 = new JLabel("Summer");
		p29.add(l2);
		p29.add(l3);
	
		strokes = new JLabel("Strokes: ");
		p29.add(strokes);
		strokeImage = ImageIO.read(new File("C:/Downloads/natsustroke1.PNG"));
		steerokeImage = new JLabel(new ImageIcon(strokeImage));
		p29.add(steerokeImage);
		BufferedImage strokeImage2 = ImageIO.read(new File("C:/Downloads/natsu2.PNG"));
		JLabel steerokeImage2 = new JLabel(new ImageIcon(strokeImage2));
		p29.add(steerokeImage2);	
	/*	
		UtilDateModel calendar2 = new UtilDateModel();
		Properties dateFormat2 = new Properties();
		dateFormat2.put("text.today", "today");
		dateFormat2.put("text.month", "month");
		dateFormat2.put("year", "year");
		calendar2.setDate(2020, 04, 29);
		JDatePanelImpl calendarPanel2 = new JDatePanelImpl(calendar2, dateFormat2);
		JDatePickerImpl calendarPicker2 = new JDatePickerImpl(calendarPanel2, new DateComponentFormatter());
		
		p29.add(calendarPicker2);
		*/
		p28.add(l5);
		kanji = ImageIO.read(new File("C:/Downloads/tsuki.PNG"));
		kanjiImage = new JLabel(new ImageIcon(kanji));
		p28.add(kanjiImage);
		p28.setBorder(new EmptyBorder(new Insets(0, 0, 75, 0)));
		l2 = new JLabel("Meaning/s: ");
		l3 = new JLabel("month /n moon");
		p28.add(l2);
		p28.add(l3);
	
		strokes = new JLabel("Strokes: ");
		p28.add(strokes);
		strokeImage = ImageIO.read(new File("C:/Downloads/tsukistrokeorder.PNG"));
		steerokeImage = new JLabel(new ImageIcon(strokeImage));
		p28.add(steerokeImage);
		
		boolean check = false;
		int change = 0;
		int count = 0;
		int idk = 0;
		
		Date picked;// = (Date) calendarPicker.getModel().getValue();
		DateFormat formatted = new SimpleDateFormat("MM-dd-yyyy");
		String convertedDate = "";// = formatted.format(picked);
		
		while (true)
		{	

			if (change == 0 && count == 0)
			{
				picked = (Date) calendarPicker.getModel().getValue();
				convertedDate = formatted.format(picked);
				if (convertedDate.equals("04-29-2020"))
				{
					check = true;
					idk = 1;
				}
				//System.out.println("made it");
			}
			
			if (change == 1 && count!=0)
			{
				picked = (Date) calendarPicker.getModel().getValue();
			/*	if (picked == null)
				{
					System.out.println("the date is null");
				}*/
				convertedDate = formatted.format(picked);
				if (convertedDate.equals("04-29-2020") && check == false)
				{
					check = true;
					idk = 1;
				}
			//	System.out.println("testing testing 1 2 3");
			
			}
		/*	
			if (change == false && count == 1)
			{
			picked = (Date) calendarPicker2.getModel().getValue();
			convertedDate = formatted.format(picked);
			}*/

			
			if (change == 2 && count!=0)
			{
			picked = (Date) calendarPicker.getModel().getValue();
			convertedDate = formatted.format(picked);
			//System.out.println("honors");
			if (convertedDate.equals("04-29-2020") && check == false)
			{
				check = true;
				idk = 1;
				//System.out.println("the 28th");
			}
			}
			
		/*	if (change == 2 && count!=0)
			{
			picked = (Date) calendarPicker.getModel().getValue();
			convertedDate = formatted.format(picked);
			}*/
			
			if (convertedDate.equals("04-29-2020") && check == true && idk == 1)
			{
			/*	f.removeAll();
			//	p29.validate();
			//	p29.repaint();
				f.add(p29);
			//	f.invalidate();
				f.revalidate();
				f.repaint();*/	
				check = false;
				idk = 2;
				//check = false;
				//picked = (Date) calendarPicker2.getModel().getValue();
				//convertedDate = formatted.format(picked);
				p1.remove(p30);
				p1.remove(p29);;
				p1.add(p28);
				p1.revalidate();
				p1.repaint();
				f.pack();
				count+=1;
			}
			if (convertedDate.equals("04-30-2020") && (change == 0 || change == 1) && check ==false)
			{
			/*	f.removeAll();
			//	p29.validate();
			//	p29.repaint();
				f.add(p29);
			//	f.invalidate();
				f.revalidate();
				f.repaint();*/	
				change = 2;
				idk = 1;
				//check=true;
				//check = false;
				//picked = (Date) calendarPicker2.getModel().getValue();
				//convertedDate = formatted.format(picked);
				p1.remove(p30);
				p1.remove(p28);;
				p1.add(p29);
				p1.revalidate();
				p1.repaint();
				f.pack();
				count+=1;
				
			}
			
			if (convertedDate.equals("05-01-2020") && change == 2 && check == false)
			{
	
				//pack();
				change = 1;
				idk = 1;
				//check=true;
				//picked = (Date) calendarPicker.getModel().getValue();
				//convertedDate = formatted.format(picked);
				p1.remove(p29);
				p1.remove(p28);
				p1.add(p30);
				p1.revalidate();
				p1.repaint();
				f.pack();
				//check = false;

				//check = false;
			}
			
			System.out.println(convertedDate);	
		}
	}
}
