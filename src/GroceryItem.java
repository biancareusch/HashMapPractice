
public class GroceryItem {

    //properties or fields
    private String name;
    private int quantity;

    //Constructor - allows us to determine how to create an object
    public GroceryItem(String nameInput, int quantityInput){
        setName(nameInput);
        setQuantity(quantityInput);
    }
    public void setName(String nameInput){
        this.name = nameInput;
    }

    public String getName(){
        return this.name;
    }

    public void setQuantity(int quantityInput){
        this.quantity = quantityInput;
    }

    public int getQuantity(){
        return this.quantity;
    }

}
