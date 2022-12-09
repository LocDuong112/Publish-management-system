package com.thesis.publishmanagementsystem.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CollectionId;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Data
@Table(name = "volume")
public class VolumeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "comic_id", nullable = false)
    private Long comic_id;

    @Column(name = "price")
    private String price;

    @OneToMany(mappedBy = "volumeEntity")
    private List<PromotionVolumeEntity> promotionVolumeEntityList;

    @OneToMany(mappedBy = "volume")
    private List<ChapterEntity> chapterEntityList;
}
