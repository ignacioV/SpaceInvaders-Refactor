
package spaceinvaders;

import java.util.Scanner;

public class SpaceInvaders {

    public static void main(String[] args) {
        
        char mapas[][]={{' ', ' ' ,' ' ,' ' ,' ' ,' ' ,' ' ,' ' ,' ', ' ', ' '},
                        {' ', ' ' ,' ' ,' ' ,' ' ,' ' ,' ' ,' ' ,' ', ' ', ' '},
                        {' ', ' ' ,' ' ,' ' ,' ' ,' ' ,' ' ,' ' ,' ', ' ', ' '},
                        {' ', ' ' ,' ' ,' ' ,' ' ,' ' ,' ' ,' ' ,' ', ' ', ' '},
                        {' ', ' ' ,' ' ,' ' ,' ' ,' ' ,' ' ,' ' ,' ', ' ', ' '},
                        {' ', ' ' ,' ' ,' ' ,' ' ,' ' ,' ' ,' ' ,' ', ' ', ' '},
                        {' ', ' ' ,' ' ,' ' ,' ' ,' ' ,' ' ,' ' ,' ', ' ', ' '},
                        {' ', ' ' ,' ' ,' ' ,' ' ,' ' ,' ' ,' ' ,' ', ' ', ' '},
                        {' ', ' ' ,' ' ,' ' ,' ' ,' ' ,' ' ,' ' ,' ', ' ', ' '},
                        {' ', ' ' ,' ' ,' ' ,' ' ,' ' ,' ' ,' ' ,' ', ' ', ' '},
                        {' ', ' ' ,' ' ,' ' ,' ' ,' ' ,' ' ,' ' ,' ', ' ', ' '}};  //11x11
         
        int enemys[][]={{1,1},
                        {5,2},
                        {5,3},
                        {5,4},
                        {5,5},
                        {5,6},
                        {1,7}};
         
        int player=4;
        int inputas;
        int kieksv=0;
        int suviai[][]=new int[10][2];
        for(int[] sv:suviai){           //del bugo
            sv[0]=-1;
        }
        
        
        Scanner reader = new Scanner(System.in); 
        
        while(true){
            
            placeObjects(enemys,mapas,player,suviai);

            ln();

            System.out.println("liko soviniu: "+(10-kieksv));
            for(int i=0;i<mapas.length;i++){
                System.out.print("|");
                for(int j=0;j<mapas[0].length;j++){
                    System.out.print(mapas[i][j]+" ");
                            
                }
                System.out.println("|");
            }
            if(gameOver( mapas, player,kieksv)){
                break;
            }
            if(gameWin(mapas, player)){
                System.err.println("nugalejai visus priesus ir laimejai");
                break;
            }
            
            inputas = reader.nextInt(); 
            
            if(inputas==1 && player>0)player--;
            else if(inputas==3 && player<mapas[0].length-1)player++;
            else if(inputas==2) kieksv=playerShoot(player,suviai,kieksv);
            else if(inputas==4) break;
            
            moveObjects(enemys, mapas, suviai);
            collision(enemys, suviai);
   
        }
        
    }
    static void placeObjects(int [][] enemies,char [][] mapas,int player,int[][] suviai){
        
        for(int i=0;i<mapas.length;i++){
            for(int j=0;j<mapas[0].length;j++){
                    mapas[i][j]=' ';
            }
        }
        //baze
        mapas[mapas[0].length-2][0]='B';
        //player
        mapas[mapas[0].length-1][player]='H';

        //enemys
        for(int[] en:enemies){
            if(en[0]!=-1)
                mapas[en[0]][en[1]]='W';
        }
        //sooviai
        for(int[] sv:suviai){
            if(sv[0]!=-1){
                mapas[sv[0]][sv[1]]='A';
                
            }
        }
    }
    static void moveObjects(int [][] enemies,char [][] mapas,int [][] suviai){
        for(int[] en:enemies){
            if(en[0]!=-1){
                if(en[1]==mapas.length-1){
                    en[1]=0;
                    en[0]++;
                    
                }else{
                    en[1]++;
                }
            }
        }
        for(int[] sv:suviai){
            if(sv[0]!=-1){
                sv[0]--;
      
            }
        }
    }
    static boolean gameOver(char [][] mapas,int player,int kieksv){
       
        if(mapas[mapas.length-3][0]=='W'){
            
            System.err.println("Priesai pasieke baze...");
            return true;
        }
        if(kieksv==10){
            
            System.err.println("Baigesi soviniai, tai pralaimejai");
            return true;
        }
      return false;
    }
    static boolean gameWin(char[][] mapas, int player) {
       
        int kiekx=0;
        for(int i=0;i<mapas.length;i++){
            for(int j=0;j<mapas[0].length;j++){
                if(mapas[i][j]=='W'){kiekx++;}
            }
        } 
        return kiekx==0;
    }
    static int playerShoot(int player,int[][] suviai,int kieksv){
        suviai[kieksv][1]=player;
        suviai[kieksv][0]=10;
        return ++kieksv;
        
    }
    static void collision(int[][] enemies,int[][] suviai){
        for(int[] en:enemies){
            for(int[] sv:suviai){
                if(en[0]==sv[0]-1&&en[1]==sv[1]){
                   
                    en[0]=-1;
                    
                    sv[0]=-1;
                }
                
            }
        }
    }
    static void ln(){
        for (int i = 0; i < 50; ++i) System.out.println();
            
    }
}
