package electricity.billing.system;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class Login extends JFrame {
    
    JTextField userText, passwordText;
    Choice loginChoice;
    JButton loginButton, signUpButton , cancelButton;
    
    Login() {
      //!----------------- Frame (DO NOT CHANGE) -----------------
        //! Frame settings
        setTitle("Login");
        getContentPane().setBackground(Color.GRAY);
        setSize(640, 300);
        setLocation(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);  // Absolute positioning
        //!----------------- Frame -----------------
        
        
        //*----------------- Image -----------------
        ImageIcon originalIcon = new ImageIcon(Objects.requireNonNull(getClass().getResource("/icon/LoginIcon.png")));
        
        // Scale the image to the desired dimensions
        Image scaledImage = originalIcon.getImage().getScaledInstance(260, 230, Image.SCALE_AREA_AVERAGING); // Scale Area Averaging
        ImageIcon loginImage = new ImageIcon(scaledImage);
        JLabel imageLabel = new JLabel(loginImage);
        imageLabel.setBounds(10, 20, 260, 185);
        add(imageLabel);
        //*----------------- Image -----------------
        
        
//*------------------ Labels and Text Fields ------------------ *//
        JLabel userName = new JLabel("Username");
        userName.setBounds(300, 60, 100, 25);
        add(userName);
        
        userText = new JTextField();
        userText.setBounds(380, 60, 150, 25);
        userText.setToolTipText("Enter your username");
        add(userText);
        
        JLabel password = new JLabel("Password");
        password.setBounds(300, 100, 100, 25);
        add(password);
        
        passwordText = new JPasswordField();
        passwordText.setBounds(380, 100, 150, 25);
        passwordText.setToolTipText("Enter your password");
        add(passwordText);
        
        JLabel loginAs = new JLabel("Login As");
        loginAs.setBounds(300, 140, 50, 25);
        add(loginAs);
        
        loginChoice = new Choice();
        loginChoice.add("Admin");
        loginChoice.add("Customer");
        loginChoice.setBounds(380, 140, 150, 25);
        add(loginChoice);
//*------------------ Labels and Text Fields ------------------ *//
        
        
        //* ----------------- Buttons ----------------- *//
        loginButton = new JButton("Login");
        loginButton.setBounds(300, 180, 100, 25);
        loginButton.setToolTipText("Click to login");
        loginButton.setBackground(Color.GREEN);
        add(loginButton);
        
        signUpButton = new JButton("Sign Up");
        signUpButton.setBounds(360, 220, 100, 25);
        signUpButton.setBackground(Color.CYAN);
        
        signUpButton.setToolTipText("Click to sign up");
        add(signUpButton);
        
        cancelButton = new JButton("Cancel");
        cancelButton.setBounds(420, 180, 100, 25);
        cancelButton.setToolTipText("Click to cancel");
        cancelButton.setBackground(Color.RED);
        add(cancelButton);
        //* ----------------- Buttons ----------------- *//
        
        

        
        //! Make the window visible
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Login();
    }
}
