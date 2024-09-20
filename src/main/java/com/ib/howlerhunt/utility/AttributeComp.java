package com.ib.howlerhunt.utility;

public class AttributeComp {

    String attribute;
    Object value;
    boolean match;

    public AttributeComp(String name, Object value, boolean match) {
        this.attribute = name;
        this.value = value;
        this.match = match;
    }

    public String getAttribute() {
        return this.attribute;
    }

    public Object getValue() {
        return this.value;
    }

    public boolean isMatch() {
        return this.match;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public void setMatch(boolean match) {
        this.match = match;
    }
}
