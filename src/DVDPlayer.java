public class DVDPlayer extends Device {
    public DVDPlayer(String name, String model) {
        super(name, model);
    }

    @Override
    public void doSomething() {
        if (super.getIsOnOrOff() == true) {
            System.out.println("Я смотрю видео при помощи DVD плеера");
        } else {
            System.out.println("Сперва включи DVD player");
        }
    }
}

