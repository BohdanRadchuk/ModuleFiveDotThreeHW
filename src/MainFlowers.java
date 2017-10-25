import flower.Chamomile;
import flower.Rose;
import flower.Tulip;
import functions.FlowerLoader;
import functions.FlowerStore;
import functions.FlowersSaver;

public class MainFlowers {
    public static void main(String[] args) {
        FlowerStore flowerStore = new FlowerStore();
        /*FlowersSaver flowersSaver = new FlowersSaver();               //делал проверку. После чего сделал класс абстрактным
        FlowerLoader flowerLoader = new FlowerLoader();
        flowersSaver.save(flowerStore.sell(rose.getQuantity(),chamomile.getQuantity(),tulip.getQuantity()));
        flowerLoader.load("./files/BouquetLoads");
        flowerStore.show(flowerLoader.load("./files/BouquetLoads"));
*/
        Rose rose = new Rose(3);
        Chamomile chamomile = new Chamomile(1);
        Tulip tulip = new Tulip(2);

        System.out.println("Shop sell");
        flowerStore.show(flowerStore.sell(rose.getQuantity(),chamomile.getQuantity(),tulip.getQuantity()));
        System.out.println("\n" + flowerStore.getWallet());

        System.out.println("Shop sellSequence");
        flowerStore.show(flowerStore.sellSequence(rose.getQuantity(),chamomile.getQuantity(),tulip.getQuantity()));
        System.out.println("\n" + flowerStore.getWallet());
        flowerStore.show(FlowerLoader.load("./files/BouquetLoads"));

    }
}
