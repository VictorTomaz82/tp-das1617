package CommandManager;

import Application.Text;
import java.util.ArrayList;

public class CommandManager {
    
    //model
    Text text;
    
    ArrayList<Command> redoList;
    ArrayList<Command> undoList;
      
    void apply(Command command){
        
    }
    
    void undo(){
        
    }
    
    void redo(){
        
    }
    
    public Macro rec(){
        
        return new Macro();
    }
    
    void play(Macro macro){
        
    }
}
