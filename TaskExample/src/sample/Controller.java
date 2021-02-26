package sample;

import javafx.application.Platform;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.fxml.FXML;

import java.awt.*;
import java.lang.annotation.Target;
import javafx.scene.control.ListView;
import javafx.scene.control.ProgressBar;


public class Controller {
    private Task<ObservableList<String>> task;

    @FXML
    private ListView listView;
    @FXML
    private ProgressBar progressBar;
    public void initialize(){
        task = new Task<ObservableList<String>>() {
            @Override
            protected ObservableList<String> call() throws Exception {

                String[] names = {
                        "Daniel",
                        "Ramces",
                        "Tim",
                        "Bob",
                        "Doug"};

                ObservableList<String> employees = FXCollections.observableArrayList();

                for (int i=0; i<6; i++){
                    employees.add(names[i]);
                    updateProgress(i + 1, 6);
                    Thread.sleep(200);
                }
                return employees;
            }
        };
        progressBar.progressProperty().bind(task.progressProperty());
        listView.itemsProperty().bind(task.valueProperty());
    }

    @FXML
    public void buttonPressed(){
        new Thread(task).start();

    }
}
