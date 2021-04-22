package com.paulsoft.foodyeah.persistence.entity;

import org.hibernate.boot.registry.selector.spi.StrategySelectionException;

import javax.persistence.*;

@Entity
@Table(name="detalles_ordenes")
public class DetallesOrden {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetallesOrden;

    @Column(name = "id_orden")
    private Long idOrden;

    private Orden orden;

    @Column(name = "id_producto")
    private Long idProducto;

    private Producto producto;

    private Byte cantidad;

    @Column(name = "precio_unitario")
    private Double precioUnitario;

    @Column(name = "precio_total")
    private Double precioTotal;

    public Long getIdDetallesOrden() {
        return idDetallesOrden;
    }

    public void setIdDetallesOrden(Long idDetallesOrden) {
        this.idDetallesOrden = idDetallesOrden;
    }

    public Long getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(Long idOrden) {
        this.idOrden = idOrden;
    }

    public Orden getOrden() {
        return orden;
    }

    public void setOrden(Orden orden) {
        this.orden = orden;
    }

    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Byte getCantidad() {
        return cantidad;
    }

    public void setCantidad(Byte cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(Double precioTotal) {
        this.precioTotal = precioTotal;
    }
}
