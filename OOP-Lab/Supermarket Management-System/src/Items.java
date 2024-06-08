import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Items extends Function{
    protected String[] itemName;
    protected double[] price;
    protected int newItemID = -1;
    protected int arraySize = 100;
    
    Items() throws Exception{
        itemName = new String[arraySize];
        price = new double[arraySize];

        File file = new File("../Items.txt");
        if(file.createNewFile()){
            System.out.println("File created: " + file.getName());
        }

        Scanner fr = new Scanner(file);

        while(fr.hasNextLine()){
            this.newItemID = fr.nextInt();
            this.itemName[newItemID] = fr.next();
            this.price[newItemID] = fr.nextDouble();
        }

        fr.close();

    }

    protected void createItem(String itemName, double price){
        this.newItemID++;
        this.itemName[newItemID] = itemName;
        this.price[newItemID] = price;
    }

    protected String[] getIteminfo(String itemName){
        String[] itemInfo = new String[4];

        for(int i=0; i<this.itemName.length; i++){
            if(itemName.equals(this.itemName[i])){
                itemInfo[0] = String.valueOf(i);
                itemInfo[1] = this.itemName[i];
                itemInfo[2] = String.valueOf(this.price[i]);
                break;
            }
        }

        return itemInfo;
    }

    protected void editIteminfo(int itemID, String itemName, double price){
        this.itemName[itemID] = itemName;
        this.price[itemID] = price;
    }

    protected void saveIteminfo() throws Exception{
        File file = new File("../Items.txt");
        
        if(file.createNewFile()){
            System.out.println("File created");
        }

        FileWriter fw = new FileWriter(file);
        fw.write(this.toString());
        fw.close();
    }

    protected void removeItem(String itemName){
        String[] tempitemName = new String[100];
        double[] tempprice = new double[100];

        for(int i=0, j=0; i<=this.newItemID; i++){
            if(!this.itemName[i].equals(itemName)){
                tempitemName[j] = this.itemName[i];
                tempprice[j] = this.price[i];
                j++;
            }
        }

        this.newItemID--;

        for(int i=0; i<=newItemID; i++){
            this.itemName[i] = tempitemName[i];
            this.price[i] = tempprice[i];
        }
    }

    public boolean illegalUserTextInput(String text){
        return super.illegalUserTextInput(text);
    }

    @Override
    public String toString(){
        String info = "";

        for(int i=0; i<=this.newItemID; i++){
            info += i + " " + this.itemName[i] + " " + this.price[i];
            
            if(i != this.newItemID){
                info += "\n";
            }
        }

        return info;
    }

}