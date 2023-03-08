package week4;


import java.util.Arrays;

public class WelcomeMember {
    public String[] name;
    public String city;
    public String state;

    public WelcomeMember(String[] name, String city, String state) {
        this.name = name;
        this.city = city;
        this.state = state;
    }

    public String[] getName() {
        return name;
    }

    public void setName(String[] name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public static void sayHello(String[] names, String city, String state) {


        System.out.println("Hello, " + Arrays.toString(names).replace("[", "").replace("]", "").replace(",","")+ "! Welcome to " + city + ", " + state + "!");

    }




    public static void main(String[] args) {
        sayHello(new String[]{"Zehra", "Karakas"},"Cranford","New Jersey");
    }


}
