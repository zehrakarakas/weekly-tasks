package week4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WelcomeMember {
    public String[] name;
    public String city;
    public String state;

    public static void sayHello(String[] names, String city, String state) {


        System.out.println("Hello, " +Arrays.toString(names).replace("[", "").replace("]", "").replace(",","")+ "! Welcome to " + city + ", " + state + "!");

    }




    public static void main(String[] args) {
        sayHello(new String[]{"Zehra", "Karakas"},"Cranford","New Jersey");
    }


}
