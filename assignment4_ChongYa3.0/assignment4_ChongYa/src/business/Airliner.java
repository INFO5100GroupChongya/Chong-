package business;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class Airliner {
    
    private int airlinerID;
    private String airlinerName;
    private Map<Integer, Airplane> airlinerMap;
    private Date updatetime;
    
    private static int idCounter = 1;
    
    public Airliner(String name){
        this.airlinerName = name;
        this.airlinerMap = new HashMap<Integer, Airplane>();
        this.airlinerID = idCounter++;
        this.updatetime = new Date();
    }

    public int getAirlinerID() {
        return airlinerID;
    }

    public void setAirlinerID(int airlinerID) {
        this.airlinerID = airlinerID;
    }

    public String getAirlinerName() {
        return airlinerName;
    }

    public void setAirlinerName(String airlinerName) {
        this.airlinerName = airlinerName;
    }
    

    public Map<Integer, Airplane> getAirlinerMap() {
        return airlinerMap;
    }

    public void setAirlinerMap(Map<Integer, Airplane> airlinerMap) {
        this.airlinerMap = airlinerMap;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
    
    public Airplane addAirplane(String company, String model, int seat){
        Airplane airplane = new Airplane(company, model, seat);
        this.airlinerMap.put(airplane.getPlaneID(), airplane);
        return airplane;
    }
    
    @Override
    public String toString(){
        return "Airliner " + this.airlinerID;
    }
}
