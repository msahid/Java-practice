package mscode.oopconcepts;

class Item{
    int itemNum;
    String itemName;

    Item(int itemNum, String itemName){
        this.itemNum = itemNum;
        this.itemName = itemName;
    }



    void display(){
        System.out.println("Item Num = "+itemNum);
        System.out.println("Item Name ="+ itemName);
    }
}

public class ConstructorDemo2 {
    public static void main(String[] args) {
        Item item1 = new Item(111, "Monitor");
        item1.display();
        Item item2 = new Item(250,"Keyboard");
        item2.display();
    }
}
