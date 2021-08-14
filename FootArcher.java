import java.util.*;
import java.io.*;

public class FootArcher extends Soldiers{
    public int numbers;
    HashSet<String> advantage;
    FootArcher(int num,String type){
        super(type,"FootArcher",num);
        numbers=num;
        advantage=new HashSet<String>(Arrays.asList("Militia", "CavalryArcher"));
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