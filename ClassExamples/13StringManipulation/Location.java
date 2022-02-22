/* This file is for inclass activity two */
class Location {
    private String name;
    private String latitude;
    private String longitude;

    public Location(String name, String latitude, String longitude) {
        setName(name); // let the methods handle the set incase they want to modify a value
        setLatitude(latitude);
        setLongitude(longitude);
    }

    public Location(String location) {
       // Student TODO here - Task Two, break the String up (see main in Inclass.java) into its parts
       // and then set name, latitude and longitude
    }

    public void setName(String name) { this.name = name;}
    public void setLongitude(String longitude) { this.longitude = longitude.toUpperCase();}
    public void setLatitude(String latitude) { this.latitude = latitude.toUpperCase();}
    public String getName() {return name;}
    public String getLongitude() { return longitude;}
    public String getLatitude() { return latitude;}

    
    public String toString() {
        return String.format("{name:%s, lat:%s, lon:%s}", name, latitude, longitude);
    }

  
}


