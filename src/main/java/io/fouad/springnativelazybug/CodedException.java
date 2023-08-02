package io.fouad.springnativelazybug;

public class CodedException extends RuntimeException {

    private final int code;

    public CodedException(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}