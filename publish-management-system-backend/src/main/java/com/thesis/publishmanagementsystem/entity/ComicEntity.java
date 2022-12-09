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
@Table(name = "comic")
public class ComicEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "country_origin")
    private String countryOrigin;

    @Column(name = "read_platorm")
    private String readPlatform;

    @Column(name = "published")
    private boolean published;

    @Column(name = "country_published")
    private String countryPublished;

    @OneToMany(mappedBy = "comic")
    private List<AuthorComicEntity> authorComicEntityList;

    @ManyToOne
    @JoinColumn(name = "type_id", nullable = false)
    private TypeEntity type;
}
