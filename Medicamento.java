import java.util.Date;
public class Medicamento{
    String Nombre;
    String Laboratorio;
    String PrincipioActivo;
    String Presentacion; // tabletas, cápsulas, jarabe, etc.
    double Dosis; 
    String Unidad; // mg, ml, g
    Date FechaVencimiento;
    String Lote;
    String Categoria; // analgésico, antibiótico, antihistamínico, etc.
    int Cantidad;
    double Precio;

//Constructor recibe los datos cuando se crea el objeto
public Medicamento(String Nombre, String Laboratorio,
                       String PrincipioActivo, String Presentacion,
                       double Dosis, String Unidad,Date FechaVencimiento, String Lote,
                       String Categoria, int Cantidad,double Precio) {
    this.Nombre = Nombre;
    this.Laboratorio = Laboratorio;
    this.PrincipioActivo = PrincipioActivo;
    this.Presentacion = Presentacion;
    this.Dosis = Dosis;
    this.Unidad = Unidad;
    this.FechaVencimiento =FechaVencimiento;
    this.Lote = Lote;
    this.Categoria = Categoria;
    this.Cantidad = Cantidad;
    this.Precio = Precio;
    }

// getters - setters (agregar - modificar valores)
public String getNombre() {
    return Nombre;
}
public void setNombre(String Nombre) {
    this.Nombre = Nombre;
}

// Laboratorio
public String getLaboratorio() {
    return Laboratorio;
}
public void setLaboratorio(String Laboratorio) {
    this.Laboratorio = Laboratorio;
}

// Principio Activo
public String getPrincipioActivo() {
    return PrincipioActivo;
}
public void setPrincipioActivo(String PrincipioActivo) {
    this.PrincipioActivo = PrincipioActivo;
}

// Presentación
public String getPresentacion() {
    return Presentacion;
}
public void setPresentacion(String Presentacion) {
    this.Presentacion = Presentacion;
}

// Dosis
public double getDosis() {
    return Dosis;
}
public void setDosis(double Dosis) {
    this.Dosis = Dosis;
}

// Unidad
public String getUnidad() {
    return Unidad;
}
public void setUnidad(String Unidad) {
    this.Unidad = Unidad;
}

// Fecha de Vencimiento
public Date getFechaVencimiento() {
    return FechaVencimiento;
}

// Lote 
public String getLote() {
    return Lote;
}

// Categoría
public String getCategoria() {
    return Categoria;
}
public void setCategoria(String Categoria) {
    this.Categoria = Categoria;
}

// Cantidad
public int getCantidad() {
    return Cantidad;
}
public void setCantidad(int Cantidad) {
    this.Cantidad = Cantidad;
}

// Precio
public double getPrecio() {
    return Precio;
}
public void setPrecio(double Precio) {
    this.Precio = Precio;
}

public void mostrarInfo(){
    System.out.println("===== INFORMACIÓN DEL MEDICAMENTO =====");
    System.out.println("Nombre: " + Nombre);
    System.out.println("Laboratorio: " + Laboratorio);
    System.out.println("Principio Activo: " + PrincipioActivo);
    System.out.println("Presentación: " + Presentacion);
    System.out.println("Dosis: " + Dosis + " " + Unidad);
    System.out.println("Fecha de Vencimiento: " + FechaVencimiento);
    System.out.println("Lote: " + Lote);
    System.out.println("Categoría: " + Categoria);
    System.out.println("Cantidad: " + Cantidad);
    System.out.println("Precio: $" + Precio);
}

public void vender(int unidadesVendidas) {
      if (unidadesVendidas <= Cantidad) {
        Cantidad = Cantidad - unidadesVendidas;
        System.out.println("Venta realizada.");
    } else {
        System.out.println("No hay suficientes unidades disponibles.");
    }
}

public static void main(String[] args){
  Medicamento m1 = new Medicamento(
    "Dolex",
        "MK",
        "Acetaminofén",
        "Tabletas",
        500,
        "mg",
        new Date(),
        "L001",
        "Analgésico",
        100,
        1500
    );
        m1.mostrarInfo();
m1.vender(20);

    System.out.println("Stock restante: " + m1.getCantidad());

}
}