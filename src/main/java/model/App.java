package model;

/**
 * a class to represent the Apps available to users
 * Name, Description, Color, DefaultStatus (Whether an App is added to a user by default), and link, and include these rows:
 */

public class App {

    private String name;
    private String description;
    private String color;
    private String defaultStatus;
    private String link;

    public App(String name, String description, String color, String defaultStatus, String link) {
        this.name = name;
        this.description = description;
        this.color = color;
        this.defaultStatus = defaultStatus;
        this.link = link;
    }

/*TODO model validation, not quite sure what that entails....*/

    public App() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDefaultStatus() {
        return defaultStatus;
    }

    public void setDefaultStatus(String defaultStatus) {
        this.defaultStatus = defaultStatus;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return "Apps{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", color='" + color + '\'' +
                ", defaultStatus=" + defaultStatus +
                ", link='" + link + '\'' +
                '}';
    }
}
