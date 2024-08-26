package com.lemonsoul.native_boot_demo.repository;

import com.lemonsoul.native_boot_demo.entity.NativeUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author tzx
 */
@Repository
public interface NativeUserRepository extends JpaRepository<NativeUser, Long> {


}
