package DIP.Solution;

    public class MySQLDatabase implements DataBase{

        @Override

        public void save(String data) {

            System.out.println("Saving to MySQL: " + data);
        }
    }


