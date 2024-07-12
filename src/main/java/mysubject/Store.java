package mysubject;

import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<VGADTO> vgaCards;

    public Store() {
        vgaCards = new ArrayList<>();
    }

    public void addCard(VGADTO vgaCard) {
        vgaCards.add(vgaCard);
    }

    public VGADTO getVgaCard(int vgaNum) {
        for (VGADTO card : vgaCards) {
            if (card.getVgaNum() == vgaNum) {
                return card;
            }
        }
        return null;
    }

    public void updateVgaCard(int vganum, String name, String brand, int mhz, int stream, int power, int port, int pan, int price) {
        VGADTO vgaCards = getVgaCard(vganum);
        if (vgaCards != null) {
            vgaCards.setName(name);
            vgaCards.setBrand(brand);
            vgaCards.setMhz(mhz);
            vgaCards.setStream(stream);
            vgaCards.setPower(power);
            vgaCards.setPort(port);
            vgaCards.setPan(pan);
            vgaCards.setPrice(price);
        }
    }

    public void deleteVgaCard(int vganum) {
        vgaCards.removeIf(card -> card.getVgaNum() == vganum);
    }

    public List<VGADTO> getAllVgaCards() {
        for (VGADTO card : vgaCards) {
            System.out.println(card);
        }
        return vgaCards;
    }
}