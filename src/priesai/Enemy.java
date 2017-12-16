
package priesai;

public class Enemy {
    
    int X;
    int Y;
    int aukstis;
    int plotis;
    static int Xprad=0;
    static int Yprad=1;
    int gyvybes;
    char atvaizdas;


    public Enemy(int aukstis, int plotis,int level) {
        this.aukstis = aukstis;
        this.plotis = plotis;
        this.X = Xprad;
        this.Y = Yprad+level;
        
        if (Xprad<plotis-1) {
            Xprad++;
        }else {
            Yprad++;
            Xprad=0;
        }
                
    }
    public void move(){
        
        if(getX()<plotis-1){
            setX(getX()+1);
            
        }else{
            setY(getY()+1);
            setX(0);
            
        }
        
    }
    public void setX(int X) {
        if(X <= plotis){
            this.X = X;
        }
        else{
            System.err.println("Klaida: Enemy setX");
        }
    }

    public void setY(int Y) {
        if(Y <= aukstis){
            this.Y = Y;
        }
        else{
            System.err.println("Klaida: Enemy setY");
        }
    }
    
  
    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    public int getGyvybes() {
        return gyvybes;
    }

    public void setGyvybes(int gyvybes) {
        this.gyvybes = gyvybes;
    }

    public char getAtvaizdas() {
        return atvaizdas;
    }

    

    


    
    
    
}
