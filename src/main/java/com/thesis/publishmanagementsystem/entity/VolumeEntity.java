package com.thesis.publishmanagementsystem.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CollectionId;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Data
public class VolumeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "comic_id", nullable = false)
    private Long comic_id;

    @Column(name = "price")
    private String price;

    @ManyToOne
    @JoinColumn(name = "promotion_id")
    private Long promotion_id;
}
