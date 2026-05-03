package com.zomato.manager;
import java.util.*;

import com.zomato.model.Restaurant;

public class ResturantManager {
	//applied singleton design pattern
	List<Restaurant>resturantList=new ArrayList<Restaurant>();
	private static ResturantManager resturantInstances;
	
	private ResturantManager() {
		
	}
	 public static ResturantManager getInstance() {
	        if (resturantInstances == null) {
	            resturantInstances  = new ResturantManager();
	        }
	        return resturantInstances;
	    }

	    public void addRestaurant(Restaurant r) {
	        resturantList.add(r);
	    }

	    public List<Restaurant> searchByLocation(String loc) {
	        List<Restaurant> result = new ArrayList<>();
	        loc = loc.toLowerCase();
	        for (Restaurant r : resturantList) {
	            String rl = r.getLocation().toLowerCase();
	            if (rl.equals(loc)) {
	                result.add(r);
	            }
	        }
	        return result;
	    }

}
