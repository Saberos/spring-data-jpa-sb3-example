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
 public class EntityT {

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
     @OneToMany(mappedBy = "entityT")
     private List<EntityU> entityUS;
     @OneToMany(mappedBy = "entityT")
     private List<EntityV> entityVS;
     @OneToMany(mappedBy = "entityT")
     private List<EntityW> entityWS;
     @OneToMany(mappedBy = "entityT")
     private List<EntityX> entityXS;
     @ManyToOne
     @JoinColumn(name = "entity_S_id")
     private EntityS entityS;
     @ManyToOne
     @JoinColumn(name = "entity_R_id")
     private EntityR entityR;
     @ManyToOne
     @JoinColumn(name = "entity_Q_id")
     private EntityQ entityQ;
     @ManyToOne
     @JoinColumn(name = "entity_P_id")
     private EntityP entityP;
     
 }


