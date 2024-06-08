public class Main {
    public static void main(String[] args) {
    
    System.out.println("\n\t23k-3032\n\tShah Hunain");
    
    Table[] tables = new Table[5];
    tables[0] = new Table(8);
    tables[1] = new Table(8);
    tables[2] = new Table();
    tables[3] = new Table();
    tables[4] = new Table();
    
    occupyTable(tables, 4);
    occupyTable(tables, 6);
    
    tables[0].haveLunch();
    System.out.println("Table 1 status:");
    System.out.println("Clean? " + tables[0].isClean());
    
    tables[0].haveLunch();
    System.out.println("Table 1 status:");
    System.out.println("Clean= " + tables[0].isClean());
    
    tables[0].leave();
    System.out.println("Table 1 status:");
    System.out.println("Occupied Seats= " + tables[0].getOccupiedSeats());
    
    tables[0].cleanTable();
    System.out.println("Table 1 status:");
    System.out.println("Clean? " + tables[0].isClean());
    
    emptyTable(tables, 1);
    }

    public static void occupyTable(Table[] tables, int groupSize) {
        for(Table table : tables){
            if(table.occupy(groupSize)) {
                System.out.println(""+groupSize+" are seated on the table whose capacity is: "+table.getCapacity());
                return;
            }
        }
        System.out.println("Table not available for "+groupSize);
    }

    public static void emptyTable(Table[] tables, int tableIndex){
        if (tableIndex >= 0 && tableIndex <tables.length){
            tables[tableIndex].leave();
            tables[tableIndex].cleanTable();
            System.out.println("Table "+tableIndex+" emptied");
        }
        else{
            System.out.println("Invalid Index.");
        }
    }

}