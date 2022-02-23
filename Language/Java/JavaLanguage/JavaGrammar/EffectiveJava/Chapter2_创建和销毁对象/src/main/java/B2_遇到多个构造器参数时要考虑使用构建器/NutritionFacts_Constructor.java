package B2_遇到多个构造器参数时要考虑使用构建器;

public class NutritionFacts_Constructor {
    private final int servingSize;   //(ml)            required
    private final int servings;      //(per container) required
    private final int calories;      //(per serving)   optional
    private final int fat;           //(g/serving)     optional
    private final int sodium;        //(mg/serving)    optional
    private final int carbohydrate;  //(g/serving)     optional

    public NutritionFacts_Constructor(int servingSize, int servings, int calories, int fat, int sodium, int carbohydrate) {
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
    }

    public NutritionFacts_Constructor(int servingSize, int servings) {
        this(servingSize, servings, 0);
    }

    public NutritionFacts_Constructor(int servingSize, int servings, int calories) {
        this(servingSize, servings, calories, 0);
    }

    public NutritionFacts_Constructor(int servingSize, int servings, int calories, int fat) {
        this(servingSize, servings, calories, fat, 0);
    }

    public NutritionFacts_Constructor(int servingSize, int servings, int calories, int fat, int sodium) {
        this(servingSize, servings, calories, fat, sodium, 0);
    }

}
