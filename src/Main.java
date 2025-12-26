import DIP.Solution.DataBase;
import DIP.Solution.MongoDBDatabase;
import DIP.Solution.MySQLDatabase;
import DIP.Violation.OrderProcessor;

import ISP.Solution.HumanWorkerISP;
import ISP.Solution.RobotWorkerISP;
import ISP.Violation.HumanWorker;
import ISP.Violation.RobotWorker;

import LSP.Solution.RectangleLSPs;
import LSP.Solution.ShapeLSP;
import LSP.Solution.SquareLSPs;
import LSP.Violation.RectangleLSPV;
import LSP.Violation.Square;

import OCP.Solution.CircleOCP;
import OCP.Solution.RectangleOCP;
import OCP.Solution.Shape;
import OCP.Violation.AreaCalculator;
import OCP.Violation.Circle;
import OCP.Violation.Rectangle;

import SRP.Solution.BookBusnessLogic;
import SRP.Solution.BookPrinter;
import SRP.Solution.BookSRP;
import SRP.Solution.BookSave;
import SRP.Violation.Book;

class  MainSOLID {

    public static void main(String[] args) {

        /* ================= SRP ================= */
        System.out.println("===== SRP : Violation =====");
        Book livre = new Book(
                "Architecture Logicielle",
                "Etudiants ICT301",
                "Introduction aux principes SOLID"
        );
        livre.printToScreen();
        livre.saveToDatabase();
        livre.emprunter("Orchelle");

        System.out.println("===== SRP : Solution =====");
        BookSRP bookClean = new BookSRP(
                "Architecture Logicielle",
                "Etudiants ICT301",
                "Introduction aux principes SOLID"
        );

        BookSave bookSaver = new BookSave();
        bookSaver.saveToDatabase(bookClean);
        bookSaver.saveToFile(bookClean, "book.txt");

        BookBusnessLogic logic = new BookBusnessLogic();
        logic.emprunter(bookClean, "Merveille");
        logic.autreService(bookClean);

        BookPrinter printer = new BookPrinter();
        printer.printToScreen(bookClean);
        printer.printToHTML(bookClean);

        /* ================= OCP ================= */
        System.out.println("===== OCP : Violation =====");
        Rectangle rect1 = new Rectangle(10, 5);
        Circle circ1 = new Circle(3);

        AreaCalculator calc = new AreaCalculator();
        System.out.println("Aire rectangle = " + calc.calculateArea(rect1));
        System.out.println("Aire cercle = " + calc.calculateArea(circ1));

        System.out.println("===== OCP : Solution =====");
        Shape rectOCP = new RectangleOCP(8, 6);
        Shape circOCP = new CircleOCP(5);

        System.out.println("Aire rectangle = " + rectOCP.calculateArea());
        System.out.println("Aire cercle = " + circOCP.calculateArea());

        /* ================= LSP ================= */
        System.out.println("===== LSP : Violation =====");
        RectangleLSPV rectLSPV = new RectangleLSPV();
        rectLSPV.setWidth(6);
        rectLSPV.setHeight(4);
        System.out.println("Aire rectangle = " + rectLSPV.getArea());

        RectangleLSPV squareV = new Square();
        squareV.setWidth(5);
        System.out.println("Aire carré = " + squareV.getArea());

        System.out.println("===== LSP : Solution =====");
        ShapeLSP squareOK = new SquareLSPs(6);
        ShapeLSP rectOK = new RectangleLSPs(6, 3);

        System.out.println("Aire carré = " + squareOK.getArea());
        System.out.println("Aire rectangle = " + rectOK.getArea());

        /* ================= ISP ================= */
        System.out.println("===== ISP : Violation =====");
        HumanWorker human = new HumanWorker();
        human.work();
        human.eat();

        RobotWorker robot = new RobotWorker();
        robot.work();
        // robot.eat(); ❌ non supporté

        System.out.println("===== ISP : Solution =====");
        HumanWorkerISP humanISP = new HumanWorkerISP();
        humanISP.work();
        humanISP.eat();

        RobotWorkerISP robotISP = new RobotWorkerISP();
        robotISP.work();

        /* ================= DIP ================= */
        System.out.println("===== DIP : Violation =====");
        OrderProcessor processor1 = new OrderProcessor();
        processor1.processOrder("Commande 001");

        System.out.println("===== DIP : Solution =====");
        DataBase mysql = new MySQLDatabase();
        DataBase mongo = new MongoDBDatabase();

        OrderProcessor processor2 = new OrderProcessor();
        processor2.processOrder("Commande MySQL");

        OrderProcessor processor3 = new OrderProcessor();
        processor3.processOrder("Commande MongoDB");
    }
}
