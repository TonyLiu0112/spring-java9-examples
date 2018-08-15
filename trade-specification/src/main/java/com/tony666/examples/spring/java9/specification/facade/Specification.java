package com.tony666.examples.spring.java9.specification.facade;

import java.util.ServiceLoader;

/**
 * 规则器
 *
 * @author Tony
 */
public interface Specification<T> {

    boolean isSatisfied(Object candidate);

    T getResult();

    static ServiceLoader<Specification> getService() {
        return ServiceLoader.load(Specification.class);
    }

}
