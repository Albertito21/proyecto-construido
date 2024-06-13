package Acceso_Datos;

public class Conexion {
    private String driver = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://p1434.use1.mysecurecloudhost.com:3306/estudiantedb";
    private String user = "eliqsv_estudianteDB";
    private String pass = "esfe.2024";

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
