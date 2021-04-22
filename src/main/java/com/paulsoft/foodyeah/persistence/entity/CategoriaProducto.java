package com.paulsoft.foodyeah.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "categorias_productos")
public class CategoriaProducto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_cateogoria_producto")
    private Long idCategoriaProducto;

    @OneToMany(mappedBy = "categoriaProducto")
    private List<Producto> productos;

    @Column(name = "nombre_categoria")
    private String nombreCategoriaProducto;

    @Column(name = "descripcion_categoria")
    private String descripcionCategoriaProducto;

    public Long getIdCategoriaProducto() {
        return idCategoriaProducto;
    }

    public void setIdCategoriaProducto(Long idCategoriaProducto) {
        this.idCategoriaProducto = idCategoriaProducto;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public String getNombreCategoriaProducto() {
        return nombreCategoriaProducto;
    }

    public void setNombreCategoriaProducto(String nombreCategoriaProducto) {
        this.nombreCategoriaProducto = nombreCategoriaProducto;
    }

    public String getDescripcionCategoriaProducto() {
        return descripcionCategoriaProducto;
    }

    public void setDescripcionCategoriaProducto(String descripcionCategoriaProducto) {
        this.descripcionCategoriaProducto = descripcionCategoriaProducto;
    }
}
