package com.tony666.examples.spring.java9.specification.helper;

import com.tony666.examples.spring.java9.specification.facade.Specification;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/**
 * 交易规则收集器
 */
public class SpecificationCollector<S> implements Collector<Specification<S>, List<S>, S> {

    private final Object candidate;

    public SpecificationCollector(Object candidate) {
        this.candidate = candidate;
    }

    @Override
    public Supplier<List<S>> supplier() {
        return ArrayList::new;
    }

    @Override
    public BiConsumer<List<S>, Specification<S>> accumulator() {
        return (checkResults, specification) -> {
            if (checkResults.size() == 0) {
                if (!specification.isSatisfied(candidate)) {
                    checkResults.add(specification.getResult());
                }
            }
        };
    }

    @Override
    public BinaryOperator<List<S>> combiner() {
        return null;
    }

    @Override
    public Function<List<S>, S> finisher() {
        return checkRes -> checkRes.size() == 0 ? null : checkRes.get(0);
    }

    @Override
    public Set<Characteristics> characteristics() {
        return Collections.singleton(Characteristics.UNORDERED);
    }

}
