abstract class Animal {
    public String name;
    public Byte year;

    protected Animal(String name, Byte year) {
        System.out.println("конструктор 1");
        this.name = name;
        this.year = year;
    }

    protected Animal(Byte year, String name) {
        System.out.println("конструктор 2");
        this.name = name;
        this.year = year;
    }

    protected void getNameAndYear () {
        System.out.println(name + " " + year);
    }
}
