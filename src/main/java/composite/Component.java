package composite;

public abstract class Component {
    private String description;

    public Component(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract String getComponent();
}
