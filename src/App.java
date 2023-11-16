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
  private TextField woofField;
  private Label woofLabel;
  public String z;
  public String l;
  @Override
    public void start (Stage primaryStage){

      Scene meowscene = null;
      GridPane gridmeow= null;
      gridmeow = new GridPane();
      meowscene = new Scene(gridmeow);
      meowLabel= new Label("value:");
      miauLabel = new Label("converted value");
      meowfield = new TextField();
      meowfield.setEditable(true);
      meowfield.setText("enter a value!");
      miauField = new TextField();
      miauField.setEditable(true);
      miauField.setText("0");

      woofLabel = new Label("units");
      woofField = new TextField();
      woofField.setEditable(true);
      woofField.setText("enter units");

      meowButton = new Button("convert");
      gridmeow.setPadding(new Insets (50, 50, 50, 50));
      gridmeow.setHgap(5);
      gridmeow.add(meowLabel, 0 , 1);
      gridmeow.add(meowfield, 3 , 1);
      gridmeow.add(miauField, 3, 2);
      gridmeow.add(miauLabel, 0, 2);
      gridmeow.add(meowButton, 0 , 5);
      gridmeow.add(woofField, 3, 0);
      gridmeow.add(woofLabel, 0, 0);

      meowButton.setOnAction(new EventHandler<ActionEvent>() {
        
        @Override
        public void handle(ActionEvent meowEvent){
           int x;
           int y;
           String z;
           String l;
           y=0;
       
try{

   miau = meowfield.getText();
          z = woofField.getText();
          x = Integer.parseInt(miau);

        switch(z){
          case "kWh = J":
          y = 3600000*x;
          break; 

          case "km = yards":
          y = (int) (1093.61 * x);
          break;

          case "bar = Pascal":
          y= 100000 * x;
          break;

          case "degrees = Radians":
          y= (int) (.0174533 * x);
          break;

          default:
          l = "enter a proper conversion";
          woofField.setText(l);
          break;

        } 
        miauField.setText(Integer.toString(y));
        
          } 
    catch(NumberFormatException e){
        l= "enter a numeric value";
        meowfield.setText(l);
      }
    }
      });
      primaryStage.setScene(meowscene);
      primaryStage.setTitle("Conversion Calculator");
      primaryStage.show();}
    
    
    public static void main(String[] args) throws Exception {
     launch(args);
}
}
