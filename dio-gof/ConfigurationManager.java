class ConfigurationManager {
    private static ConfigurationManager instance;
    private String appName;
    private String version;
    private String environment;

    private ConfigurationManager() {
        this.appName = "E-Commerce System";
        this.version = "1.0.0";
        this.environment = "development";
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            synchronized (ConfigurationManager.class) {
                if (instance == null) {
                    instance = new ConfigurationManager();
                }
            }
        }
        return instance;
    }

    public String getAppInfo() {
        return String.format("%s v%s (%s)", appName, version, environment);
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }
}
