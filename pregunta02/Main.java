package semana10.pregunta02;

public class Main {
    public static void main(String args[])
    {
        //Rol usuario = Rol();
        //Permiso permiso = Permiso();

        Rol rol = new Rol();
        rol.agregarPermisoRol(new PermisoRol(new Rol("Rol Usuario"), new Permiso("Agregar")));
        rol.agregarPermisoRol(new PermisoRol(new Rol("Rol Usuario"), new Permiso("Editar")));
        rol.agregarPermisoRol(new PermisoRol(new Rol("Rol Usuario"), new Permiso("Eliminar")));
        rol.listarPermisoRol();
    }
}
