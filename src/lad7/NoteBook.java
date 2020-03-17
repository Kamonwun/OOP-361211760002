package lad7;

public class NoteBook {
    private String bran;
    private String model;
    private String cpu;
    private String gpu;
    private String display;
    private String hdd;
    private String os;
    private double price;

    //constructor

    public NoteBook(String bran, String model, String cpu, String gpu, String display, String hdd, String os, double  price) {
        this.bran = bran;
        this.model = model;
        this.cpu = cpu;
        this.gpu = gpu;
        this.display = display;
        this.hdd = hdd;
        this.os = os;
        this.price = price;
    }


    //getter and setter

    public String getBrang() {
        return bran;
    }

    public void setBrang(String brang) {
        this.bran = brang;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getHdd() {
        return hdd;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    //toString() ->

    @Override
    public String toString() {
        return "NoteBook{" +
                "brang='" + bran + '\'' +
                ", model='" + model + '\'' +
                ", cpu='" + cpu + '\'' +
                ", gpu='" + gpu + '\'' +
                ", display='" + display + '\'' +
                ", hdd='" + hdd + '\'' +
                ", os='" + os + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
