import flower.Chamomile;
import flower.Rose;
import flower.Tulip;
import functions.FlowerStore;

public class MainFlowers {
    public static void main(String[] args) {

        Rose rose = new Rose(4);
        Chamomile chamomile = new Chamomile(1);
        Tulip tulip = new Tulip(0);
        FlowerStore flowerStore = new FlowerStore();

        System.out.println("Shop sell");
        flowerStore.show(flowerStore.sell(rose.getQuantity(),chamomile.getQuantity(),tulip.getQuantity()));
        System.out.println("\n" + flowerStore.getWallet());
        System.out.println("Shop sellSequence");
        flowerStore.show(flowerStore.sellSequence(rose.getQuantity(),chamomile.getQuantity(),tulip.getQuantity()));
        System.out.println("\n" + flowerStore.getWallet());
    }
}
