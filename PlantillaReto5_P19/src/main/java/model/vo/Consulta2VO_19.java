package model.vo;

public class Consulta2VO_19 {
    private Integer ID_Proyecto;
    private Integer Area_Max;

    public Consulta2VO_19(){
    }
    public Consulta2VO_19(Integer ID_Proyecto){
        this.ID_Proyecto = ID_Proyecto;
    }
    public Consulta2VO_19(Integer ID_Proyecto, Integer Area_Max){
        this.ID_Proyecto = ID_Proyecto;
        this.Area_Max = Area_Max;
    }

    public Integer getID_Proyecto(){
        return ID_Proyecto;
    }
    public void SetID_Proyecto(Integer ID_Proyecto){
        this.ID_Proyecto = ID_Proyecto;
    }

    public Integer getArea_Max() {
        return Area_Max;
    }

    public void setArea_Max(Integer Area_Max) {
        this.Area_Max = Area_Max;
    }
    
    @Override
    public String toString() {
        return ID_Proyecto + " " + Area_Max;
    }
}
