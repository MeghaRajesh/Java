import java.awt.Frame;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.*;

public class RegistrationForm extends Frame implements ActionListener{
    TextField name = new TextField(20);
    TextField email = new TextField(20);
    TextField no = new TextField(20);
    TextField dob = new TextField(20);
    TextField gender = new TextField(20);
    Button button;

    RegistrationForm(){
        setTitle("Registration Form");
        setSize(300,200);
        setVisible(true);
        setLayout(new FlowLayout());
        button = new Button("Submit ");

        Label label1 =new Label("Name");
        label1.setAlignment(Label.CENTER);
       
        Label label2 =new Label("Email");
        label2.setAlignment(Label.CENTER);
       
        Label label3 =new Label("Phone no");
        label3.setAlignment(Label.CENTER);
        
        Label label4 =new Label("Gender");
        label4.setAlignment(Label.CENTER);

        Label label5 =new Label("Date of birth");
        label5.setAlignment(Label.CENTER);
        
        add(label1);
        add(name);
        add(label2);
        add(email);
        add(label3);
        add(no);
        add(label4);
        add(gender);
        add(label5);
        add(dob);

        add(button);

        name.setText("Name :");
        email.setText("E-mail :");
        no.setText("Phone no :");
        gender.setText("Gender :");
        dob.setText("DOB");
        

        button.addActionListener(this);
        
    }
    public void actionPerformed(ActionEvent e){
        System.out.println("Name : "+name.getText());
        System.out.println("E mail : "+email.getText());
        System.out.println("Phone no : "+no.getText());
        System.out.println("Gender : "+gender.getText());
        System.out.println("Date of Birth : "+dob.getText());
    }

    public static void main(String[] args){
        RegistrationForm regForm = new RegistrationForm();
    }
}
