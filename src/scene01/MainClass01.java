package scene01;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainClass01 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		System.out.println(getClass().getResource("testfx.fxml")); // 파일 경로
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("testfx.fxml")); //파일을 불러올 준비
		
		Parent root = loader.load(); //parent = 모든 팬의 부모
		
		Scene scene = new Scene(root);
		arg0.setScene(scene);
		
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
