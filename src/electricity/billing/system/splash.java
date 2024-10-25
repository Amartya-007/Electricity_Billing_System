package electricity.billing.system;

import javax.swing.*;
import java.awt.*;

public class splash extends JFrame {

    // Constructor to set up the splash screen
    splash() {
        setTitle("Electricity Billing System");  // Set the window title

        // Load the original image from resources
        ImageIcon originalIcon = new ImageIcon(ClassLoader.getSystemResource("icon/Splash.jpg"));

        Image scaledImage = originalIcon.getImage().getScaledInstance(600, 400, Image.SCALE_DEFAULT);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        JLabel imageLabel = new JLabel(scaledIcon);
        setLayout(new BorderLayout());
        add(imageLabel, BorderLayout.CENTER);


        // Set JFrame properties like size, position, and visibility
        setSize(600, 400);                         // Set the size of the window
        setLocation(500, 200);                         // Set the position of the window on the screen
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Close the application when the window is closed
        setVisible(true);                          // Make the frame visible


        try{
           Thread.sleep(1000);
              setVisible(false);
                new Login();
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Error: "+e);
        }




    }

    // Main method to execute the splash screen
    public static void main(String[] args) {
        new splash();  // Create an instance of the splash screen
    }
}
