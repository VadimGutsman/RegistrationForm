package model;

public class Address {
    private String postalCode;
    private String cityName;
    private String streetName;
    private String flatNumber;
    private String houseNumber;

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public void setFlatNumber(String flatNumber) {
        this.flatNumber = flatNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCityName() {
        return cityName;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getFlatNumber() {
        return flatNumber;
    }

    public String getHouseNumber() {
        return houseNumber;
    }
}
