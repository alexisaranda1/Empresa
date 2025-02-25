public class Empleado {
    private String nombre;
    private String cargo;
    private Double salario;
    private Int anioExp;

    public Empleado(String nombre, String cargo, double salario, int anioExp){
        this.nombre= nombre;
        this.cargo = cargo;
        this.salario = salario;
        this.anioExp = anioExp; 
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setCargo(String cargo){
        this.cargo =  cargo;

    }
    public void setSalario(Double salario){
        this.salario = salario;

    }
    public void setAnioExp(Int anioExp){
        this.anioExp = anioExp;

    }
    public String getNombre(){
        return nombre;
    }
    public String getCargo(){
        return cargo;

    }
    public Double getSalario(){
        return salario;

    }
    public int getAnioExp(){
        return anioExp;

    }
    @Override
    public String toString(){
     return "Nombre: "+ this.nombre +" cargo: "+ cargo +" salario: "+ salario+ " años Experiencia: "+ anioExp;
    }
    
}