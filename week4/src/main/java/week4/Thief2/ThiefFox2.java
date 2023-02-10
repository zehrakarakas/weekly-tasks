package week4.Thief2;

import lombok.AllArgsConstructor;
import lombok.Data;
import week4.Fox;

@Data
@AllArgsConstructor
public class ThiefFox2 {
    public String name;
    public String coatColor;
    public int bagCount;
    public boolean HasATorch;
    public boolean WearsCoat;


    public static void suspect(Fox fox) {
        if (fox.HasATorch == true && fox.isWearsCoat() == true && fox.coatColor.equals("BLACK") && fox.bagCount == 3) {
            System.err.println(fox.getName() + " Suspect fox");
        } else {
            System.out.println( fox.getName() + " Cleared");
        }


    }

}

