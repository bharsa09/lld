package httpServer;

import lombok.Data;


public class Employee {

    private String name;
    private String role;

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        String nl = "\n";
        String indent = "   ";
        return "{" + nl
                + indent + "\"name\":\"" + escape(name) + "\"," + nl
                + indent + "\"role\":\"" + escape(role) + "\"" + nl
                + "}";
    }

    private String escape(String s) {
        if (s == null) return "";
        return s.replace("\\", "\\\\")
                .replace("\"", "\\\"")
                .replace("\n", "\\n")
                .replace("\r", "\\r");
    }
}
