module main.module {

    opens ivan.mostovyi.mainmodule;
    opens ivan.mostovyi.mainmodule.controller;

    requires java.base;
    requires java.sql;

    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.context;
    requires spring.web;
    requires spring.core;
    requires spring.beans;

    requires business.logic.module;

}
