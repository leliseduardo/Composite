package composite;

public class Folder {
    private Component content;

    public void setContent(Component content) {
        this.content = content;
    }

    public String getContent() {
        if (this.content == null) {
            throw new NullPointerException("Folder without content");
        }
        return this.content.getComponent();
    }
}
