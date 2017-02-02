
package BusinessLayer;

import BusinessLayer.BiblioManager.Reference;

public interface InterfaceBusinessFacade {
    
    //User related Functions
    void login(String username, String password);
    void logout();  
    void seeMacros();
    void seeLastDocuments(); 
    
    //Document Functions
    void openDocument(String filename);
    void createDocument(String referencesFilename);
    void saveDocumentAs(String filename);
    void saveDocument();
    void exportDocument(String filename);

    //References related Functions
    void associateReferenceFile(String referenceFilename);
    void addReferences(Reference reference);
    void editReferences(Reference reference);
    void deleteReferences(Reference reference);
    
    //Edit related Functions
    void insertText();
    void deleteText();
    void copyText();
    void pasteText();
    void doesUndo();
    void doesRedo();
    
    //macro related Functions
    void savesMacro(String macroName);
    void stopsMacro();
    void deletesMacro(String macroName);
    void runMacro(String macroName);
    
}
