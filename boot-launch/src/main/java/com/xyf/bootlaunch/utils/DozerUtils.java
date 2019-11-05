package com.xyf.bootlaunch.utils;

import org.assertj.core.util.Lists;
import org.dozer.DozerBeanMapper;

import java.util.Collection;
import java.util.List;

public class DozerUtils {

    private static DozerBeanMapper dozerBeanMapper = new DozerBeanMapper();

    public static <T> List<T> mapList(Collection sourceList, Class<T> destinationClass){
        List destinationList = Lists.newArrayList();
        for (Object sourceObject : sourceList) {
            Object destinationObject = dozerBeanMapper.map(sourceObject, destinationClass);
            destinationList.add(destinationObject);
        }
        return destinationList;
    }
}
