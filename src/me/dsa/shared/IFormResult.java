package me.dsa.shared;

public interface IFormResult<TResult> {
    void action(final TResult result);
}
