import java.util.ArrayList;

public class RemoteControl {
    private String name;
    private ArrayList<Device> devices;
    private Device activeDevice;

    public RemoteControl(String name) {
        this.name = name;
        devices = new ArrayList<Device>();
    }

    public void chooseDevice(String nameOfdevice) {
        if (checkInSystem(nameOfdevice) != null) {
            this.activeDevice = checkInSystem(nameOfdevice);
            System.out.println("Вы управляете устройством" + checkInSystem(nameOfdevice).getName());

        } else {
            System.out.println("Совпадений не найдено!");
        }
    }

    public void turnOn() {
        if (activeDevice != null) {
            activeDevice.setOnOrOff(true);
            System.out.println("Устройство" + activeDevice.getName() + " успешно включено!");
        } else {
            System.out.println("Выберите устройство для управления");
        }
    }

    public void turnOff() {
        if (activeDevice != null) {
            activeDevice.setOnOrOff(false);
            System.out.println("Устройство" + activeDevice.getName() + " успешно выключено!");
        } else {
            System.out.println("Выберите устройство для управления");
        }
    }

    public void showAllDevicesInSystem() {
        if (devices.size() == 0) {
            System.out.println("LДобавьте устройства в систему управления");
        } else {
            System.out.println("Доступные устройства");
            for (Device devices : devices) {
                System.out.println(devices.getName() + "      ");
            }
        }
    }

    public Device checkInSystem(String nameOfDevice) {
        for (Device devices : devices) {
            if (devices.getName().equals(nameOfDevice)) {
            return devices;
            }
        }
        return null;
    }
    
    public void addInSystem(Device device){
        this .devices.add(device);
        System.out.println("Устройство "+device.getName()+" успешно добавлена в систуму управления");
    }

    public Device getActiveDevice() {
        return activeDevice;
    }
}
