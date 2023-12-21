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
 public class EntityX {

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
     @OneToMany(mappedBy = "entityX")
     private List<EntityY> entityYS;
     @OneToMany(mappedBy = "entityX")
     private List<EntityZ> entityZS;
     @ManyToOne
     @JoinColumn(name = "entity_W_id")
     private EntityW entityW;
     @ManyToOne
     @JoinColumn(name = "entity_V_id")
     private EntityV entityV;
     @ManyToOne
     @JoinColumn(name = "entity_U_id")
     private EntityU entityU;
     @ManyToOne
     @JoinColumn(name = "entity_T_id")
     private EntityT entityT;
     
 }


