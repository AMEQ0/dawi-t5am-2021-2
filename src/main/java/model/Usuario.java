package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name="tb_usuarios")

public class Usuario {
	
	@Id
	@Column(name = "cod_usua")
	private int codigo;
	@Column(name = "nom_usua")
	private String nombre;
	@Column(name = "ape_usua")
	private String apellido;
	@Column(name = "usr_usua")
	private String usuario;
	@Column(name = "cla_usua")
	private String clave;
	@Column(name = "fna_usua")
	private String fnacim;
	@Column(name = "idtipo")
	private int estado;
	@Column(name = "est_usua")
	private int tipo;
	
	
	
	
	public Usuario() {
		super();
	}
	@Override
	public String toString() {
		return "Usuario [codigo=" + codigo + ", nombre=" + nombre + ", apellido=" + apellido + ", usuario=" + usuario
				+ ", clave=" + clave + ", fnacim=" + fnacim + ", estado=" + estado + ", tipo=" + tipo + "]";
	}
	public Usuario(int codigo, String nombre, String apellido, String usuario, String clave, String fnacim, int estado,
			int tipo) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.usuario = usuario;
		this.clave = clave;
		this.fnacim = fnacim;
		this.estado = estado;
		this.tipo = tipo;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getFnacim() {
		return fnacim;
	}
	public void setFnacim(String fnacim) {
		this.fnacim = fnacim;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	
	
}
