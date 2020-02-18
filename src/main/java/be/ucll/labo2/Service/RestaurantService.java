package be.ucll.labo2.Service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RestaurantService implements RestoInterface {
    List<Restaurant> restaurants;

    public RestaurantService() {
        restaurants = new ArrayList<>();
        restaurants.add(new Restaurant("Alma 1", "Tiensestraat 115 - 3000 Leuven", "3.9"));
        restaurants.add(new Restaurant("Alma 2", "E. Van Evenstraat 2 - 3000 Leuven", "4.5"));
        restaurants.add(new Restaurant("Alma 3", "Steengroevenlaan 3 - 3001 Heverlee", "4.1"));
    }

    @Override
    public List<Restaurant> getRestaurantjes() {
        return restaurants;
    }
}
