package introduction.ushtrimet;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Cinema {
    private String registerNumber;
    private String name;
    private String location;
    private String city;
    private int totalHalls = 1;
    private LocalDateTime createdAt = LocalDateTime.now();
    private LocalTime openTime = LocalTime.of(8, 0);
    private LocalTime closeTime = LocalTime.of(20, 0);
    private boolean active = true;
    private String contactNumber;
    private boolean threeD;
    private LocalDate registerDate = LocalDate.now();

    public Cinema(String registerNumber, String name, String city, String location) {
        this.registerNumber = registerNumber;
        this.name = name;
        this.city = city;
        this.location = location;
    }

    public Cinema(String registerNumber, String name, String location, String city,
                  int totalHalls, LocalTime openTime, LocalTime closeTime,
                  boolean active, String contactNumber, boolean threeD, LocalDate registerDate) {
        this.registerNumber = registerNumber;
        this.name = name;
        this.location = location;
        this.city = city;
        this.totalHalls = totalHalls;
        this.openTime = openTime;
        this.closeTime = closeTime;
        this.active = active;
        this.contactNumber = contactNumber;
        this.threeD = threeD;
        this.registerDate = registerDate;
    }

    public void setTotalHalls(int totalHalls) {
        if (totalHalls >= 1) {
            this.totalHalls = totalHalls;
        }
    }

    public int getTotalHalls() {
        return totalHalls;
    }

    public String getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(String registerNumber) {
        this.registerNumber = registerNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public LocalTime getOpenTime() {
        return openTime;
    }

    public void setOpenTime(LocalTime openTime) {
        this.openTime = openTime;
    }

    public LocalTime getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(LocalTime closeTime) {
        this.closeTime = closeTime;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public boolean isThreeD() {
        return threeD;
    }

    public void setThreeD(boolean threeD) {
        this.threeD = threeD;
    }

    public LocalDate getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(LocalDate registerDate) {
        this.registerDate = registerDate;
    }

    public boolean isOpen() {
        return LocalTime.now().isAfter(openTime) &&
                LocalTime.now().isBefore(closeTime);
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "registerNumber='" + registerNumber + '\'' +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", city='" + city + '\'' +
                ", totalHalls=" + totalHalls +
                ", openTime=" + openTime +
                ", closeTime=" + closeTime +
                ", active=" + active +
                ", contactNumber='" + contactNumber + '\'' +
                ", threeD=" + threeD +
                ", registerDate=" + registerDate +
                '}';
    }
}


















