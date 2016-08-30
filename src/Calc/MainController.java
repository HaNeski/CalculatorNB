
package Calc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class MainController {
    public InputObj cal = new InputObj();
    
    @FXML
    public Label result;
    public long a=0;
   // public long b;
    private String c = "";
    public boolean start = true;
    
    @FXML
    public void gNumbers (ActionEvent event){
        if(start){
            result.setText("");
            start = false;      
        }
        String disp;
        disp = ((Button)event.getSource()).getText();
        result.setText(result.getText()+ disp);
        
    }
    
    @FXML
    public void gOperator(ActionEvent event){
        String disp;
        disp = ((Button)event.getSource()).getText();
        
        if (!disp.equals("=")){
            if(!c.isEmpty()){
                return;
            }
            
            c = disp;
            a= Long.parseLong(result.getText());
            result.setText("");
            
        }else{
            if (c.isEmpty()){
                return;
            }
            long b = Long.parseLong(result.getText());
            float answer = cal.lump(a, b, c);
            result.setText(String.valueOf(answer));
            c = "";
            start = true;     
            
        }
    }
    
}
