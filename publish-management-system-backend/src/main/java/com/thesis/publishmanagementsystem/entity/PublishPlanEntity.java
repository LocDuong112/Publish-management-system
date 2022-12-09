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
public class PublishPlanEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToOne
    @JoinColumn(name = "chapter_id", referencedColumnName = "id")
    private ChapterEntity chapter;

    @ManyToOne
    @JoinColumn(name = "admin_id", nullable = false)
    private AdminEntity adminEntity;

    @OneToMany(mappedBy = "publishPlan")
    private List<EventEntity> eventEntityList;
}
