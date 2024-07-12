package mysubject;

public class VGADTO {

    private int vgaNum;
    private String name;
    private String brand;
    private int Mhz;
    private int stream;
    private int power;
    private int port;
    private int pan;
    private int price;

    public VGADTO(int vgaNum, String name, String brand, int mhz, int stream, int power, int port, int pan, int price) {
        this.vgaNum = vgaNum;
        this.name = name;
        this.brand = brand;
        this.Mhz = mhz;
        this.stream = stream;
        this.power = power;
        this.port = port;
        this.pan = pan;
        this.price = price;
    }

    public VGADTO() {

    }

    public int getVgaNum() {
        return vgaNum;
    }

    public void setVgaNum(int vgaNum) {
        this.vgaNum = vgaNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMhz() {
        return Mhz;
    }

    public void setMhz(int mhz) {
        this.Mhz = mhz;
    }

    public int getStream() {
        return stream;
    }

    public void setStream(int stream) {
        this.stream = stream;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public int getPan() {
        return pan;
    }

    public void setPan(int pan) {
        this.pan = pan;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "조회된 VGA 그래픽카드의 정보\n[" +
                "등록 번호 : " + vgaNum  +
                " 번]\n [모델 이름 = " + name +
                "]\n [제조 회사 =" + brand +
                "]\n [부스트 클럭 수치 = " + Mhz +
                "Mhz]\n [스트림프로세서의 개수 = " + stream +
                "개]\n [정격 파워 용량= " + power +
                "W]\n [전원 포트 개수 = " + port +
                "핀]\n [쿨링팬의 개수 = " + pan +
                "팬]\n [가격은 = " + price +
                "원]";
        }


    }


