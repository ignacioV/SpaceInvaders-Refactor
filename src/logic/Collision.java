
package logic;

import java.util.ArrayList;
import java.util.Iterator;
import priesai.Enemy;
import priesai.SimpleEnemy;
import spaceinvaders.Psuviai;

public class Collision {
    
    ArrayList<Psuviai> psuviai=null;
    ArrayList<Enemy> priesai=null;
    
    
    public void enemiesIrPsuviaiSusidurimas(ArrayList<Psuviai> psuviai, ArrayList<Enemy> simpleEnemys){
        this.psuviai = psuviai;
        this.priesai = simpleEnemys;
        for(Psuviai ps:psuviai){
            for(Enemy se:simpleEnemys){
                if(ps.getX() == se.getX()-1 && ps.getY() == se.getY()){
                    //System.out.println("collision: " + ps.getX() + ps.getY() + " enm "  + se.getX() + se.getY());
                    
                    if(se.getGyvybes()>1){
                        se.setGyvybes(se.getGyvybes()-1);
                    }
                    else {
                        se.setY(-1);
                        System.out.println("BOOM!");
                    }
                    
                    ps.setY(-1);
                    
                    
                }
            }
        }
        pasalinimas();
    }
    public void pasalinimas(){
        Iterator<Psuviai> itps = psuviai.iterator();
        while (itps.hasNext()) {
          Psuviai psuviai = itps.next();
          if (psuviai.getY()<0) {
            itps.remove();
          }
        }
        
        Iterator<Enemy> itse = priesai.iterator();
        while (itse.hasNext()) {
          Enemy simpleEnemys  = itse.next();
          if (simpleEnemys.getY()<0) {
            itse.remove();
          }
        }
        
        
    }
    public void checkGameEnd(int PlayerX, int aukstis){
        for(Enemy se:priesai){
            if(se.getX() == PlayerX && se.getY() == aukstis-1){
                System.err.println("Pralaimejai, Tave pasieke priesai...");
                System.exit(0);
            }
        }
    }
    public ArrayList<Psuviai> getPsuviai() {
        return psuviai;
    }

    public ArrayList<Enemy> getSimpleEnemys() {
        return priesai;
    }

}
