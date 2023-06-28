package com.wheel_contrast_java.repository;

import com.wheel_contrast_java.entity.LogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author wangfeng
 * @version 1.0
 * @description: TODO
 * @date 2023/6/28 15:02
 */
@Repository
public interface LogRepository extends JpaRepository<LogEntity, Integer>, JpaSpecificationExecutor<LogEntity> {
    //条件查询
    List<LogEntity> findAllByUserIdAndIsDeleteFalse(Integer userId);

    LogEntity findByIdAndIsDeleteFalse(Integer id);

    @Transactional
    @Modifying
    @Query(value = "UPDATE log SET is_delete = true, update_time = CURRENT_TIMESTAMP where id = ?1", nativeQuery = true)
    void deleteLog(Integer id);
}
