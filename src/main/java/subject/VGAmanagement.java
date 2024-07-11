package MySubject.Run;

public class VGAmanagement {

    private Store store;
    private CardView view;

    public VGAmanagement() {
        store  = new Store();
        view = new CardView();
    }

    public void addVgaCard(int vgaNum, String name, String brand, int mhz, int stream, int power, int port, int pan, int price) {
        VGADTO vgaCard = new VGADTO(vgaNum, name, brand, mhz,stream,power,port,pan,price);
        store.addCard(vgaCard);
        view.displayMessage("카드정보가 등록되었습니다.");
    }

    public void getVgaCard(int vgaNum) {
        VGADTO vgaCard = store.getVgaCard(vgaNum);
        if (vgaCard != null) {
            view.displayVgaCard(vgaCard);
        } else {
            view.displayMessage("카드정보를 찾을수 없습니다.");
        }
    }

    public void updateVgaCard(int vgaNum, String name, String brand, int mhz, int stream, int power, int port, int pan, int price) {
        store.updateVgaCard(vgaNum, name, brand, mhz,stream,power,port,pan,price);
        view.displayMessage("카드정보가 수정되었습니다.");
    }

    public void deleteVgaCard(int vganum) {
        store.deleteVgaCard(vganum);
        view.displayMessage("카드정보가 삭제되었습니다.");
    }

    public void getAllVgaCard() {
        store.getAllVgaCards();
        view.displayMessage("모든 카드정보를 확인하였습니다.");
    }
}
