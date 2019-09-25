package org.d3ifcool.submission;

public class Province {

    private String name;
    private String capital;
    private String description;
    private String dateProvince;
    private int photo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateProvince() {
        return dateProvince;
    }

    public void setDateProvince(String dateProvince) {
        this.dateProvince = dateProvince;
    }
}
