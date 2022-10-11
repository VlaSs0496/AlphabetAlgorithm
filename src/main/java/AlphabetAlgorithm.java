import java.util.ArrayList;
import java.util.Arrays;

public class AlphabetAlgorithm {
    //By Vladimir Fernandez
    public static ArrayList<String> blocks = new ArrayList<String>(Arrays.asList("BO", "XK", "DQ", "CP", "NA", "GT",
            "RE", "TG", "QD", "FS", "HU", "VI", "AT", "OB", "ER", "FS", "LY", "PC", "ZM", "JW"));
    public static ArrayList<String> usedBlocks = new ArrayList<String>();
    public static void main(String[] args) {

        System.out.println(AlphabetAlgorithm.verifyWord("A"));
        System.out.println(AlphabetAlgorithm.verifyWord("Libro"));
        System.out.println(AlphabetAlgorithm.verifyWord("Bozo"));
        System.out.println(AlphabetAlgorithm.verifyWord("Traje"));
        System.out.println(AlphabetAlgorithm.verifyWord("Comun"));
        System.out.println(AlphabetAlgorithm.verifyWord("Dorito"));
        System.out.println(AlphabetAlgorithm.verifyWord("ARLEQUIN"));

    }

    public static boolean verifyWord(String cadena) {
        usedBlocks.clear();
        String palabraComparar = "";
        String[] splittedWord = cadena.split("");
        
        for (int i = 0; i < splittedWord.length; i++) {
            if (letterCanBeMade(splittedWord[i])) {
                palabraComparar += splittedWord[i];
            }
        }
        if (palabraComparar.equalsIgnoreCase(cadena)) {
            System.out.println(">>> puedo_obtener_palabra(" + cadena + ") : true");
            return true;

        } else {
            usedBlocks.clear(); 
            palabraComparar = "";
            for (int i = 0; i < splittedWord.length; i++) {
                if (letterCanBeMadeReverse(splittedWord[i])) {
                    palabraComparar += splittedWord[i];
                }
            }
            if (palabraComparar.equalsIgnoreCase(cadena)) {
                System.out.println(">>> puedo_obtener_palabra(" + cadena + ") : true");
                return true;
            } else {
                System.out.println(">>> puedo_obtener_palabra(" + cadena + ") : false");
                return false;
            }
        }
    }

    public static boolean isBlockAlreadyUsed(String block) {
        for (int i = 0; i < usedBlocks.size(); i++) {
            if (block.equalsIgnoreCase(usedBlocks.get(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean letterCanBeMade(String letter) {
        for (int i = 0; i < blocks.size(); i++) {
            if (!isBlockAlreadyUsed(blocks.get(i))) {
                String[] blockSplitted = blocks.get(i).split("");

                if ((letter.equalsIgnoreCase(blockSplitted[0]) || letter.equalsIgnoreCase(blockSplitted[1]))) {
                    usedBlocks.add(blocks.get(i));
                    return true;
                }
            }
        }
        return false; // de lo contrario retorno false
    }

    public static boolean letterCanBeMadeReverse(String letter) {
        
        for (int i = blocks.size() - 1; i >= 0; i--) {
            if (!isBlockAlreadyUsed(blocks.get(i))) {
                String[] blockSplitted = blocks.get(i).split("");
                if ((letter.equalsIgnoreCase(blockSplitted[0]) || letter.equalsIgnoreCase(blockSplitted[1]))) {
                    usedBlocks.add(blocks.get(i));
                    return true;
                }
            }
        }
        return false;
    }
}
