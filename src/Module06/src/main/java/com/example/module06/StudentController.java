package com.example.module06;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class StudentController {
    @FXML
    private TableView<Student> studentTable;

    @FXML
    private TableColumn<Student, String> studentIdCol;

    @FXML
    private TableColumn<Student, String> nameCol;

    @FXML
    public void initialize() {
        studentIdCol.setCellValueFactory(new PropertyValueFactory<>("studentId"));
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));

        ObservableList<Student> studentList = FXCollections.observableArrayList(
                new Student(1, "Agus", "1231"),
                new Student(2, "Tyo", "1232"),
                new Student(3, "Budi", "1233"),
                new Student(4, "Upik", "1234"),
                new Student(5, "Iskandar", "1235"),
                new Student(6, "Haryanto", "1236"),
                new Student(7, "Joko", "1237"),
                new Student(8, "Tukil", "1238"),
                new Student(9, "Madar", "1239"),
                new Student(10, "Samsul", "1230")
        );
        studentTable.setItems(studentList);
    }
}
