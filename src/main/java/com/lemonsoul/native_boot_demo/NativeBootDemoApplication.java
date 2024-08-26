package com.lemonsoul.native_boot_demo;

import com.lemonsoul.native_boot_demo.entity.NativeUser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class NativeBootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(NativeBootDemoApplication.class, args);
    }

    /*class Config{
        @Bean
        public AuditorAware<NativeUser> auditorProvider() {
            return new AuditorAwareImpl();
        }
    }*/
}
