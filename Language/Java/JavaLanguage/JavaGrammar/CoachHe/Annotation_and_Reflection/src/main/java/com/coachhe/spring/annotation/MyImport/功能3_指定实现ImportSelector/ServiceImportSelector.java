package com.coachhe.spring.annotation.MyImport.功能3_指定实现ImportSelector;

import org.springframework.core.type.AnnotationMetadata;

public class ServiceImportSelector implements ImportSelector{
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        // 可以是@Configuration注解修饰的类，也可以是具体的Bean的全限定名
        return new String[]{"com.coachhe.spring.annotation.MyImport.功能3_指定实现ImportSelector.ConfigB"};
    }

}
