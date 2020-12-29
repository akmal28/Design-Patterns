package OpenClosed;

public interface Specification<T> {
    boolean isSatisfied(T item);
}
