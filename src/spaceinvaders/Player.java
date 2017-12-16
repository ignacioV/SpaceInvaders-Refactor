
package spaceinvaders;

public class Player {
    
    int X;
    
    int suviuKiek;
    char atvaizdas = 'H';

    public Player(int X, int suviuKiek) {
        this.X = X;
        
        this.suviuKiek = suviuKiek;
    }
    
    public int getX() {
        return X;
    }

    public char getAtvaizdas() {
        return atvaizdas;
    }

    public int getSuviuKiek() {
        return suviuKiek;
    }

    public void setX(int X) {
        this.X = X;
    }

    public void setSuviuKiek(int suviuKiek) {
        this.suviuKiek = suviuKiek;
    }
    
    
    
}
