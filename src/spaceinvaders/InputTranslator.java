
package spaceinvaders;

import java.util.ArrayList;

public class InputTranslator {
    char inputas;
    Player p = null;
    Mapas m = null;
    Psuviai ps =null;

    public void setInputas(char inputas) {
        this.inputas = inputas;
    }
    public void moveP(Player p,Mapas m,ArrayList ps){
        this.p=p;
        this.m=m;
        
        switch(this.inputas){
            
            case 'a':
                if(p.getX()>0){
                    p.setX(p.getX()-1);
                }
            break;
            case 'd':
                if(p.getX()<m.getPlotis()-1){
                    p.setX(p.getX()+1);
                }
                
            break;
            case 'w':
                ps.add(new Psuviai(  p.getX() , m.getAukstis()-1)  );
                p.setSuviuKiek(p.getSuviuKiek()-1);
                m.placeSuviai(ps);
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
