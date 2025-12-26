
package DIP.Violation;


public class OrderProcessor {

    private MySQLDatabase database;

    public OrderProcessor() {

        this.database = new MySQLDatabase();

    }

    public void processOrder(String order) {

        database.save(order);

    }

}