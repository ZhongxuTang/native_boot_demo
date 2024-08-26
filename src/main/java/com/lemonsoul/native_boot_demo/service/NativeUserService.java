package com.lemonsoul.native_boot_demo.service;

import com.lemonsoul.native_boot_demo.entity.NativeUser;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @author tzx
 */
public interface NativeUserService {

    boolean createUser(NativeUser nativeUser);

    Page<NativeUser> page(Pageable pageable);
}
