package functions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public final class FlowerLoader {

    private final String path;

    public FlowerLoader(String path) {
        this.path = path;
    }
    public ArrayList load(){
        ArrayList<String> scannedList = new ArrayList();
        try {

            Scanner scanner = new Scanner(new FileReader(path));
            while (scanner.hasNextLine()){
                scannedList.add(scanner.nextLine());

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for ( String objject: scannedList
             ) {
            System.out.println(objject);

        }

    return scannedList;
    }

}
