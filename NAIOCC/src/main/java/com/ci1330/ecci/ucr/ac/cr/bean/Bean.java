package com.ci1330.ecci.ucr.ac.cr.bean;

/**
 * Created by kevinleon10 on 09/09/17.
 */
public class Bean {
    private String id;
    private String classBean;
    private String initMethod;
    private String destroyMethod;
    private boolean lazyGen;
    private Scope scope;
    private Autowire autowire;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassBean() {
        return classBean;
    }

    public void setClassBean(String classBean) {
        this.classBean = classBean;
    }

    public String getInitMethod() {
        return initMethod;
    }

    public void setInitMethod(String initMethod) {
        this.initMethod = initMethod;
    }

    public String getDestroyMethod() {
        return destroyMethod;
    }

    public void setDestroyMethod(String destroyMethod) {
        this.destroyMethod = destroyMethod;
    }

    public boolean isLazyGen() {
        return lazyGen;
    }

    public void setLazyGen(boolean lazyGen) {
        this.lazyGen = lazyGen;
    }

    public Scope getScope() {
        return scope;
    }

    public void setScope(Scope scope) {
        this.scope = scope;
    }

    public Autowire getAutowire() {
        return autowire;
    }

    public void setAutowire(Autowire autowire) {
        this.autowire = autowire;
    }
}
