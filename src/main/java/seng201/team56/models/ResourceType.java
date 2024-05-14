package seng201.team56.models;

import java.util.List;
import java.util.Random;

/**
 * ResourceType options (to be used for carts and towers)
 * @author Sean Reitsma
 */
public enum ResourceType {
    /**
     * Bacon, Cheddar, and Onion Quiché
     * @recipe <a href=https://www.foodandwine.com/recipes/bacon-cheddar-and-onion-quiche>bacon-cheddar-and-onion-quiche</a>
     */
    BCO_QUICHE ("Bacon, Cheddar, and Onion Quiché"),
    /**
     * Bouillabaisse
     * @recipe <a href=https://www.foodandwine.com/bouillabaisse-ludo-lefebvre>bouillabaisse-ludo-lefebvre</a>
     */
    BOUILLABAISSE ("Bouillabaisse"),
    /**
     * Gruyère Cheese Soufflé
     * @recipe <a href=https://www.foodandwine.com/recipes/gruyere-cheese-souffle>gruyere-cheese-souffle</a>
     */
    GRUYER_CHEESE_SOUFFLE ("Gruyère Cheese Soufflé"),
    /**
     * Crème Brûlée<br>
     * Mmm...
     * @recipe <a href=https://www.foodandwine.com/recipes/creme-brulee>creme-brulee</a>
     */
    CREME_BRULEE ("Crème Brûlée"),
    /**
     * Hot Niçoise Salad
     * @recipe <a href=https://www.foodandwine.com/recipes/hot-nicoise-salad>hot-nicoise-salad</a>
     */
    NICOISE_SALAD ("Hot Niçoise Salad"),
    /**
     * Coq au Vin
     * @recipe <a href=https://www.foodandwine.com/recipes/coq-au-vin>coq-au-vin</a>
     */
    COQ_A_VIN ("Coq au Vin"),
    /**
     * Ratatouille
     */
    RATATOUILLE ("Ratatouille");

    private final String name;
    private static final List<ResourceType> VALUES = List.of(values());
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();
    ResourceType(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
    public static ResourceType randomResourceType() {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}
