import java.util.*;
import java.io.*;

public class HeavyCavalry extends Soldiers{
    public int numbers;
    HashSet<String> advantage;
    HeavyCavalry(int num,String type){
        super(type,"HeavyCavalry",num);
        numbers=num;
        advantage=new HashSet<String>(Arrays.asList("Militia", "FootArcher", "LightCavalry"));
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