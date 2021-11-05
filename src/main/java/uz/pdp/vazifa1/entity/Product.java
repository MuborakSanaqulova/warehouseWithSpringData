package uz.pdp.vazifa1.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private boolean active = true;

    @ManyToOne
    private Category category;

    @OneToOne
    private Attachment attachment;

    @ManyToOne
    private Measurement measurement;

    @JsonIgnore
    private String code= UUID.randomUUID().toString();

}
