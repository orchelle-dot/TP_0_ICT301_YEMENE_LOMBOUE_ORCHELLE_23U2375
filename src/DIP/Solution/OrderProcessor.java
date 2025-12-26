package DIP.Solution;


public class OrderProcessor {

    private DataBase database;


    public OrderProcessor(DataBase database) {
        this.database = database;
    }

    public void processOrder(String order) {

        database.save(order);
    }
}

