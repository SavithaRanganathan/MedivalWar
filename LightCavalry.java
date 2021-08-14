import java.util.*;
import java.io.*;

public class LightCavalry extends Soldiers{
    public int numbers;
    HashSet<String> advantage;

    LightCavalry(int num,String type){
        super(type,"LightCavalry",num);
        numbers=num;
        advantage=new HashSet<String>(Arrays.asList("FootArcher", "CavalryArcher"));


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