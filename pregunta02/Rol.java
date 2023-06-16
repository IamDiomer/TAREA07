package semana10.pregunta02;

public class Rol {
    private String nombre;
    private PermisoRol permisoRol[];
    private int indice;

    public Rol() {
        this.permisoRol = new PermisoRol[3];
        this.indice = 0;
    }

    public Rol(String nombre) {
        this.nombre = nombre;
    }

    public void agregarPermisoRol(PermisoRol permisoRol) {
        this.permisoRol[this.indice] = permisoRol;
        this.indice++;
    }

    public void listarPermisoRol() {
        for (int i=0; i<this.indice; i++) {
            System.out.println(this.permisoRol[i].getRol().getNombre()+" "+this.permisoRol[i].getPermiso().getNombre());
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
