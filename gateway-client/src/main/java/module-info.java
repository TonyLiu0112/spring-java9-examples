module gateway.client {
    requires payment.integration;
    requires refund.integration;

    requires java.sql;
    requires spring.core;
    requires spring.beans;
    requires spring.context;
    requires spring.aop;
    requires spring.web;
    requires spring.webmvc;
    requires spring.expression;
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.boot.starter;
    requires spring.boot.starter.actuator;
    requires spring.boot.actuator;
    requires spring.boot.actuator.autoconfigure;
    requires spring.boot.starter.web;

    opens com.tony666.examples.spring.java9.getaway.client;
    opens com.tony666.examples.spring.java9.getaway.client.controller;

    exports com.tony666.examples.spring.java9.getaway.client;
    exports com.tony666.examples.spring.java9.getaway.client.controller;

}