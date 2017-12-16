
package spaceinvaders;

import priesai.Enemy;
import java.util.ArrayList;
import java.util.Scanner;
import logic.Collision;
import logic.WinCondition;
import priesai.BossEnamy;
import priesai.SimpleEnemy;

public class Main {
    public static void main(String[] args) {
        int aukstis =5;
        int plotis = 5;
        
        int paprastuEnemiesSkaicius =2;
        int paprastuEnemiesLygis=0;
        int paprastuEnemiesGyvybes=1;
        
        boolean yraBosas = true;
        int bosoGyvybes = 2;
        
        int kiekSuviu = 60;
        
        Mapas mapas = new Mapas(aukstis, plotis);
        
        ArrayList <Enemy> enemies = new ArrayList<>();
        pridetiEnemies(paprastuEnemiesSkaicius, enemies, plotis,
                aukstis,paprastuEnemiesLygis,paprastuEnemiesGyvybes,bosoGyvybes,yraBosas);
        
        Collision collision = new Collision();
        WinCondition winC = new WinCondition();
        
        Player player = new Player(plotis/2,kiekSuviu);
        ArrayList<Psuviai> psuviai = new ArrayList<>();
        
        InputTranslator input = new InputTranslator();
        Scanner reader = new Scanner(System.in);
        
        for (;;) {
            
            mapas.placeEnemies(enemies);
            mapas.placePlayer(player);
            mapas.placeSuviai(psuviai);
            
            mapas.drawMap();
            
            input.setInputas(reader.next().charAt(0));
            input.moveP(player,mapas,psuviai);
            for(Enemy e:enemies){
                e.move();
            }
            for(Psuviai p:psuviai){
                p.move();
            }
            cls();
            
            collision.enemiesIrPsuviaiSusidurimas(psuviai, enemies);
            
            enemies = collision.getSimpleEnemys();
            psuviai = collision.getPsuviai();
            
            collision.checkGameEnd(player.getX(),aukstis);
            
            winC.checkWinCodition(enemies.size(),player.getSuviuKiek());
            System.out.println("soviniai " + player.getSuviuKiek() + " priesai: " + enemies.size());
        }
        
        
    }
    public static void pridetiEnemies(int kiekEN,ArrayList enm, int plotis, int aukstis,int level, int life,int bosoLife,boolean yrabosas){
        for (int i = 0; i < kiekEN; i++) {
            enm.add(new SimpleEnemy(plotis,aukstis,level,life));
        }
        if(yrabosas){
            enm.add(new BossEnamy(plotis, aukstis, bosoLife));
        }
        
    }
    
    public static void cls(){
        for (int i = 0; i < 10; i++) {
            System.out.println("");
            
        }
    }
    
}
