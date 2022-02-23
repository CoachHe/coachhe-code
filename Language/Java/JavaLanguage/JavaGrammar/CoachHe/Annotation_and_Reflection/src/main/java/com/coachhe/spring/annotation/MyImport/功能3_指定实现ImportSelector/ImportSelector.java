package com.coachhe.spring.annotation.MyImport.功能3_指定实现ImportSelector;

import org.springframework.core.type.AnnotationMetadata;

public interface ImportSelector {
    public String[] selectImports(AnnotationMetadata importingClassMetadata);
}
