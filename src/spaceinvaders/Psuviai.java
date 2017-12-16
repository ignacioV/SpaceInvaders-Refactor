
package spaceinvaders;

public class Psuviai {
    int X;
    int Y;
    char atvaizdas = '^';

    public Psuviai(int X, int Y) {
        this.X = X;
        this.Y = Y;
    }
    public void move(){
        if(getY()>0)
        setY(getY()-1);
    }
    public int getX() {
        return X;
    }

    public void setX(int X) {
        this.X = X;
    }

    public int getY() {
        return Y;
    }

    public void setY(int Y) {
        this.Y = Y;
    }

    public char getAtvaizdas() {
        return atvaizdas;
    }

   
    
    
}
