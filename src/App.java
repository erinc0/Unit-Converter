import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class App extends Application { 
  private Label meowLabel;
  private Label miauLabel;
  public int x;
  public int y;
  public String miau;
  private TextField meowfield;
  private TextField miauField;
  private Button meowButton;
  @Override
    public void start (Stage primaryStage){

      Scene meowscene = null;
      GridPane gridmeow= null;
      gridmeow = new GridPane();
      meowscene = new Scene(gridmeow);
      meowLabel= new Label("km:");
      miauLabel = new Label("= yards");
      meowfield = new TextField();
      meowfield.setEditable(true);
      meowfield.setText("enter a value!");
      miauField = new TextField();
      miauField.setEditable(true);
      miauField.setText("0");

      meowButton = new Button("convert");
      gridmeow.setPadding(new Insets (50, 50, 50, 50));
      gridmeow.setHgap(5);
      gridmeow.add(meowLabel, 0 , 0);
      gridmeow.add(meowfield, 3 , 0);
      gridmeow.add(miauField, 3, 2);
      gridmeow.add(miauLabel, 0, 2);
      gridmeow.add(meowButton, 0 , 5);

      meowButton.setOnAction(new EventHandler<ActionEvent>() {
        
        @Override
        public void handle(ActionEvent meowEvent){
           int x;
           int y;
          miau = meowfield.getText();
          x = Integer.parseInt(miau);
          y = (int) (1093.61 * x);
          miauField.setText(Integer.toString(y));
        }
      }
      );
      primaryStage.setScene(meowscene);
      primaryStage.setTitle("Conversion Calculator");
      primaryStage.show();
    }
    
    public static void main(String[] args) throws Exception {
     launch(args);
}
}
