package com.Ylb.Spring5.customFilter;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

public class MyTypeFilter implements TypeFilter {
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
//        得到注解定义元数据
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
//        得到类元数据
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        Resource resource = metadataReader.getResource();
        String className = classMetadata.getClassName();    //得到类名字
        System.out.println("Class:-->"+className);
        if (className.contains("TestDemo")){
            return true;
        }

        return false;
    }
}
