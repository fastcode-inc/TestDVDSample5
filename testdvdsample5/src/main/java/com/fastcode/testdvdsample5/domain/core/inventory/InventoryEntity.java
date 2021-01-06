package com.fastcode.testdvdsample5.domain.core.inventory;

import com.fastcode.testdvdsample5.domain.core.abstractentity.AbstractEntity;
import com.fastcode.testdvdsample5.domain.core.film.FilmEntity;
import java.time.*;
import javax.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "INVENTORY")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
public class InventoryEntity extends AbstractEntity {

    @Id
    @EqualsAndHashCode.Include
    @Column(name = "INVENTORY_ID", nullable = false)
    private Integer inventoryId;

    @Basic
    @Column(name = "STORE_ID", nullable = true)
    private Short storeId;

    @Basic
    @Column(name = "LAST_UPDATE", nullable = false)
    private LocalDateTime lastUpdate;

    @ManyToOne
    @JoinColumn(name = "FILM_ID")
    private FilmEntity film;
}
