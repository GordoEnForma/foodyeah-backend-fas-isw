package com.paulsoft.foodyeah.persistence.entity;

import com.fasterxml.jackson.annotation.JacksonInject;

import javax.persistence.*;

@Entity
@Table(name = "tarjetas")
public class Tarjeta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_tarjeta")
    private Long idTarjeta;

    @Column(name="id_usuario")
    private Long idUsuario;

    @ManyToOne
    @JoinColumn(name = "id_usuario",updatable = false,insertable = false)
    private Usuario usuario;

    @Column(name = "tipo_tarjeta")
    private Boolean tipoTarjeta;


    @Column(name = "numero_tarjeta")
    private Long numeroTarjeta;
    private Byte cvi;
    @Column(name = "dia_expiracion")
    private Byte diaExpiracion;
    @Column(name = "anio_expiracion")
    private Byte anioExpiracion;

    public Long getIdTarjeta() {
        return idTarjeta;
    }

    public void setIdTarjeta(Long idTarjeta) {
        this.idTarjeta = idTarjeta;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Long getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(Long numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public Byte getCvi() {
        return cvi;
    }

    public void setCvi(Byte cvi) {
        this.cvi = cvi;
    }

    public Byte getDiaExpiracion() {
        return diaExpiracion;
    }

    public void setDiaExpiracion(Byte diaExpiracion) {
        this.diaExpiracion = diaExpiracion;
    }

    public Byte getAnioExpiracion() {
        return anioExpiracion;
    }

    public void setAnioExpiracion(Byte anioExpiracion) {
        this.anioExpiracion = anioExpiracion;
    }

    public Boolean getTipoTarjeta() {
        return tipoTarjeta;
    }

    public void setTipoTarjeta(Boolean tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }
}
