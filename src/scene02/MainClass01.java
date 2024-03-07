package scene02;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainClass01 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		FXMLLoader load = new FXMLLoader(getClass().getResource("test01.fxml"));
		Parent root = load.load();
		Scene sc = new Scene(root);
		arg0.setScene(sc);
		arg0.setTitle("Quiz3");
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
