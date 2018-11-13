public class DigitalReceiver extends Device {
    public DigitalReceiver(String name, String model){
        super(name,model);
    }
    @Override
    public void doSomething(){
        if(super.getIsOnOrOff()==true){
            System.out.println("Я смотрю телевизор при помощи цифрового ресивера!");
        }else{
            System.out.println("Сперва включи цифровой ресивер!");
        }
    }
}