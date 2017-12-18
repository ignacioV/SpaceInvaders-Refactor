
package spaceinvaders;

import java.util.ArrayList;

public class InputTranslator {
    char inputas;
    

    public void setInputas(char inputas) {
        this.inputas = inputas;
    }
    public void moveP(Player Player,Mapas map,ArrayList PlayerSuviai){
        
        
        switch(this.inputas){
            
            case 'a':
                if(Player.getX()>0){
                    Player.setX(Player.getX()-1);
                }
            break;
            case 'd':
                if(Player.getX()<map.getPlotis()-1){
                    Player.setX(Player.getX()+1);
                }
                
            break;
            case 'w':
                PlayerSuviai.add(new Psuviai(  Player.getX() , map.getAukstis()-1)  );
                Player.setSuviuKiek(Player.getSuviuKiek()-1);
                map.placeSuviai(PlayerSuviai);
            break;
            case 'x':
                System.out.println("Tu susisprogdinai!");
                System.out.println("Sunaikinai visus priesus, bet pats suspogai...");
                System.exit(0);
                
            break;
            default:
                    
                
        }
    }
    
    
    
}
