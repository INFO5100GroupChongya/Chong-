package business;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;




public class TravelAgency {
    private static TravelAgency instance = new TravelAgency();
    //private ArrayList<Flight> flightList;
    private Map<Integer, Customer> customerMap;
    private Map<Integer, Airliner> airlinerMap;
    private Date updateTime;
    
    public TravelAgency(){
        this.airlinerMap = new HashMap<Integer, Airliner> ();
        this.customerMap = new HashMap<Integer, Customer> ();
       
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Flight flight1 = new Flight("Boston", "Beijing", dateFormat.parse("2020-10-12 12:00:00"), dateFormat.parse("2020-10-14 18:00:00"));
            Flight flight2 = new Flight("Shanghai", "Beijing", dateFormat.parse("2020-10-15 16:45:00"), dateFormat.parse("2020-10-16 19:00:00"));
            Flight flight3 = new Flight("Guangzhou", "London", dateFormat.parse("2020-10-18 12:00:00"), dateFormat.parse("2020-10-19 18:00:00"));
            Flight flight4 = new Flight("Osaka", "Beijing", dateFormat.parse("2020-10-17 16:10:00"), dateFormat.parse("2020-10-17 21:05:00"));
            Flight flight5 = new Flight("Newyork", "Canberra", dateFormat.parse("2020-10-18 12:00:00"), dateFormat.parse("2020-10-20 23:00:00"));
            Flight flight6 = new Flight("Newyork", "Canberra", dateFormat.parse("2020-10-21 12:00:00"), dateFormat.parse("2020-10-22 23:00:00"));
            Flight flight7 = new Flight("Newyork", "Canberra", dateFormat.parse("2020-10-18 12:00:00"), dateFormat.parse("2020-10-20 23:00:00"));
            Flight flight8 = new Flight("Newyork", "Canberra", dateFormat.parse("2020-10-21 12:00:00"), dateFormat.parse("2020-10-22 23:00:00"));
            Flight flight9 = new Flight("Newyork", "Canberra", dateFormat.parse("2020-10-18 12:00:00"), dateFormat.parse("2020-10-18 23:00:00"));
            Flight flight10 = new Flight("Newyork", "Canberra", dateFormat.parse("2020-10-19 12:00:00"), dateFormat.parse("2020-10-19 23:00:00"));
            Flight flight11 = new Flight("Newyork", "Canberra", dateFormat.parse("2020-10-20 12:00:00"), dateFormat.parse("2020-10-20 23:00:00"));
            Flight flight12 = new Flight("Newyork", "Canberra", dateFormat.parse("2020-10-21 12:00:00"), dateFormat.parse("2020-10-21 23:00:00"));
            
            Airliner airliner1 = new Airliner("China Southern Airlines");
            Airliner airliner2 = new Airliner("Spring Airlines");
            Airplane airplane1 = new Airplane("Airbus", "A318", 50);   
            Airplane airplane2 = new Airplane("Airbus", "A321", 55);   
            Airplane airplane3 = new Airplane("Boeing", "Boe747", 100); 
            Airplane airplane4 = new Airplane("Boeing", "Boe737", 60); 
            Airplane airplane5 = new Airplane("Dassault", "Dassault120", 120); 
                    
            airplane1.getFlightMap().put(flight1.getFlightID(), flight1);
            flight1.setSeatTotal(airplane1.getSeatCapacity());
            flight1.generateSeat();
            airplane1.getFlightMap().put(flight2.getFlightID(), flight2);
            flight2.setSeatTotal(airplane1.getSeatCapacity());
            flight2.generateSeat();
            airplane1.getFlightMap().put(flight3.getFlightID(), flight3);
            flight3.setSeatTotal(airplane1.getSeatCapacity());
            flight3.generateSeat();
            airplane2.getFlightMap().put(flight4.getFlightID(), flight4);
            flight4.setSeatTotal(airplane2.getSeatCapacity());
            flight4.generateSeat();
            airplane3.getFlightMap().put(flight5.getFlightID(), flight5);
            flight5.setSeatTotal(airplane3.getSeatCapacity());
            flight5.generateSeat();
            airplane3.getFlightMap().put(flight6.getFlightID(), flight6);
            flight6.setSeatTotal(airplane3.getSeatCapacity());
            flight6.generateSeat();
            airplane4.getFlightMap().put(flight7.getFlightID(), flight7);
            flight7.setSeatTotal(airplane4.getSeatCapacity());
            flight7.generateSeat();
            airplane4.getFlightMap().put(flight8.getFlightID(), flight8);
            flight8.setSeatTotal(airplane4.getSeatCapacity());
            flight8.generateSeat();
            airplane5.getFlightMap().put(flight9.getFlightID(), flight9);
            flight9.setSeatTotal(airplane5.getSeatCapacity());
            flight9.generateSeat();
            airplane5.getFlightMap().put(flight10.getFlightID(), flight10);
            flight10.setSeatTotal(airplane5.getSeatCapacity());
            flight10.generateSeat();
            airplane5.getFlightMap().put(flight11.getFlightID(), flight11);
            flight11.setSeatTotal(airplane5.getSeatCapacity());
            flight11.generateSeat();
            airplane5.getFlightMap().put(flight12.getFlightID(), flight12);
            flight12.setSeatTotal(airplane5.getSeatCapacity());
            flight12.generateSeat();
            
            airliner1.getAirlinerMap().put(airplane1.getPlaneID(), airplane1);
            airliner1.getAirlinerMap().put(airplane2.getPlaneID(), airplane2);
            airliner1.getAirlinerMap().put(airplane3.getPlaneID(), airplane3);
            airliner2.getAirlinerMap().put(airplane4.getPlaneID(), airplane4);
            airliner2.getAirlinerMap().put(airplane5.getPlaneID(), airplane5);
            
            this.airlinerMap.put(airliner1.getAirlinerID(), airliner1);
            this.airlinerMap.put(airliner2.getAirlinerID(), airliner2);
        } catch (ParseException ex) {
            System.out.println("init airliner failed");    
        }
        
        Customer customer1 = new Customer("440981199408060000", "Zhihan Zhao");
        Customer customer2 = new Customer("440981199678060000", "Jinning Yang");
        Customer customer3 = new Customer("440981199408062340", "Hanzhang Wang");
        Customer customer4 = new Customer("440981199408050540", "Hanzhang Wang");
        Customer customer5 = new Customer("440981199409060790", "Hanna Zhao");
        this.customerMap.put(customer1.getUserID(), customer1);
        this.customerMap.put(customer2.getUserID(), customer2);
        this.customerMap.put(customer3.getUserID(), customer3);
        this.customerMap.put(customer4.getUserID(), customer4);
        this.customerMap.put(customer5.getUserID(), customer5);
    }
    
    public static TravelAgency getTravelInstance(){
        return instance;
    }
    
    public Map<Integer, Customer> getCustomerMap() {
        return customerMap;
    }

    public void setCustomerMap(Map<Integer, Customer> customerMap) {
        this.customerMap = customerMap;
    }

    public Map<Integer, Airliner> getAirlinerMap() {
        return airlinerMap;
    }

    public void setAirlinerMap(Map<Integer, Airliner> airlinerMap) {
        this.airlinerMap = airlinerMap;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    
    public Airliner addAirliner(String name){
        Airliner airliner = new Airliner(name);
        this.airlinerMap.put(airliner.getAirlinerID(), airliner);
        return airliner;
    }
    
    
}
