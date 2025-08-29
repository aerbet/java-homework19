import Task2.Airplane;
import Task2.Bicycle;
import Task2.Car;
import Task3.King;
import Task4.Bishop;
import Task5.CashPayment;

public class Main {
    
    public static void main(String[] args) {
        // task 2
        Car car = new Car("Mercedes", "CLS", 40);
        Bicycle bicycle = new Bicycle("BMW", "Mount", 12);
        Airplane airplane = new Airplane("AirCo", "Boing", 300);

        System.out.println(car.isRides());
        System.out.println(bicycle.isRides());
        System.out.println(airplane.isRides());


        // task 3
        King king = new King(2, 4, "K", "black");

        System.out.println(king.toString());
        king.printCoordinates();
        king.movePiece(1, 3);
        king.printCoordinates();

        // task 4
        Bishop bishop = new Bishop(6, 6, "black");

        System.out.println(bishop.toString());
        bishop.printCoordinates();
        bishop.movePiece(5, 4);
        bishop.printCoordinates();

        // task 5
        CashPayment cash = new CashPayment(100);
        System.out.println(cash.pay(100));
    }
}
