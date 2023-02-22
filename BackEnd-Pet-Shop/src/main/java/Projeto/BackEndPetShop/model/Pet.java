package Projeto.BackEndPetShop.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
public class Pet implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,  updatable = false)
    private Long id;

    private String name;

    private String emailOwner;

    private String numberOwner;

    private String nameOwner;

    private String specie;

    private String race;

    private double height;

    private double weight;

    private String coatType;

    private String treatment;

    @Column(nullable = false, updatable = false)
    private String petCode;

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", emailOwner='" + emailOwner + '\'' +
                ", numberOwner='" + numberOwner + '\'' +
                ", nomeOwner='" + nameOwner + '\'' +
                ", specie='" + specie + '\'' +
                ", race='" + race + '\'' +
                ", height='" + height + '\'' +
                ", weight='" + weight + '\'' +
                ", coatType='" + coatType + '\'' +
                ", treatment='" + treatment + '\'' +
                ", petCode='" + petCode + '\'' +
                '}';
    }
}
