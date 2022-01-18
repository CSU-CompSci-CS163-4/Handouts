/**
 * @version 20210913
 */
public class Debugging {
    
    public static void main(String[] args) {
        DebugDataContainer container = new DebugDataContainer("Doctors", 13);

        System.out.println(container.getData());
        System.out.println(container.getValue());
        
      //  container.setValue("Companions");
        container.setData("Companions");

        System.out.println(container.getData());
        System.out.println(container.getValue());
        
        
        
    }
}
