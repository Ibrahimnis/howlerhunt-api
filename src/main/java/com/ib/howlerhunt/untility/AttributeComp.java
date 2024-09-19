package com.ib.howlerhunt.untility;

public class AttributeComp {

    String name;
    Object value;
    boolean match;

    public AttributeComp(String name, Object value, boolean match) {
        this.name = name;
        this.value = value;
        this.match = match;
    }

    public String getName() {
        return this.name;
    }

    public Object getValue() {
        return this.value;
    }

    public boolean isMatch() {
        return this.match;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public void setMatch(boolean match) {
        this.match = match;
    }
}
