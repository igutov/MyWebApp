public class Cat extends Animal {
    public Cat(String name, Byte year) {
        super(name, year);
        System.out.println("сделал кошку");
    }

    public Cat(Byte year, String name) {
        super(name, year);
        System.out.println("сделал кошку");
    }
}
