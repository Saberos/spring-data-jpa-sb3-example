package com.example.demo.entities;

 import jakarta.persistence.Entity;
 import jakarta.persistence.Id;
 import jakarta.persistence.JoinColumn;
 import jakarta.persistence.ManyToMany;
 import jakarta.persistence.ManyToOne;
 import jakarta.persistence.OneToMany;
 import lombok.Getter;
 import lombok.Setter;

 import java.util.List;

 @Entity
 @Getter
 @Setter
 public class EntityE {

     @Id
     private Long id;

     private String a1;
     private String a2;
     private String a3;
     private String a4;
     private String a5;
     private String a6;
     private String a7;
     private String a8;
     private String a9;
     private String a10;
     private String a11;
     private String a12;
     private String a13;
     private String a14;
     private String a15;
     private String a16;
     private String a17;
     private String a18;
     private String a19;
     private String a20;
     private String a21;
     private String a22;
     private String a23;
     private String a24;
     private String a25;
     private String a26;
     private String a27;
     private String a28;
     private String a29;
     private String a30;
     @OneToMany(mappedBy = "entityE")
     private List<EntityF> entityFS;
     @OneToMany(mappedBy = "entityE")
     private List<EntityG> entityGS;
     @OneToMany(mappedBy = "entityE")
     private List<EntityH> entityHS;
     @OneToMany(mappedBy = "entityE")
     private List<EntityI> entityIS;
     @ManyToOne
     @JoinColumn(name = "entity_D_id")
     private EntityD entityD;
     @ManyToOne
     @JoinColumn(name = "entity_C_id")
     private EntityC entityC;
     @ManyToOne
     @JoinColumn(name = "entity_B_id")
     private EntityB entityB;
     @ManyToOne
     @JoinColumn(name = "entity_A_id")
     private EntityA entityA;
     
 }


