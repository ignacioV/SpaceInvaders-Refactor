
package priesai;

public class SimpleEnemy extends Enemy{

    public SimpleEnemy(int plotis, int aukstis,int level,int life){
        super(aukstis,plotis,level);
        this.gyvybes = life;
        this.atvaizdas = 'S';
        
    }
    
    
}
