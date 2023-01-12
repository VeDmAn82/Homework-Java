package Homework6;

public class Laptop {
    /**
     * Марка ноутбука
     */
    private String brand;
    /**
     * Оперативная память
     */
    private int ram;
    /**
     * Объем жесткого диска
     */
    private int ssd;
    /**
     * Операционная система
     */
    private String operatingSystem;
    /**
     * Цвет
     */
    private String color;

    public Laptop(String brand, int ram, int ssd, String operatingSystem, String color) {
        this.brand = brand;
        this.ram = ram;
        this.ssd = ssd;
        this.operatingSystem = operatingSystem;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }
    
    public int getRam() {
        return ram;
    }

    public int getSsd() {
        return ssd;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Laptop: (" +
                "brand='" + brand + '\'' +
                ", ram=" + ram +
                ", ssd=" + ssd +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", color='" + color + '\'' +
                ')';
    }
}
