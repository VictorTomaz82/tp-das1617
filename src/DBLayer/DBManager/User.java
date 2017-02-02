package DBLayer.DBManager;

import BusinessLayer.CommandManager.Macro;
import java.util.ArrayList;

public class User {
    
    String username;
    String password;
    
    //ToDO: Params params;
    ArrayList<String> createdDocs;
    ArrayList<Macro> createdMacros;
    
    // --- Methods ---
    public User(String username, String password){
        this.username=username;
        this.password=password;     
    }
}
