// моя реализация
package bikeproject;

interface MountainParts {
    final String TERRAIN = "off_road"; // константа 

    public String getSuspension();

    public void setSuspension(String newValue);
    
    public String getType();
    
    public void setType(String newValue);
}
