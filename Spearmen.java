import java.util.*;
import java.io.*;

public class Spearmen extends Soldiers{
    public int numbers;
    HashSet<String> advantage;

    Spearmen(int num,String type){
        super(type,"Spearmen",num);
        numbers=num;
        advantage=new HashSet<String>(Arrays.asList("LightCavalry", "HeavyCavalry"));

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