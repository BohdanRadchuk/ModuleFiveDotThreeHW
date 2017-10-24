package functions;

import flower.Chamomile;
import flower.Rose;

import flower.SuperFlowers;
import flower.Tulip;

import java.util.ArrayList;

public class FlowerStore {
    SuperFlowers rose1;
    SuperFlowers chamomile1;
    SuperFlowers tulip1;
    private int wallet;

    public FlowerStore() {
        this.wallet = 0;
    }

    public ArrayList sell (int rose, int chamomile, int tulip){

        ArrayList <SuperFlowers> sellBouquet = new ArrayList<>();

        for ( int i = 0; i<rose+chamomile+tulip; i++){
            if (i<rose){
                sellBouquet.add(new Rose(rose));
            }
            if (i>rose-1 && i<rose+chamomile) {
                sellBouquet.add(new Chamomile(chamomile));
            }
            if (i>rose+ chamomile - 1 && i<rose+chamomile+tulip)
                sellBouquet.add(new Tulip(tulip));

           }
        WalletCount(sellBouquet);
        return sellBouquet;
    }

    public ArrayList sellSequence(int rose, int chamomile, int tulip){

        rose1 = new Rose(rose);
        chamomile1 = new Chamomile(chamomile);
        tulip1 = new Tulip(tulip);

        int maxCount = Math.max(rose,Math.max(chamomile,tulip));        //определяем какого вида цветков больше всего

        ArrayList <SuperFlowers> sellSequenceBouquet = new ArrayList<>();

        for ( int i = 0; i<maxCount; i++) {
            if (rose1.getQuantity()>i){                                 //сравниваем количество этого вида цветков с шагом
                sellSequenceBouquet.add(new Rose(rose));
                }
            if (chamomile1.getQuantity()>i){
                sellSequenceBouquet.add(new Chamomile(chamomile));
            }
            if (tulip1.getQuantity()>i){
                sellSequenceBouquet.add(new Tulip(tulip));
                }
        }
        WalletCount(sellSequenceBouquet);

        return sellSequenceBouquet;
    }

    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }

    public void  WalletCount(ArrayList arrayList){

        for (Object arrayobject:arrayList) {
            if (arrayobject instanceof Rose)
            setWallet(getWallet()+((Rose) arrayobject).getPrice());
            if (arrayobject instanceof Chamomile)
            setWallet(getWallet()+((Chamomile) arrayobject).getPrice());
            if (arrayobject instanceof Tulip)
            setWallet(getWallet()+((Tulip) arrayobject).getPrice());

        }

    }

    public void show(ArrayList temparrlist){
        for (int i = 0 ; i<temparrlist.size(); i++)
            if (i<temparrlist.size()-1)
            System.out.print(temparrlist.get(i).getClass().getSimpleName()+ ", ");
        else System.out.print(temparrlist.get(i).getClass().getSimpleName() + ".");
    }
}
