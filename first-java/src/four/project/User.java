package four.project;

import java.util.Set;

public class User {
    private String name;
    private boolean active;
    private Set<String> roles;

    public User(boolean active, String name, Set<String> roles) {
        this.active = active;
        this.name = name;
        this.roles = roles;
    }

    public String getName() {
        return name;
    }

    public boolean isActive() {
        return active;
    }

    public Set<String> getRoles() {
        return roles;
    }
}
