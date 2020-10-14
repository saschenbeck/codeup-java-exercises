package groceries;

public class GroceryItem {
    private String name;
    private String category;
    private int quantity;

    public GroceryItem(String itemName, String itemCategory, int numberOfItem){
        this.name = itemName;
        this.category = itemCategory;
        this.quantity = numberOfItem;
    }

    public String getName(){
        return this.name;
    }

    public String getCategory(){
        return this.category;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public void setName(String itemName){
        this.name = itemName;
    }

    public void setCategory(String itemCategory){
        this.category = itemCategory;
    }

    public void setQuantity(int numberOfItem){
        this.quantity = numberOfItem;
    }
}
