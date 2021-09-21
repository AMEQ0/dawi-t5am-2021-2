package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="tb_productos") 
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Producto {
	
	@Id
	private String idprod;
	private String descrcipcion;
	private int stock;
	private double precio;
	private int idcategoria;
	private int estado;

	
	
	
}
