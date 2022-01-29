public class Dog extends Animal {

    protected Dog(String name, Byte year) {
        super(name, year);
        System.out.println("сделал собаку");
    }

    protected Dog(Byte year, String name) {
        super(year, name);
        System.out.println("сделал собаку");
    }
}
