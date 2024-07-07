package composite;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Component {

    private List<Component> components;

    public Directory(String description) {
        super(description);
        this.components = new ArrayList<Component>();
    }

    public void addComponent(Component component) {
        this.components.add(component);
    }

    public String getComponent() {
        String output = "";
        output = "Directory: " + this.getDescription() + "\n";
        for (Component component : components) {
            output += component.getComponent();
        }
        return output;
    }
}
