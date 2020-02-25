package business;

import java.util.Date;
import java.util.Map;
import java.util.HashMap;


public class Customer {
    private int userID;
    private String ID;
    private String userName;
    private Map<Integer, Ticket> ticketMap;
    private Date lasteUpdateTime;
    
    private static int idCounter = 1;
    
    public Customer(String ID, String userName){
        this.ticketMap = new HashMap<Integer, Ticket>();
        this.ID = ID;
        this.userName = userName;
        this.userID = idCounter++;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Map<Integer, Ticket> getTicketMap() {
        return ticketMap;
    }

    public void setTicketMap(Map<Integer, Ticket> ticketMap) {
        this.ticketMap = ticketMap;
    }

    public Date getLasteUpdateTime() {
        return lasteUpdateTime;
    }

    public void setLasteUpdateTime(Date lasteUpdateTime) {
        this.lasteUpdateTime = lasteUpdateTime;
    }

    @Override
    public String toString(){
        return this.userID + "-" + this.userName;
    }
}
