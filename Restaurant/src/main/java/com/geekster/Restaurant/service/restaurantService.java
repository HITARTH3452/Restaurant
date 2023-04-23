package com.geekster.Restaurant.service;

import com.geekster.Restaurant.model.restaurant;
import com.geekster.Restaurant.repository.restaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class restaurantService {

    List<restaurant> restrolist;

    @Autowired
    restaurantRepo restaurantrepo;

    public List<restaurant> getAllRestro(){
        return restaurantrepo.getRestroFromDatasources();
    }

    public List<restaurant>  getRestroBasedOnId(String id) {
        List<restaurant> restroListRightNow =  restaurantrepo.getRestroFromDatasources();

        List<restaurant> restroListStatusBased = new ArrayList<>();

        for(restaurant restro : restroListRightNow)
        {
            if(restro.isRestroId().equals(id))
            {
                restroListStatusBased.add(restro);
            }
        }
        return restroListStatusBased;
    }

    public String updateSpecialityById(String id, String speciality) {
        boolean updateSpeciality = restaurantrepo.update(id, speciality);

        if(updateSpeciality){
            return "restro with id: " + id + " was updated";
        }else{
            return "restro with id: " + id + "was not updated!!!";
        }
    }

    public String removeRestaurantById(String id){
        boolean deleteResponse=false;
        String status;
        if(id!=null) {
            List<restaurant> restaurantListRightNow = restaurantrepo.getRestroFromDatasources();

            for (restaurant restaurant : restaurantListRightNow) {
                if (restaurant.getId().equals(id)) {
                    deleteResponse = restaurantrepo.remove(restaurant);
                    if (deleteResponse) {
                        status = "restaurant wit id " + id + " was deleted";
                    } else {
                        status = "restaurant wit id " + id + " was not deleted";
                    }
                    return status;

                }


            }
            return "restaurant with id " + id + " does not exist";
        }
        else{
            return "id cant not accept null id";
        }
    }

    public String addmyRestro(restaurant restro){
        boolean insertionstatus = restaurantrepo.save(restro);
        if (insertionstatus) {
            return "restro added successfully!!!!";
        } else {
            return "Failed!!!.....restro Not Possible";
        }
    }
}

