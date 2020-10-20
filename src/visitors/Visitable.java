package visitors;

import visitors.Visitor;

public interface Visitable {
    void accept(Visitor a);
}
