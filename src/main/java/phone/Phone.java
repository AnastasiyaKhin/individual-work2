package phone;

import java.util.Arrays;

public class Phone {
    private String number;
    private String model;
    private String weight;

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getWeight() {
        return weight;
    }

    public void receiveCall(String name) {
        System.out.println(" Звонит " + name);
    }

    public void receiveCall(String name, String number) {
        System.out.println(" Звонит " + name + number);
    }

    public void sendMessage(String... numbers) {
        for (String s : numbers) {
            System.out.println(s);
        }
    }
}
