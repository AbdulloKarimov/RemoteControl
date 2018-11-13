public class AudioSystem extends Device{
    public AudioSystem(String name, String model) {
        super(name, model);
    }

    @Override
    public void doSomething() {
        if (super.getIsOnOrOff() == true) {
            System.out.println("Я слушаю музыку при помощи Аудиосистемы");
        } else {
            System.out.println("Сперва включи аудиосистему");
        }
    }
}
