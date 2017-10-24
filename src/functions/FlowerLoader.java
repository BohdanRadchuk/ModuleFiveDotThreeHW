package functions;

import flower.Chamomile;
import flower.Rose;
import flower.SuperFlowers;
import flower.Tulip;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class FlowerLoader {

private static final String SEPARATOR = ";";


    public static ArrayList load(String path){
        ArrayList<SuperFlowers> scannedBouquet = new ArrayList();
        try {
            FlowerStore fs = new FlowerStore();

            Scanner scanner = new Scanner(new FileReader(path));

            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] data = line.split(SEPARATOR);                              //создаём массив элементов строки (каждый следующий после разделителя";"
                if (data[0].equals(Rose.class.getSimpleName()) )                    //сравниваем 0-вой элемент с названием класса розы
                    scannedBouquet.add(new Rose(Integer.parseInt(data[1])));        //записываем в ArrayList<SuperFlowers> значение количества роз
                if (data[0].equals(Chamomile.class.getSimpleName()) )
                    scannedBouquet.add(new Chamomile(Integer.parseInt(data[1])));
                if (data[0].equals(Tulip.class.getSimpleName()) )
                    scannedBouquet.add(new Tulip(Integer.parseInt(data[1])));

            }


            if (scannedBouquet.size()==3)                                           // проверяем на наличие трёх типов цветов, даже если равен 0, но существует
            scannedBouquet = fs.sell(scannedBouquet.get(0).getQuantity(),           //перезаписываем наш ArrayList уже объектами пользуясь методом из класса FlowerStore
                                    scannedBouquet.get(1).getQuantity(),
                                    scannedBouquet.get(2).getQuantity());
            else System.out.println("формирование объекта не завершено. Заполните все 3 поля");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    return scannedBouquet;
    }

}
