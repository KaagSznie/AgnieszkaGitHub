
package creationSimpleObjectEncapsulation;

/**
 *
 * @author 2501agpestel
 */
public class TestClassCar {
    public static void main(String[] args) {
        Car maserati = new Car();
        maserati.setYear(2017);
        
        System.out.println(maserati.getDescription());
        
        System.out.println(maserati.getlicencePlate());
    }
}
