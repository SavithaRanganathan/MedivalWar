import java.util.*;
import java.io.*;

public class CavalryArcher extends Soldiers{
    public int numbers;
    HashSet<String> advantage;
    CavalryArcher(int num,String type){
        super(type,"CavalryArcher",num);
        numbers=num;
        advantage=new HashSet<String>(Arrays.asList("Spearmen", "HeavyCavalry"));
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