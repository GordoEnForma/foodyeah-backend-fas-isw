package com.paulsoft.foodyeah.persistence.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "ordenes")
public class Orden {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_orden")
    private Long idOrden;

    private Usuario usuario;

    private List<DetallesOrden> detallesOrdenes;

    @Column(name = "fecha_orden")
    private LocalDate fechaOrden;
    @Column(name="hora_orden")
    private LocalTime horaOrden;

    @Column(name = "precio_total")
    private Double precioTotal;

    public Long getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(Long idOrden) {
        this.idOrden = idOrden;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<DetallesOrden> getDetallesOrdenes() {
        return detallesOrdenes;
    }

    public void setDetallesOrdenes(List<DetallesOrden> detallesOrdenes) {
        this.detallesOrdenes = detallesOrdenes;
    }

    public LocalDate getFechaOrden() {
        return fechaOrden;
    }

    public void setFechaOrden(LocalDate fechaOrden) {
        this.fechaOrden = fechaOrden;
    }

    public LocalTime getHoraOrden() {
        return horaOrden;
    }

    public void setHoraOrden(LocalTime horaOrden) {
        this.horaOrden = horaOrden;
    }

    public Double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(Double precioTotal) {
        this.precioTotal = precioTotal;
    }
}
