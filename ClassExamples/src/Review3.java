import java.util.Arrays;

public class Review3 extends Review3Super {
    public static final int MY_VAL = 3;
    public static int counter = 0;

    private final String[] widgets;

    public Review3(String name, String[] widgets) { // constructor
        setName(name);
        this.widgets = widgets;
        counter++;
    }

    public String getWidget(int ID) {
        return widgets[ID];
    }

    public String toString() {
        return "{"+ super.toString() + ", widgets:" + 
                Arrays.toString(widgets) + "}";
    }

    public Review3 copy(){
        return new Review3(getName(), widgets);
    }
}
