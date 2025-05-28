package lesson_29;

public class BusDriver {
    private static int idCounter = 101;
    private final int id;
    private Autobus autobus;
    private String name;
    private String license;

    public BusDriver(String name, String license) {
        this.name = name;
        this.license = license;
        this.id = idCounter;
        idCounter++;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("BusDriver: {");
        sb.append("\n   id=").append(id);
        sb.append(",\n   name='").append(name).append('\'');
        sb.append(",\n   license='").append(license).append('\'');
        sb.append("}");
        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public void setAutobus(Autobus autobus) {
        this.autobus = autobus;
    }
}
