package q1ex5;

import java.util.ArrayList;

public class Store {

    private String name;
    private double earnings;
    private ArrayList<Item> itemList;
    private static ArrayList<Store> storeList = new ArrayList();

    public Store(String name) {
        // Initialize name to parameter and earnings to zero
        // Initialize itemList as a new ArrayList
        // add 'this' store to storeList
        
        
        /*
            delete comment after!!
        
            set this.name to name (as in the String name parameter in the parenthesis)
            set earnings to 0;
            create itemList with new ArrayList();
            add store to storeList with ".add(this)"
        */
    }

    public String getName() {
        return name;
    }

    public double getEarnings() {
        return earnings;
    }

    public void sellItem(int index) {
        // check if index is within the size of the itemList (if not, print statement that there are only x items in the store)
        // get Item at index from itemList and add its cost to earnings
        // print statement indicating the sale
        
        
        /*
            delete comment after!!
            //use this to check itemList size this.itemList.size()
            //to get item list name, get the index from list, and then use getName() method from Item.java
                similarly, use getCost() from Item.java to get the cost
        
        
            if (condition that index is >= to zero And is < item list size){
                print that item is sold
                this.earnings += get item from index, get cost
            } else {
                print that there are only x number of items
            } 
        */
    }

    public void sellItem(String name) {
        // check if Item with given name is in the itemList (you will need to loop over itemList) (if not, print statement that the store doesn't sell it)
        // get Item from itemList and add its cost to earnings
        // print statement indicating the sale
        
        
        /*
            delete comment after!!
            //use this to check itemList size this.itemList.size()
            //to get item list name, get the index from list, and then use getName() method from Item.java
                similarly, use getCost() from Item.java to get the cost
        
        
            create for loop to check if name parameter matches a name in the item list{
                possible references:
                    https://betterprogramming.pub/three-ways-to-check-for-a-value-in-an-array-5976b8fe030d
                    https://www.google.com/search?q=for+loop+to+check+if+element+is+in+array&oq=for+loop+to+check+if+element+is+in+array&aqs=chrome..69i57j33i160j33i22i29i30l8.7464j0j7&sourceid=chrome&ie=UTF-8
                
                if (you found it){
                    this.earnings += get cost of item from index
                    print that item was sold
                }
            }
            
            if item was not found, print that store does not sell item
        */
    }

    public void sellItem(Item i) {
        // check if Item i exists in the store (there is a method that can help with this) (if not, print statement that the store doesn't sell it)
        // get Item i from itemList and add its cost to earnings
        // print statement indicating the sale
        
        
        /*
            delete comment after!!
            //use this to check itemList size this.itemList.size()
            //to get item list name, get the index from list, and then use getName() method from Item.java
                similarly, use getCost() from Item.java to get the cost
        
        
            https://betterprogramming.pub/three-ways-to-check-for-a-value-in-an-array-5976b8fe030d
            https://www.google.com/search?q=for+loop+to+check+if+element+is+in+array&oq=for+loop+to+check+if+element+is+in+array&aqs=chrome..69i57j33i160j33i22i29i30l8.7464j0j7&sourceid=chrome&ie=UTF-8
                
            if (you found it){
                this.earnings += get cost of item from index
                print that item was sold
            }
                        
            if item was not found, print that store does not sell item
        */
    }

    public void addItem(Item i) {
        // add Item i to store's itemList
        
        
        /*
            itemList.add(i); that's it
        */
    }

    public void filterType(String type) {
        // loop over itemList and print all items with the specified type
        
        
        /*
            delete comment after!!
            //use this to check itemList size this.itemList.size()
            //to get item list name, get the index from list, and then use getName() method from Item.java
                similarly, use getCost() from Item.java to get the cost
                and then getType() to get the type
        
            for(as long as code hasn't seen all items in itemList (for example i is the index){
                if(type is the same as item (itemList.get(i).getType()){
                    print item name
                }
            }   
        */
    }

    public void filterCheap(double maxCost) {
        // loop over itemList and print all items with a cost lower than or equal to the specified value
        
        
        /*
            delete comment after!!
            //use this to check itemList size this.itemList.size()
            //to get item list name, get the index from list, and then use getName() method from Item.java
                similarly, use getCost() from Item.java to get the cost
                and then getType() to get the type
        
            for(as long as code hasn't seen all items in itemList (for example i is the index){
                if(maxCost is greater than or equal to (itemList.get(i).getCost()){
                    print item name
                }
            }   
        */
    }

    public void filterExpensive(double minCost) {
        // loop over itemList and print all items with a cost higher than or equal to the specified value
        
        
        /*
            delete comment after!!
            //use this to check itemList size this.itemList.size()
            //to get item list name, get the index from list, and then use getName() method from Item.java
                similarly, use getCost() from Item.java to get the cost
                and then getType() to get the type
        
            for(as long as code hasn't seen all items in itemList (for example i is the index){
                if(minCost is less than or equal to (itemList.get(i).getCost()){
                    print item name
                }
            }   
        */
    }

    public static void printStats() {
        // loop over storeList and print the name and the earnings'Store.java'
        
        
        /*
            delete comment after!!
            //use this to check itemList size this.itemList.size()
            //to get item list name, get the index from list, and then use getName() method from Item.java
                similarly, use getCost() from Item.java to get the cost
                and then getType() to get the type
        
            for(as long as code hasn't seen all stores in storeList (for example i is the index){
                print storeList.get(i).getName() and storeList.get(i).getEarnings()
            }   
        */
    }
}
