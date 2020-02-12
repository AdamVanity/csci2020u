/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04;
import javafx.event.EventHandler;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Lab04 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        DatePicker datePick = new DatePicker();
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(10,10,10,10));
        pane.setVgap(20);
        pane.setHgap(20);
        TextField username = new TextField();
        PasswordField password = new PasswordField();
        TextField fullname = new TextField();
        TextField email = new TextField();
        TextField phone = new TextField();
        pane.add(new Label("UserName: "),0,0);
        pane.add(username, 1,0);
        pane.add(new Label("Password: "), 0,1);
        pane.add(password, 1,1);
        pane.add(new Label("Full Name:"), 0 , 2);
        pane.add(fullname, 1 ,2);
        pane.add(new Label("E-Mail: "), 0,3);
        pane.add(email, 1,3);
        pane.add(new Label("Phone #: "),0,4);
        pane.add(phone,1,4);
        pane.add(new Label("Date of Birth: "),0,5);
        pane.add(datePick, 1,5);
        
        
        

        Button btAdd = new Button();
        btAdd.setText("Register");
        btAdd.setOnAction(new EventHandler<ActionEvent>() {
            
        @Override public void handle(ActionEvent e) {
            System.out.println("First Name = " + username.getText() + 
                      "\nPassword =" + password.getText() + 
                      "\nFull Name =" + fullname.getText() + 
                      "\nEmail =" + email.getText() +
                      "\nPhone Number = (" + phone.getText().charAt(0) +
                    phone.getText().charAt(1) + phone.getText().charAt(2) + ") - " 
                    + phone.getText().charAt(3) + phone.getText().charAt(4) +
                    phone.getText().charAt(5) + " - "+ phone.getText().charAt(6) +
                    phone.getText().charAt(7) + phone.getText().charAt(8) +
                      "\nDate Of Birth = " + datePick.getValue());
           username.setText("");
           password.setText("");
           fullname.setText("");
           email.setText("");
           phone.setText("");
           datePick.setValue(null);
            
        }
        });
        
        
        pane.add(btAdd, 1,6);
        

        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Lab 04 Solution");
        primaryStage.show();
    }
    
    
}

