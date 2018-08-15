package Sim_Pack;

public class Coordinates {
    private int longitude;
    private int latitude;
    private int height;

    public Coordinates(int longitude, int latitude, int height)
    {
        this.longitude = longitude;
        this.latitude = latitude;

        if(this.height > 100) {
            this.height = 100;
        }
        else if (this.height < 0) {
            this.height = 0;
        }
        else this.height = height;
    }

    public int getLongitude() {

        return this.longitude;
    }

    public int getLatitude() {
        return this.latitude;
    }

    public int getHeight() {
        return this.height;
    }

    public void setLongitude(int newLong) {

        this.longitude += newLong;
    }

    public void setLatitude(int newLati) {
        this.latitude += newLati;
    }

    public void setHeight(int newHeight) {
        this.height += newHeight;
    }
}