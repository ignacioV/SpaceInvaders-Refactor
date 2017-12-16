
package priesai;

public class BossEnamy extends Enemy{
    public BossEnamy(int plotis, int aukstis,int life){
        super(aukstis,plotis,0);
        this.gyvybes = life;
        this.atvaizdas = 'B';
        this.X = 0;
        this.Y = 0;
        
    }
}
