public class TV extends Device{
    public TV(String name, String model) {
        super(name, model);
    }

    @Override
    public void doSomething() {
        if (super.getIsOnOrOff() == true) {
            System.out.println("Я смотрю Телевизор");
        } else {
            System.out.println("Сперва включи Телевизор");
        }
    }
}
