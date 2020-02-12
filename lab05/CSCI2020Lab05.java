/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci2020lab05;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Andre
 */


 class DataSource{
    public static ObservableList<StudentRecord> getAllMarks(){
        ObservableList<StudentRecord> marks = FXCollections.observableArrayList();
        marks.add(new StudentRecord("100100100", 75.0f, 68.0f, 54.25f));
        marks.add(new StudentRecord("100100101", 70.0f, 69.25f, 51.5f));
        marks.add(new StudentRecord("100100102", 100.0f, 97.0f, 92.5f));
        marks.add(new StudentRecord("100100103", 90.0f, 88.5f, 68.75f));
        marks.add(new StudentRecord("100100104", 72.25f, 74.75f, 58.25f));
        marks.add(new StudentRecord("100100105", 85.0f, 56.0f, 62.5f));
        marks.add(new StudentRecord("100100106", 70.0f, 66.5f, 61.75f));
        marks.add(new StudentRecord("100100107", 55.0f, 47.0f, 50.5f));
        marks.add(new StudentRecord("100100108", 40.0f, 32.5f, 27.75f));
        marks.add(new StudentRecord("100100109", 82.5f, 77.0f, 74.25f));
        
        return marks;
        
    }
}
public class CSCI2020Lab05 extends Application {
    
    @Override
    public void start(Stage primaryStage) { 
        DataSource start = new DataSource();
        TableView<StudentRecord> table = new TableView<>();
        ObservableList<StudentRecord> student = start.getAllMarks();
        
        
        TableColumn<StudentRecord,String> sIDCol = new TableColumn<>("Student ID");
        sIDCol.setCellValueFactory(new PropertyValueFactory("iD"));
        
        
        TableColumn<StudentRecord,String> assCol = new TableColumn<>("Assignment Marks");
        assCol.setCellValueFactory(new PropertyValueFactory("ass"));
        
        TableColumn<StudentRecord,String> midCol = new TableColumn<>("Midterm Marks");
        midCol.setCellValueFactory(new PropertyValueFactory("midterm"));
        
        TableColumn<StudentRecord,String> examCol = new TableColumn<>("Exam Marks");
        examCol.setCellValueFactory(new PropertyValueFactory("exam"));
        
        TableColumn<StudentRecord,String> letterCol = new TableColumn<>("Letter Grade");
        letterCol.setCellValueFactory(new PropertyValueFactory("letter"));
        
        table.getColumns().add(sIDCol);
        table.getColumns().add(assCol);
        table.getColumns().add(midCol);
        table.getColumns().add(examCol);
        table.getColumns().add(letterCol);
        
        VBox vbox = new VBox(table);

        Scene scene = new Scene(vbox);

        primaryStage.setScene(scene);

        primaryStage.show();
        table.setItems(student);
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
