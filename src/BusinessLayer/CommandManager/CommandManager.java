package BusinessLayer.CommandManager;

import BusinessLayer.Application.Text;
import java.util.ArrayList;

public class CommandManager {
    
    //model
    Text text;
    
    ArrayList<Command> redoList;
    ArrayList<Command> undoList;
    
    Macro currentMacro;
      
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
