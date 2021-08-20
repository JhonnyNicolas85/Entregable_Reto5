package model.vo;

public class Consulta3VO_19 {
    private Integer ID_Proyecto;
    private String nombreapellido;

    public Consulta3VO_19(){
    }
    public Consulta3VO_19(Integer ID_Proyecto){
        this.ID_Proyecto = ID_Proyecto;
    }
    public Consulta3VO_19(Integer ID_Proyecto, String nombreapellido){
        this.ID_Proyecto = ID_Proyecto;
        this.nombreapellido = nombreapellido;
    }

    public Integer getID_Proyecto(){
        return ID_Proyecto;
    }
    public void SetID_Proyecto(Integer ID_Proyecto){
        this.ID_Proyecto = ID_Proyecto;
    }

    public String getnombreapellido() {
        return nombreapellido;
    }

    public void setnombreapellido(String nombreapellido) {
        this.nombreapellido = nombreapellido;
    }
    @Override
    public String toString() {
        return ID_Proyecto  +" " + nombreapellido;
    }
}
