package org.cresplanex.api.state.common.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Version;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Getter @Setter @ToString
public abstract class BaseEntity<T extends BaseEntity<T>> implements Cloneable {

    abstract public void setId(String id);
    abstract public String getId();

    @Version
    @Column(name = "version", nullable = false)
    private Integer version;

    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime createdAt;

    @CreatedBy
    @Column(updatable = false)
    private String createdBy;

    @LastModifiedDate
    @Column(insertable = false)
    private LocalDateTime updatedAt;

    @LastModifiedBy
    @Column(insertable = false)
    private String updatedBy;

    @Override
    @SuppressWarnings("unchecked")
    public T clone() {
        try {
            T cloned = (T) super.clone();
            cloned.setId(null);
            cloned.setVersion(null);
            cloned.setCreatedBy(null);
            cloned.setCreatedAt(null);
            cloned.setUpdatedBy(null);
            cloned.setUpdatedAt(null);
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
