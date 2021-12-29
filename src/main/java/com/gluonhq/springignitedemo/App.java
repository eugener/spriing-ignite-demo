package com.gluonhq.springignitedemo;

import com.gluonhq.ignite.spring.SpringContext;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.Collections;
public class App extends Application {

    @Autowired
    private FXMLLoader loader;

    private final SpringContext context = new SpringContext(this,
            () -> Collections.singletonList(App.class.getPackage().getName()));

    @Override
    public void start(Stage stage) throws IOException {
        context.init();
        Parent simpleView = loader.load(App.class.getResourceAsStream("simpleView.fxml"));
        stage.setTitle("Spring Ignite Example");
        stage.setScene(new Scene(simpleView));
        stage.show();
    }
}

