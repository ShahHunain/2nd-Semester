public class InventoryManager {

    static void updateInventory(String itemId, int quantityChange){
        if (itemId.equals("101A22")) {
            Item.quantity += quantityChange;
        }
        else if(itemId.equals("804B11")){
            Item.quantity += quantityChange;
        }
        else{

        }
    }

}