package week04.Thief2;


import week04.Fox;

public class ThiefFox2 {
    public String name;
    public String coatColor;
    public int bagCount;
    public boolean HasATorch;
    public boolean WearsCoat;

    public ThiefFox2(String name, String coatColor, int bagCount, boolean hasATorch, boolean wearsCoat) {
        this.name = name;
        this.coatColor = coatColor;
        this.bagCount = bagCount;
        HasATorch = hasATorch;
        WearsCoat = wearsCoat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoatColor() {
        return coatColor;
    }

    public void setCoatColor(String coatColor) {
        this.coatColor = coatColor;
    }

    public int getBagCount() {
        return bagCount;
    }

    public void setBagCount(int bagCount) {
        this.bagCount = bagCount;
    }

    public boolean isHasATorch() {
        return HasATorch;
    }

    public void setHasATorch(boolean hasATorch) {
        HasATorch = hasATorch;
    }

    public boolean isWearsCoat() {
        return WearsCoat;
    }

    public void setWearsCoat(boolean wearsCoat) {
        WearsCoat = wearsCoat;
    }

    public static void suspect(Fox fox) {
        if (fox.HasATorch == true && fox.isWearsCoat() == true && fox.coatColor.equals("BLACK") && fox.bagCount == 3) {
            System.err.println(fox.getName() + " Suspect fox");
        } else {
            System.out.println( fox.getName() + " Cleared");
        }


    }

}

