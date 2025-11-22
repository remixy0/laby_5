package Zad1;

public class Main1 {
    public static void main(String[] args) {
        Device [] lista = new Device[3];
        lista[0] = new Mobile("Samsung","S20",2020,9);
        lista[1] = new Mobile("Apple","ip 15",2024,8);
        lista[2] = new Laptop("Dell","x27",2022,8);

        for (Device device : lista) {
            device.getInfo();
        }

    }
}
