package pe.edu.pucp.gtics.lab1221.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "plataformas", schema = "gameshop3", catalog = "")
public class Platforms {
    @GeneratedValue(strategy = GenerationType.IDENTITY) //dice que el id es autoincremental
    @Id
    @Column(name = "idplataforma")
    private int idplataforma;
    @Basic
    @Column(name = "nombre")
    private String nombre;
    @Basic
    @Column(name = "descripcion")
    private String descripcion;

    public int getIdplataforma() {
        return idplataforma;
    }

    public void setIdplataforma(int idplataforma) {
        this.idplataforma = idplataforma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Platforms that = (Platforms) o;
        return idplataforma == that.idplataforma && Objects.equals(nombre, that.nombre) && Objects.equals(descripcion, that.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idplataforma, nombre, descripcion);
    }
}
