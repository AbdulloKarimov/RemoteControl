public class MP3Player extends Device {
    public MP3Player(String name, String model){
        super(name,model);
    }
    @Override
    public void doSomething(){
        if(super.getIsOnOrOff()==true){
            System.out.println("Я слушаю музыку при помощи MP3 плеера!");
        }else{
            System.out.println("Сперва включи MP3 плеер!");
        }
    }
}
