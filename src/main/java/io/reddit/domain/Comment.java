package io.reddit.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Created by Prajesh on 21/1/2019.
 */

@EqualsAndHashCode(callSuper = true)
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
