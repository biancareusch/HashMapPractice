import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;



public class GroceryApp {


    public static void main(String[] args) {

        //create Arraylists for categories (can't have duplicate categories in hashmap keys)
        ArrayList<GroceryItem> dairyCategory = new ArrayList<>();
        ArrayList<GroceryItem> meatCategory = new ArrayList<>();
        ArrayList<GroceryItem> fruitCategory = new ArrayList<>();
        ArrayList<GroceryItem> vegetableCategory = new ArrayList<>();

        //create some groceries
//        GroceryItem milk = new GroceryItem("milk", 2);
//        GroceryItem cheese = new GroceryItem("cheese", 1);
//        GroceryItem steak = new GroceryItem("steak", 3);
//        GroceryItem apple = new GroceryItem("apple", 5);
//        GroceryItem pear = new GroceryItem("pear", 2);
//        GroceryItem bellPepper = new GroceryItem("bellPepper", 1);

        // add our items to our categoryLists
//        dairyCategory.add(milk);
//        dairyCategory.add(cheese);
//
//        meatCategory.add(steak);
//
//        fruitCategory.add(apple);
//        fruitCategory.add(pear);
//
//        vegetableCategory.add(bellPepper);


        //create a list to hold all out groceries in each category
        HashMap<String, ArrayList<GroceryItem>> groceriesList = new HashMap<>(); //String = category

        //add GroceryItems to our groceriesList
        groceriesList.put("dairy", dairyCategory);
        groceriesList.put("meat", meatCategory);
        groceriesList.put("fruit", fruitCategory);
        groceriesList.put("vegetables", vegetableCategory);

        System.out.println("Welcome to your Grocery List App");
        Input userInput = new Input();

        while(userInput.yesNo("Would you like to enter groceries?")) {
            GroceryItem newItem = getNewGroceryItem();
            addToCategory(groceriesList, newItem);
            System.out.printf("%s added!\n", newItem.getName());
        }

        System.out.println("Would you like to see your list?");
        if(userInput.yesNo()){
            printList(groceriesList);
        }else{
            System.out.println("Goodbye!");
        }


    }

    public static void addToCategory(HashMap<String, ArrayList<GroceryItem>> groceryList, GroceryItem newItem) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which category is your item in?");
        for (String groceryCategory : groceryList.keySet()) {
            System.out.printf("| %10s |\n", groceryCategory);
        }
        String userInput = sc.nextLine();
        if(groceryList.get(userInput) != null){
            groceryList.get(userInput).add(newItem);
        }else {
            System.out.println("Invalid category");
            addToCategory(groceryList, newItem);
        }
    }

    public static GroceryItem getNewGroceryItem() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the name of your item:\n");
        String nameInput = sc.nextLine();

        System.out.println("Please enter the quantity:\n");
        int quantityInput = sc.nextInt();

        GroceryItem newItem = new GroceryItem(nameInput, quantityInput);

        return newItem;
    }

    public static void printList(HashMap<String, ArrayList<GroceryItem>> groceryList) {
        for (String groceryCategory : groceryList.keySet()) {
            System.out.printf("Category: %s\n", groceryCategory);
            System.out.print("------------\n");
            for (GroceryItem groceryItem : groceryList.get(groceryCategory)) {
                String groceryName = groceryItem.getName();
                int groceryQuantity = groceryItem.getQuantity();
                System.out.printf("Item: %10s  |  Quantity: %d\n", groceryName, groceryQuantity);
            }
            System.out.print("\n");
        }
    }

    //TODO: make a menu with numbers for each category?
    //TODO: allow user to create new categories
    //TODO: increase quantity of previously entered items(if ->alreadyExistingItem.contains(userinput) -> alreadyExistingItem.quantity = this.quantity + userinput.quantity)
    //TODO: add GUI ?!
    //TODO: ???
}
