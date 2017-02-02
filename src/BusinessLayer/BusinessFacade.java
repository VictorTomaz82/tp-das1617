
package BusinessLayer;

import BusinessLayer.BiblioManager.Reference;

public interface BusinessFacade {
    
    //User related Functions
    public void login(String username, String password);
    public void logout();  
    public void seeMacros();
    public void seeLastDocuments(); 
    
    //Document Functions
    public void openDocument(String filename);
    public void createDocument(String referencesFilename);
    public void saveDocumentAs(String filename);
    public void saveDocument();
    public void exportDocument(String filename);

    //References related Functions
    public void associateReferenceFile(String referenceFilename);
    public void addReferences(Reference reference);
    public void editReferences(Reference reference);
    public void deleteReferences(Reference reference);
    
    //Edit related Functions
    public void insertText();
    public void deleteText();
    public void copyText();
    public void pasteText();
    public void doesUndo();
    public void doesRedo();
    
    //macro related Functions
    public void savesMacro(String macroName);
    public void stopsMacro();
    public void deletesMacro(String macroName);
    public void runMacro(String macroName);
    
}
