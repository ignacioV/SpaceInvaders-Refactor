
package spaceinvaders;

import priesai.Enemy;
import java.util.ArrayList;

public class Mapas {
    final int aukstis;
    final int plotis;
    char tuscia = ' ';
    char siena = '|';
    char mapas[][];
    ArrayList<Enemy> enemies = null;
    ArrayList<Psuviai> psuviai= null;
    public Mapas(int aukstis, int plotis) {
        this.aukstis = aukstis;
        this.plotis = plotis;
        this.mapas = new char[aukstis][plotis];
        
        initMap();
    }
    public void initMap(){
        for (int i = 0; i < getAukstis(); i++) {
            for (int j = 0; j < getPlotis(); j++) {
                
                mapas[i][j]=tuscia;
            }
        }
    }
   
    
    public void drawMap(){
        
        for (int i = 0; i < getAukstis(); i++) {
            System.out.print(siena);
            for (int j = 0; j < getPlotis(); j++) {
  
                System.out.print(mapas[i][j]);
                
            }
            System.out.println(siena);
        }
    }
    public void placeEnemies(ArrayList enemies){
        this.enemies=enemies;

        initMap();
        for(Enemy e:this.enemies){
            //System.out.println(e.getX() + " " + e.getY());
            mapas[e.getY()][e.getX()]=e.getAtvaizdas();
        }
    }
    public void placePlayer(Player player){
        mapas[aukstis-1][player.getX()] = player.getAtvaizdas();
        
    }
    public void placeSuviai(ArrayList suviai){
        this.psuviai=suviai;
        for(Psuviai suvis:psuviai){
            if(suvis.getY()>0){
                mapas[suvis.getY()][suvis.getX()]=suvis.getAtvaizdas();
            System.out.println(suvis.getY()+" "+suvis.getX());
            }
            else{
                mapas[suvis.getY()][suvis.getX()]=tuscia;
            //System.out.println(p.getY()+" "+p.getX());
            }
        }
    }
    public int getAukstis(){
        return aukstis;
    }

    public int getPlotis() {
        return plotis;
    }

    
}
