package com.formacionbdi.springboot.app.commons.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@Table(name = "`tarjetacredito`")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TarjetaCredito {

   @Id
   @Column(name = "id")
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long Id;

   @Column(name = "titular", length = 50, unique = false)
   private String titular;

   
   @Column(name = "numerotarjeta", length = 50, unique = true)
   private String numerotarjeta;

   @Column(name = "fecha_expiracion", length = 5)
   private String fechaExpiracion;

   @Column(name = "cvv", length = 3)
   private String cvv;
   
}