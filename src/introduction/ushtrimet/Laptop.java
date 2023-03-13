package introduction.ushtrimet;

import java.time.LocalDate;

public class Laptop {
    private String serialNumber;
    private String producer;
    private String model;
    private int yearProduce = LocalDate.now().getYear();
    private byte screenSize = 14;
    private float weight = 2.1f;
    private boolean numPad;
    private boolean touchScreen;
    private boolean backlight;
    private String processor = "i7 gen 13";
    private int ram = 8;
    private int maxRam = 32;
    private String graphicCard = "Intel";
    private int hardDriveSize = 256;
    private String hardDriveType = "ssd";
    private LocalDate registerDate = LocalDate.now();

    public Laptop(String serialNumber, String model, String producer) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.producer = producer;
    }

    public Laptop(String serialNumber, String producer, String model,
                  byte screenSize, boolean numPad, String processor,
                  int ram, String graphicCard, int hardDriveSize, String hardDriveType) {
        this.serialNumber = serialNumber;
        this.producer = producer;
        this.model = model;
        this.screenSize = screenSize;
        this.numPad = numPad;
        this.processor = processor;
        this.ram = ram;
        this.graphicCard = graphicCard;
        this.hardDriveSize = hardDriveSize;
        this.hardDriveType = hardDriveType;
    }

    public Laptop(String serialNumber, String producer, String model,
                  int yearProduce, byte screenSize, float weight, boolean numPad,
                  boolean touchScreen, boolean backlight,
                  String processor, int ram, int maxRam, String graphicCard,
                  int hardDriveSize, String hardDriveType, LocalDate registerDate) {
        this.serialNumber = serialNumber;
        this.producer = producer;
        this.model = model;
        this.yearProduce = yearProduce;
        this.screenSize = screenSize;
        this.weight = weight;
        this.numPad = numPad;
        this.touchScreen = touchScreen;
        this.backlight = backlight;
        this.processor = processor;
        this.ram = ram;
        this.maxRam = maxRam;
        this.graphicCard = graphicCard;
        this.hardDriveSize = hardDriveSize;
        this.hardDriveType = hardDriveType;
        this.registerDate = registerDate;
    }

    public void setSerialNumber(String serialNumber) {
        if (serialNumber.length() >= 10) {
            this.serialNumber = serialNumber;
        }
    }
    public String getSerialNumber(){
        return serialNumber;
    }

    public void setRam(int ram){
        if (ram >= 0){
            this.ram = ram;
        }
    }

    public int getRam(){
        return ram;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearProduce() {
        return yearProduce;
    }

    public void setYearProduce(int yearProduce) {
        this.yearProduce = yearProduce;
    }

    public byte getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(byte screenSize) {
        this.screenSize = screenSize;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public boolean isNumPad() {
        return numPad;
    }

    public void setNumPad(boolean numPad) {
        this.numPad = numPad;
    }

    public boolean isTouchScreen() {
        return touchScreen;
    }

    public void setTouchScreen(boolean touchScreen) {
        this.touchScreen = touchScreen;
    }

    public boolean isBacklight() {
        return backlight;
    }

    public void setBacklight(boolean backlight) {
        this.backlight = backlight;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getMaxRam() {
        return maxRam;
    }

    public void setMaxRam(int maxRam) {
        this.maxRam = maxRam;
    }

    public String getGraphicCard() {
        return graphicCard;
    }

    public void setGraphicCard(String graphicCard) {
        this.graphicCard = graphicCard;
    }

    public int getHardDriveSize() {
        return hardDriveSize;
    }

    public void setHardDriveSize(int hardDriveSize) {
        this.hardDriveSize = hardDriveSize;
    }

    public String getHardDriveType() {
        return hardDriveType;
    }

    public void setHardDriveType(String hardDriveType) {
        this.hardDriveType = hardDriveType;
    }

    public LocalDate getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(LocalDate registerDate) {
        this.registerDate = registerDate;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "serialNumber='" + serialNumber + '\'' +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearProduce=" + yearProduce +
                ", screenSize=" + screenSize +
                ", weight=" + weight +
                ", numPad=" + numPad +
                ", touchScreen=" + touchScreen +
                ", backlight=" + backlight +
                ", processor='" + processor + '\'' +
                ", ram=" + ram +
                ", maxRam=" + maxRam +
                ", graphicCard='" + graphicCard + '\'' +
                ", hardDriveSize=" + hardDriveSize +
                ", hardDriveType='" + hardDriveType + '\'' +
                ", registerDate=" + registerDate +
                '}';
    }
}











