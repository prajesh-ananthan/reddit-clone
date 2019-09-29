package io.reddit.domain;

/**
 * @author Prajesh Ananthan
 * Created on 29/9/2019.
 */

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
@Setter
@Getter
@EntityListeners(AuditingEntityListener.class)
public abstract class Auditable {

  @CreatedBy
  private String createdBy;

  @CreatedDate
  private LocalDateTime creationDate;

  @LastModifiedBy
  private String lastModifiedBy;

  @LastModifiedDate
  private LocalDateTime lastModifiedDate;

}