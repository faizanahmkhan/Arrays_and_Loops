import java.util.ArrayList;

public class Loops {
    public static void main(String[] args) {

        ArrayList<String> colours = new ArrayList<>();
        colours.add("red");
        colours.add("green");
        colours.add("silver");
        colours.add("pink");
        colours.add("blue");

        System.out.println(colours);

        System.out.println("--Using enhanced for loop--");
        for (String colour : colours){
            System.out.println(colour);
        }

        System.out.println("--Using classic for loop--");
        for (int i = 0; i < colours.size(); i++ ){
            String colour = colours.get(i);
            System.out.println(colour);
        }
    }
}
