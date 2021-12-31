package com.gluonhq.springignitedemo;

import com.gluonhq.ignite.spring.SpringContext;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.io.IOException;

@SpringBootApplication
@ComponentScan("com.gluonhq.ignite.spring")
public class SpringIgniteDemoApplication extends Application {

	public static void main(String[] args) {
		Application.launch(SpringIgniteDemoApplication.class, args);
	}

	@Autowired
	private FXMLLoader loader;

	private final SpringContext context = new SpringContext(this);

	@Override
	public void start(Stage stage) throws IOException {
		context.init( () -> SpringApplication.run(SpringIgniteDemoApplication.class));
		Parent simpleView = loader.load(SpringIgniteDemoApplication.class.getResourceAsStream("simpleView.fxml"));
		stage.setTitle("Spring Ignite Example");
		stage.setScene(new Scene(simpleView));
		stage.show();
	}

}




