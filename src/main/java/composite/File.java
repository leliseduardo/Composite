package composite;

public class File extends Component {
    private String name;

    public File(String description, String name) {
        super(description);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComponent() {
        return "Directory (name): " + this.name + "description: " + this.getDescription() + "\n";
    }
}
