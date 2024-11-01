// моя реализация
package bikeproject;

interface RoadParts {
    final String terrain = "track_racing";

    public String getTyreWidth();

    public void setTyreWidth(String newValue);
    
    public String getTyreHeight();
    
    public void setTyreHeight(String newValue);
}
