package io.reddit.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Created by Prajesh on 21/1/2019.
 */

@Data
@NoArgsConstructor
@Entity
@Table(name = "comment")
public class Comment extends BaseDomain {
    @Column(name = "body")
    private String body;

    @ManyToOne
    private Link link;
}
