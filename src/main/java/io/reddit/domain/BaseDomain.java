package io.reddit.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

/**
 * Created by Prajesh on 21/1/2019.
 */

@MappedSuperclass
public class BaseDomain extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Date createdDate;
    private Date modifiedDate;

    @PreUpdate
    @PrePersist
    public void updateTimestamps() {
        modifiedDate = new Date();
        if (Objects.nonNull(createdDate)) {
            createdDate = new Date();
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }
}
