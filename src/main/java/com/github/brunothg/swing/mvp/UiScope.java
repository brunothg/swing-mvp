package com.github.brunothg.swing.mvp;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;

@Target({ java.lang.annotation.ElementType.TYPE })
@Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@Documented
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public @interface UiScope {
}