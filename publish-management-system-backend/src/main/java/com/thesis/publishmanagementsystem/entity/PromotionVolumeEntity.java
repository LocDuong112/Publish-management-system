package com.thesis.publishmanagementsystem.entity;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Data
@Table(name = "promotion_volume")
public class PromotionVolumeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "promotion_id", nullable = false)
    private PromotionEntity promotionEntity;

    @ManyToOne
    @JoinColumn(name = "volume_id", nullable = false)
    private VolumeEntity volumeEntity;
}
