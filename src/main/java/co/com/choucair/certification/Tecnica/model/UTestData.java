package co.com.choucair.certification.Tecnica.model;

public class UTestData {
    public UTestData(String strNombre, String strApellido,String strEmail, String strLenguaje,
                     /*Registro2*/
                     String strCiudad, Integer intCodigo, String srtPais,
                     String strDispositivo, String strConfirmarCon, String strContrasena, String strVersion,String StrHome){
        this.strNombre = strNombre;
        this.strApellido = strApellido;
        this.strEmail = strEmail;
        this.strLenguaje = strLenguaje;
        this.strCiudad = strCiudad;
        this.intCodigo = intCodigo;
        this.srtPais = srtPais;
        this.strDispositivo = strDispositivo;
        this.strConfirmarCon = strConfirmarCon;
        this.strVersion = strVersion;
        this.strContrasena = strContrasena;
        this.StrHome = StrHome;
    }

    public String getStrApellido() {
        return strApellido;
    }

    public void setStrApellido(String strApellido) {
        this.strApellido = strApellido;
    }

    public String getStrEmail() {
        return strEmail;
    }

    public void setStrEmail(String strEmail) {
        this.strEmail = strEmail;
    }

    public String getStrLenguaje() {
        return strLenguaje;
    }

    public void setStrLenguaje(String strLenguaje) {
        this.strLenguaje = strLenguaje;
    }

    public String getStrNombre() {
        return strNombre;
    }

    public void setStrNombre(String strNombre) {
        this.strNombre = strNombre;
    }

    private String strApellido;
    private String strEmail;
    private String strLenguaje;
    private String strNombre;

/*Registro 2*/
    private String strCiudad;

    public String getStrCiudad() {
        return strCiudad;
    }

    public void setStrCiudad(String strCiudad) {
        this.strCiudad = strCiudad;
    }

    public Integer getIntCodigo() {
        return intCodigo;
    }

    public void setIntCodigo(Integer intCodigo) {
        this.intCodigo = intCodigo;
    }

    public String getSrtPais() {
        return srtPais;
    }

    public void setSrtPais(String srtPais) {
        this.srtPais = srtPais;
    }

    public String getStrDispositivo() {
        return strDispositivo;
    }

    public void setStrDispositivo(String strDispositivo) {
        this.strDispositivo = strDispositivo;
    }

    public String getStrConfirmarCon() {
        return strConfirmarCon;
    }

    public void setStrConfirmarCon(String strConfirmarCon) {
        this.strConfirmarCon = strConfirmarCon;
    }



    private Integer intCodigo;
    private String srtPais;
    private String strDispositivo;
    private String strConfirmarCon;

    public String getStrVersion() {
        return strVersion;
    }

    public void setStrVersion(String strVersion) {
        this.strVersion = strVersion;
    }

    private String strVersion;

    public String getStrHome() {
        return StrHome;
    }

    public void setStrHome(String strHome) {
        StrHome = strHome;
    }

    private String StrHome;
    private String strContrasena;

    public String getStrContrasena() {
        return strContrasena;
    }

    public void setStrContrasena(String strContrasena) {
        this.strContrasena = strContrasena;
    }


}
