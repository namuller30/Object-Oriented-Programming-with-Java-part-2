/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mooc.logic;

/**
 *
 * @author ninja
 */
import mooc.ui.UserInterface;

public class ApplicationLogic {
    private UserInterface UI;
    public ApplicationLogic(UserInterface UI){
        this.UI=UI;
    }
    
    public void execute(int howManyTimes){
        for (int i=0;i<howManyTimes;i++){
            System.out.println("The application logic works");
            UI.update();
        }
    }
}
