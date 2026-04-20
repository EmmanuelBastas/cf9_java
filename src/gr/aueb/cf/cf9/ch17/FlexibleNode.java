package gr.aueb.cf.cf9.ch17;

/**
 * Inplace of Object we can have
 * any type of data.
 */
public class FlexibleNode {

    private Object value;

    public FlexibleNode() {

    }

    public FlexibleNode(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
