package com.thesis.publishmanagementsystem.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Data
@Table(name = "chapter")
public class ChapterEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "volume_id")
    private VolumeEntity volume;

    @OneToMany(mappedBy = "chapter")
    private List<PageEntity> pageEntityList;

    @OneToOne(mappedBy = "chapter")
    private PublishPlanEntity publishPlan;
}
