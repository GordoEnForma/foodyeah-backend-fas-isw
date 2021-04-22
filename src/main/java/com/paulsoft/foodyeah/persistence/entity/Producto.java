package com.paulsoft.foodyeah.persistence.entity;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProducto;

    @ManyToOne
    @JoinColumn(name = "id_categoria",insertable = false,updatable = false)
    @Column(name ="categoria_producto")
    private CategoriaProducto categoriaProducto;

    @OneToMany(mappedBy = "producto")
    private List<DetallesOrden> detallesOrdenes;

    @Column(name = "nombre_producto")
    private String nombreProducto;

    @Column(name = "precio_producto")
    private Double precioProducto;

    private Byte stock;

    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    public CategoriaProducto getCategoriaProducto() {
        return categoriaProducto;
    }

    public void setCategoriaProducto(CategoriaProducto categoriaProducto) {
        this.categoriaProducto = categoriaProducto;
    }

    public List<DetallesOrden> getDetallesOrdenes() {
        return detallesOrdenes;
    }

    public void setDetallesOrdenes(List<DetallesOrden> detallesOrdenes) {
        this.detallesOrdenes = detallesOrdenes;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(Double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public Byte getStock() {
        return stock;
    }

    public void setStock(Byte stock) {
        this.stock = stock;
    }
}
