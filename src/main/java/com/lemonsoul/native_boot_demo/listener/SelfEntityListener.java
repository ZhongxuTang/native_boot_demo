package com.lemonsoul.native_boot_demo.listener;

import com.lemonsoul.native_boot_demo.entity.BaseEntity;
import jakarta.persistence.PostLoad;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

import java.util.Date;

/**
 * @author tzx
 */
public class SelfEntityListener<T extends BaseEntity>{

    @PrePersist
    public void beforePersist(T entity) {
        if (entity == null){
            return;
        }
        entity.setCreateTime(new Date());
        entity.setUpdateTime(new Date());

        // 在实体保存之前执行一些逻辑
    }

    @PreUpdate
    public void beforeUpdate(T entity) {
        if (entity == null){
            return;
        }
        entity.setUpdateTime(new Date());
        // 在实体更新之前执行一些逻辑
    }

    @PostLoad
    public void afterLoad(T entity) {
        // 在实体从数据库加载之后执行一些逻辑
    }
}
