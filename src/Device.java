public class Device {
    private boolean onOrOff = false;
    private String name;
    private String model;

    public Device (String name, String model) {
        this.name = name;
        this.model = model;
    }

    public void setOnOrOff(boolean onOrOff) {
        this.onOrOff = onOrOff;
    }

    public boolean getIsOnOrOff() {
        return onOrOff;
    }

    public String getName() {
        return name;
    }

    public void doSomething() {
        System.out.println("Я делаю что-то");
    }

}
