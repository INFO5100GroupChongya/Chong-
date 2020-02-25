/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author lgfx0
 */
public class Overlap {
    	private ArrayList<Date> o_departure;
        private ArrayList<Date> o_arrival;
        private ArrayList<String> o_name;
        
    public Overlap(){
        this.o_departure = new ArrayList<>();
        this.o_arrival = new ArrayList<>();
        this.o_name = new ArrayList<>();
    }
        
    public void addToD(Date d1) {
	o_departure.add(d1);	
    }
    
    public void rmToD(Date d3) {
        o_departure.remove(d3);
    }
    
    public void addToA(Date d2) {
	o_arrival.add(d2);	
    }
    
    public void rmToA(Date d4) {
        o_arrival.remove(d4);
    }
    
    public void addToN(String name) {
	o_name.add(name);	
    }
    
    public void rmToN(String nameE) {
        o_name.remove(nameE);
    }

    public ArrayList<Date> getO_departure() {
        return o_departure;
    }

    public void setO_departure(ArrayList<Date> o_departure) {
        this.o_departure = o_departure;
    }

    public ArrayList<Date> getO_arrival() {
        return o_arrival;
    }

    public void setO_arrival(ArrayList<Date> o_arrival) {
        this.o_arrival = o_arrival;
    }

    public ArrayList<String> getO_name() {
        return o_name;
    }

    public void setO_name(ArrayList<String> o_name) {
        this.o_name = o_name;
    }
        
}
