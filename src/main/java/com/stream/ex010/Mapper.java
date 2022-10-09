package com.stream.ex010;

interface Mapper<U, T> {
    public T map(U u);
}