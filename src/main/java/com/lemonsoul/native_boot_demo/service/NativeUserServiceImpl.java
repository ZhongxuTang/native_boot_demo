package com.lemonsoul.native_boot_demo.service;

import com.lemonsoul.native_boot_demo.entity.NativeUser;
import com.lemonsoul.native_boot_demo.repository.NativeUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * @author tzx
 */
@Service
public class NativeUserServiceImpl implements NativeUserService {

    private final NativeUserRepository nativeUserRepository;

    @Autowired
    public NativeUserServiceImpl(NativeUserRepository nativeUserRepository) {
        this.nativeUserRepository = nativeUserRepository;
    }

    @Override
    public boolean createUser(NativeUser nativeUser) {
        this.nativeUserRepository.save(nativeUser);
        return true;
    }

    @Override
    public Page<NativeUser> page(Pageable pageable) {
        return this.nativeUserRepository.findAll(pageable);
    }
}
