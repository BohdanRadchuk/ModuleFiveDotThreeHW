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
        rose1 = new Rose(rose);
        chamomile1 = new Chamomile(chamomile);
        tulip1 = new Tulip(tulip);
        ArrayList sellBouquet = new ArrayList();

        for ( int i = 0; i<rose+chamomile+tulip; i++){
            if (i<rose){
                sellBouquet.add(rose1.getClass().getSimpleName());
                setWallet(getWallet()+rose1.getPrice());
            }
            if (i>rose-1 && i<rose+chamomile) {
                sellBouquet.add(chamomile1.getClass().getSimpleName());
                setWallet(getWallet()+chamomile1.getPrice());
            }
            if (i>rose+ chamomile - 1 && i<rose+chamomile+tulip) {
                sellBouquet.add(tulip1.getClass().getSimpleName());
                setWallet(getWallet()+tulip1.getPrice());
            }
           }
        return sellBouquet;
    }

    public ArrayList sellSequence(int rose, int chamomile, int tulip){

        rose1 = new Rose(rose);
        chamomile1 = new Chamomile(chamomile);
        tulip1 = new Tulip(tulip);

        int maxCount = Math.max(rose,Math.max(chamomile,tulip));

        ArrayList sellSequenceBouquet = new ArrayList();

        for ( int i = 0; i<maxCount; i++) {
            if (rose1.getQuantity()>i){
                sellSequenceBouquet.add(rose1.getClass().getSimpleName());
                setWallet(getWallet()+rose1.getPrice());}
            if (chamomile1.getQuantity()>i){
                sellSequenceBouquet.add(chamomile1.getClass().getSimpleName());
                setWallet(getWallet()+chamomile1.getPrice());}
            if (tulip1.getQuantity()>i){
                sellSequenceBouquet.add(tulip1.getClass().getSimpleName());
                setWallet(getWallet()+tulip1.getPrice());}
        }
        return sellSequenceBouquet;
    }
    public void show(ArrayList temparrlist){
        for (int i = 0 ; i<temparrlist.size(); i++)
            if (i<temparrlist.size()-1)
            System.out.print(temparrlist.get(i)+ ", ");
        else System.out.print(temparrlist.get(i) + ".");
    }

    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }
}
