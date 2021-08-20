package model.vo;

public class Consulta1VO_19 {
    private Integer ID_Proyecto;
    private String Fecha_Inicio;
    private String Constructora;
    private String Serial_proyecto;

    public Consulta1VO_19(){
    }

    public Consulta1VO_19(Integer ID_Proyecto){
        this.ID_Proyecto = ID_Proyecto;
    }
    public Consulta1VO_19(Integer ID_Proyecto, String Fecha_Inicio){
        this.ID_Proyecto = ID_Proyecto;
        this.Fecha_Inicio = Fecha_Inicio;
    }
    public Consulta1VO_19(Integer ID_Proyecto, String Fecha_Inicio, String Constructora){
        this.ID_Proyecto = ID_Proyecto;
        this.Fecha_Inicio = Fecha_Inicio;
        this.Constructora = Constructora;
    }
    public Consulta1VO_19(Integer ID_Proyecto, String Fecha_Inicio, String Constructora, String Serial_proyecto){
        this.ID_Proyecto = ID_Proyecto;
        this.Fecha_Inicio = Fecha_Inicio;
        this.Constructora = Constructora;
        this.Serial_proyecto = Serial_proyecto;
    }

    public Integer getID_Proyecto(){
        return ID_Proyecto;
    }
    public void SetID_Proyecto(Integer ID_Proyecto){
        this.ID_Proyecto = ID_Proyecto;
    }

    public String getFecha_Inicio() {
        return Fecha_Inicio;
    }

    public void setFecha_Inicio(String Fecha_Inicio) {
        this.Fecha_Inicio = Fecha_Inicio;
    }

    public String getConstructora() {
        return Constructora;
    }

    public void setConstructora(String Constructora) {
        this.Constructora = Constructora;
    }
    
    public String getSerial_proyecto() {
        return Serial_proyecto;
    }

    public void setSerial_proyecto(String Serial_proyecto) {
        this.Serial_proyecto = Serial_proyecto;
    }
    @Override
    public String toString() {
        return ID_Proyecto + " "+ Fecha_Inicio + " " + Constructora + " " + Serial_proyecto;
    }
}
