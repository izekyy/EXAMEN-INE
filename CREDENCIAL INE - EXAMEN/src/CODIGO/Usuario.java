package CODIGO;
public class Usuario {//DATOS DE LA PERSONA

    private String Nombre;
    private String ApellidoP;
    private String ApellidoM;
    private String Calle;
    private String NoCasa;
    private String CP;
    private String Colonia;
    private String Ciudad;
    private String Estado;

    public Usuario(String Nombre, 
            String ApellidoP, 
            String ApellidoM, 
            String Calle, 
            String NoCasa, 
            String CP, 
            String Colonia, 
            String Ciudad, 
            String Estado){
        this.Nombre = Nombre;
        this.ApellidoP = ApellidoP;
        this.ApellidoM = ApellidoM;
        this.Calle = Calle;
        this.NoCasa = NoCasa;
        this.CP = CP;
        this.Colonia = Colonia;
        this.Ciudad = Ciudad;
        this.Estado = Estado;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidoP() {
        return ApellidoP;
    }

    public void setApellidoP(String ApellidoP) {
        this.ApellidoP = ApellidoP;
    }

    public String getApellidoM() {
        return ApellidoM;
    }

    public void setApellidoM(String ApellidoM) {
        this.ApellidoM = ApellidoM;
    }


    public String getCalle() {
        return Calle;
    }

    public void setCalle(String Calle) {
        this.Calle = Calle;
    }

    public String getNCasa() {
        return NoCasa;
    }

    public void setNCasa(String NCasa) {
        this.NoCasa = NCasa;
    }

    public String getCodigoP() {
        return CP;
    }

    public void setCodigoP(String CodigoP) {
        this.CP = CodigoP;
    }

    public String getColonia() {
        return Colonia;
    }

    public void setColonia(String Colonia) {
        this.Colonia = Colonia;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    

}