// You want to plan n plants in your garden with a water cane. the plants are arranged in a row and 
// are labled from 0 to n-1 from left to right where the ith plant is located at x=i. there is river
// at x = -1 that you can refill your watering cane at.
// Each plant needs a specific amount of water.

public class PlantWater {
    public static int wateringPlants(int[] plants, int capacity){
        int totalSteps = 0;
        int currentWater = capacity;
        
        for (int i = 0; i < plants.length; i++) {
            if (currentWater >= plants[i]) {
                // Water the plant and move to the next one
                currentWater -= plants[i];
                totalSteps++; // One step to move to this plant
            } else {
                // Refill the can, return to the river and come back
                totalSteps += i * 2; // Going back to river and returning
                currentWater = capacity - plants[i]; // Refill and water the plant
                totalSteps++; // One step to move to this plant
            }
        }
        return totalSteps;
    }

    public static void main(String[] args) {
        int[] plants = {3, 4, 5, 4};
        int capacity = 5;
        System.out.println(wateringPlants(plants, capacity)); // Output should be 14
    }
}
