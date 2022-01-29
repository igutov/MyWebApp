public class Cat extends Animal implements Action {
    public Cat(String name, Byte year) {
        super(name, year);
        System.out.println("сделал кошку");
    }

    public Cat(Byte year, String name) {
        super(name, year);
        System.out.println("сделал кошку");
    }

    @Override
    public void makeAction() {
        System.out.println("кошка прыгнула");
    }
}
