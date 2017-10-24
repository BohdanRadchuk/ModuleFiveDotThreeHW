package functions;

import flower.SuperFlowers;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public abstract class FlowersSaver {

    private static final String SAVEPATH = "./files/BouquetSaves";
    private static final String SEPARATOR = ";";

    public void save(ArrayList <SuperFlowers> saverlist){
        try {
            FileWriter writer = new FileWriter(SAVEPATH);

            for (SuperFlowers flower:saverlist
                 ) {
                writer.write(flower.getClass().getSimpleName() + SEPARATOR);
                writer.write("\n");
            }

            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
