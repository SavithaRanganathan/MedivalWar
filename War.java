import java.util.*;
import java.io.*;
     

class War{
static int i=0;
public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   String army=sc.next();
   String opponent=sc.next();
   Soldiers[][] soldiers=new Soldiers[5][5];
   setSoldiers("army",army,soldiers);
   setSoldiers("opponents",opponent,soldiers);
   System.out.println(printWinningStrategy(soldiers));
}

public static void setSoldiers(String type,String army,Soldiers[][] soldiers){
    String[] split=army.split(";");
    int i= type == "army" ? 0 : 1;
    int j=0;
    for(String s : split){
        String[] platoon=s.split("#");
         Soldiers obj=null;
        switch (platoon[0]) {
            case "Militia":
                obj=new Militia(Integer.parseInt(platoon[1]),type);
                soldiers[i][j]=obj;
                break;
            case "Spearmen":
                obj=new Spearmen(Integer.parseInt(platoon[1]),type);
                soldiers[i][j]=obj;
                break;
            case "LightCavalry":
                obj=new LightCavalry(Integer.parseInt(platoon[1]),type);
                soldiers[i][j]=obj;
                break;
            case "HeavyCavalry":
                obj=new HeavyCavalry(Integer.parseInt(platoon[1]),type);
                soldiers[i][j]=obj;
                break;
            case "CavalryArcher":
                obj=new CavalryArcher(Integer.parseInt(platoon[1]),type);
                soldiers[i][j]=obj;
                break;
            case "FootArcher":
                obj=new FootArcher(Integer.parseInt(platoon[1]),type);
                soldiers[i][j]=obj;
                break;
            default:
                break;
        }
        j++;
    }
}

public static String printWinningStrategy(Soldiers[][] soldiers){
    HashSet<String> win=new HashSet<String>();
    int win_count=0;
    int i=0;
        for(int j=0;j<soldiers[i].length;j++){
            for(int k=0;k<soldiers[i].length;k++){
                if(soldiers[i][j].isAdvantage(soldiers[1][k].name) && soldiers[i][j].numbers > soldiers[1][k].numbers){
                    HashSet<Soldiers> defeated=new HashSet<Soldiers>();
                    win.add(soldiers[i][j].name+"#"+soldiers[i][j].numbers);
                    win_count++;
                    int winner=j+1;
                    defeated.add(soldiers[1][k]);
                    while(winner<soldiers.length){
                        for(int m=0;m<soldiers.length;m++){
                        
                            if(soldiers[i][winner].isAdvantage(soldiers[1][m].name) && soldiers[i][winner].numbers > soldiers[1][m].numbers
                            && !defeated.contains(soldiers[1][m])){
                                win.add(soldiers[i][winner].name+"#"+soldiers[i][winner].numbers);
                                win_count++;
                                defeated.add(soldiers[1][m]);
                            }
                            else{
                                win.add(soldiers[i][winner].name+"#"+soldiers[i][winner].numbers);
                            }
                            if(win_count>=3){
                                for(int z=0;z<soldiers.length;z++)win.add(soldiers[0][z].name+"#"+soldiers[0][z].numbers);
                                return win.toString().replaceAll("[\\[\\]]", "");
                            }

                        }
                        winner++;
                    }
                
                }
            }
              win_count=0;
        }
    return "There is no chance of winning";
}

}