package com.github.dapeng.core.enums;

public class TEnum {

    public TEnum(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    private int id;
    private String name;

    @Override
    public String toString() {
        return "(" + id + "," + name + ")";
    }

    @Override
    public int hashCode() {
        return super.hashCode() + this.id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (obj == this) {
            return true;
        } else if (obj instanceof TEnum) {
            return ((TEnum) obj).id == this.id;
        } else {
            return false;
        }
    }
}
