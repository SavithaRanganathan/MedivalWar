import java.util.*;
import java.io.*;

public class Militia extends Soldiers{
    public int numbers;
    HashSet<String> advantage;

    Militia(int num,String type){
        super(type,"Militia",num);
        numbers=num;
        advantage=new HashSet<String>(Arrays.asList("Spearmen", "LightCavalry"));
    }

    public void setAdvantage(String platoon){
        advantage.add(platoon);
    }


    public HashSet<String> getAdvantage(){
        return advantage;
    }

    public boolean isAdvantage(String platoon){
        return this.advantage.contains(platoon);
    }
}