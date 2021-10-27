/**
 * @version 20210913
 */
public class DebugDataContainer {
    
    private double value = 0;
    private String data = "";
    
    public DebugDataContainer(String data, int value) {
        this.data = data;
        setValue(value);
    }
    
    public String getData() {
        return data;
    }
    
    public void setData(String data) {
        this.data = data;        
    }
    
    public void setValue(double value ) {
        this.value = value;
    }
    
    public double getValue() {
        return value;
    }
    
    
}
