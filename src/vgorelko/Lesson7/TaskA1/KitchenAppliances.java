package vgorelko.Lesson7.TaskA1;

public abstract class KitchenAppliances extends Technique { //кухонная техника

    private boolean cookingFood;
    private boolean foodStorage; //Хранение еды

    public boolean isCookingFood() {
        return cookingFood;
    }

    public void setCookingFood(boolean cookingFood) {
        this.cookingFood = cookingFood;
    }

    public boolean isFoodStorage() {
        return foodStorage;
    }

    public void setFoodStorage(boolean foodStorage) {
        this.foodStorage = foodStorage;
    }
}
