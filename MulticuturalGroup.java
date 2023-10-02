import java.util.*;
public class MulticuturalGroup {
    public static void main(String...args) {
        Scanner in = new Scanner(System.in);
        int sizeInArray1 = 0;
        int sizeInArray2 = 0;
        String firstInput = "";
        String secondInput = "";

        System.out.print("Enter the number of elements in the first array: ");
        sizeInArray1 = Integer.parseInt(in.nextLine());

        firstInput = in.nextLine();

        // from: "a x y d s q w"
        // to: ["a","x","y","d","s","q","w"]
        String array1[] = firstInput.split(" ");

        System.out.print("Enter the number of elements in the second array: ");
        sizeInArray2 = Integer.parseInt(in.nextLine());

        secondInput = in.nextLine();
        
        String array2[] = secondInput.split(" ");

        String merged = (String.join(" ", firstInput) + " " + String.join(" ", secondInput)).replaceAll(" ", "").toLowerCase();

        // "axydsqwbdsxydq"
        String copy = merged.trim();
        String uniques = "";

        // "axydsqwbdsxydq"
        for (int index = 0; index < merged.length(); index++) {
            int count = 0;
            while (copy.indexOf(String.valueOf(merged.charAt(index))) != -1) {
                copy = copy.replaceFirst(String.valueOf(merged.charAt(index)), "-");
                count++;
            }

            if (count == 1) uniques += (merged.charAt(index) + " ");
        }

        String uniquesArray[] = uniques.split(" ");
        Arrays.sort(uniquesArray);
        uniques = String.join(" ", uniquesArray);

        System.out.print("Unique characters = " + uniques.trim());
    }//end of main method
}//end of class
