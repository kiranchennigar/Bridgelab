abstract class FoodItem {
 private double price;
 private int preparationTime;

 public FoodItem(double price, int preparationTime) {
     this.price = price;
     this.preparationTime = preparationTime;
 	}

 public double getPrice() {
     return price;
 	}

 public int getPreparationTime() {
     return preparationTime;
 	}

 public abstract void prepare();
}

class Pizza extends FoodItem {
    public Pizza() {
        super(100, 15);
    }

    public void prepare() {
        System.out.println("Price: Rs" + getPrice());
        System.out.println("Preparation Time: " + getPreparationTime() + " mins");
        System.out.println("Preparing Burger with ingredients- Dough, Cheese, Tomato Sauce, Pepperoni\n");
    }
}

class Burger extends FoodItem {
    public Burger() {
        super(89, 10);
    }

    public void prepare() {System.out.println("Price: Rs" + getPrice());
        System.out.println("Preparation Time: " + getPreparationTime() + " mins");
        System.out.println("Preparing Burger with ingredients: Bun,Beef Patty,Lettuce,Cheese,Tomato\n");
    }
}

class Pasta extends FoodItem {
    public Pasta() {
        super(100, 15);
    }

    public void prepare() {
    	System.out.println("Price: Rs" + getPrice());
        System.out.println("Preparation Time: " + getPreparationTime() + " mins");
        System.out.println("Preparing Pasta with ingredients: Pasta,Garlic,Olive oil,Parmesan,Basil");
    }
}

public class RestaurantSimulator {
	    public static void main(String[] args) {
	        FoodItem[] order = {
	            new Pizza(),
	            new Burger(),
	            new Pasta()
	        };

	        System.out.println(" Customer Order Summary\n");

	        for (FoodItem item : order) {
	            System.out.println("Item: " + item.getClass().getSimpleName());
	            item.prepare();
	        }
	    }
}
