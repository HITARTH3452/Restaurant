package com.geekster.Restaurant.repository;

import com.geekster.Restaurant.model.restaurant;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class restaurantRepo {
    private List<restaurant> restrolist;

    public restaurantRepo(){
        restrolist = new ArrayList<>();
    }

    public List<restaurant> getRestrolist(){
        return restrolist;
    }

    public List<restaurant> getRestroFromDatasources() {
        return restrolist;
    }

    public boolean save(restaurant restro) {
        restrolist.add(restro);
        return true;
    }

    public boolean remove(restaurant restro){
        restrolist.remove(restro);
        return true;
    }

    public boolean update(String id, String speciality) {
        for(restaurant restro : restrolist){
            if(restro.getId().equals(id)){
                remove(restro);

                restro.setRestroSpeciality(speciality);

                save(restro);

                return true;
            }
            else{
                return false;
            }
        }
        return false;
    }
}
