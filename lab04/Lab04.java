/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Lab04 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(10,10,10,10));
        pane.setVgap(5);
        pane.setHgap(5);

        pane.add(new Label("UserName: "),0,0);
        pane.add(new TextField(), 1,0);
        pane.add(new Label("Password: "), 0,1);
        pane.add(new TextField(), 1,1);
        pane.add(new Label("Full Name:"), 0 , 2);
        pane.add(new TextField(), 1 ,2);
        pane.add(new Label("E-Mail: "), 0,3);
        pane.add(new TextField(), 1,3);
        pane.add(new Label("Phone #: "),0,4);
        pane.add(new TextField(),1,4);
        pane.add(new Label("Date of Birth: "),0,5);
        pane.add(new TextField(),1,5);
        

        Button btAdd = new Button("Register");
        pane.add(btAdd, 1,6);
        

        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Lab 04 Solution");
        primaryStage.show();
    }
}

