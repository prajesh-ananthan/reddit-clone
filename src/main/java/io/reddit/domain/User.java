package io.reddit.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Prajesh on 21/1/2019.
 */

@Data
@NoArgsConstructor
@Entity
@Table(name = "user")
public class User {
}
