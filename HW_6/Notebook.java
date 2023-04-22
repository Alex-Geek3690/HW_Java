package H_W.HW_6;



public class Notebook {
    private String manufacturer;
    private Integer ram;
    private Integer hdd;
    private String os;
    private String color;

    public Notebook(String manufacturer, String color, Integer ram, Integer hdd, String os){
        this.manufacturer = manufacturer;
        this.color = color;
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public Integer getRam() {
        return ram;
    }
    public void setRam(Integer ram) {
        this.ram = ram;
    }
    public Integer getHdd() {
        return hdd;
    }
    public void setHdd(Integer hdd) {
        this.hdd = hdd;
    }
    public String getOs() {
        return os;
    }
    public void setOs(String os) {
        this.os = os;
    }
    @Override
    public String toString() {
        return String.format("Производитель: %s, цвет: %s, ОЗУ: %d, объем ЖД: %d, ОС: %s", manufacturer, color, ram, hdd, os);
    }



}
