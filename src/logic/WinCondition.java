
package logic;

import priesai.SimpleEnemy;

public class WinCondition {
    
    public void checkWinCodition(int enemySkaicius, int suviuSkaicius){
         if(enemySkaicius==0){
             System.err.println("Pergale! Tu nugalejai visus priesus");
             System.exit(0);
         }
         if(suviuSkaicius==0){
             System.err.println("pralaimejai, Tau baigesi soviniai...");
             System.exit(0);
         }
    }
}
