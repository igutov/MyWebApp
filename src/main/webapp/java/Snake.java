public class Snake extends Animal implements Action {
    protected Snake(String name, Byte year) {
        super(name, year);
        System.out.println("сделал змея");
    }

    protected Snake(Byte year, String name) {
        super(year, name);
        System.out.println("сделал змея");
    }

    @Override
    public void makeAction() {
        System.out.println("Змея прыгнула");
    }
}
