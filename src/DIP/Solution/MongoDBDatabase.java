package DIP.Solution;

public class MongoDBDatabase implements DataBase {

    @Override

    public void save(String data) {

        System.out.println("Saving to MongoDB: " + data);

    }
}


