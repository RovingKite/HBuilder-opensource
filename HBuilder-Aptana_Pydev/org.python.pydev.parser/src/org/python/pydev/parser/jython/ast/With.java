// Autogenerated AST node
package org.python.pydev.parser.jython.ast;

import org.python.pydev.parser.jython.SimpleNode;
import java.util.Arrays;

public final class With extends stmtType {
    public WithItemType[] with_item;
    public suiteType body;

    public With(WithItemType[] with_item, suiteType body) {
        this.with_item = with_item;
        this.body = body;
    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Arrays.hashCode(with_item);
        result = prime * result + ((body == null) ? 0 : body.hashCode());
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        With other = (With) obj;
        if (!Arrays.equals(with_item, other.with_item))
            return false;
        if (body == null) {
            if (other.body != null)
                return false;
        } else if (!body.equals(other.body))
            return false;
        return true;
    }

    public With createCopy() {
        return createCopy(true);
    }

    public With createCopy(boolean copyComments) {
        WithItemType[] new0;
        if (this.with_item != null) {
            new0 = new WithItemType[this.with_item.length];
            for (int i = 0; i < this.with_item.length; i++) {
                new0[i] = (WithItemType) (this.with_item[i] != null ? this.with_item[i].createCopy(copyComments) : null);
            }
        } else {
            new0 = this.with_item;
        }
        With temp = new With(new0, body != null ? (suiteType) body.createCopy(copyComments) : null);
        temp.beginLine = this.beginLine;
        temp.beginColumn = this.beginColumn;
        if (this.specialsBefore != null && copyComments) {
            for (Object o : this.specialsBefore) {
                if (o instanceof commentType) {
                    commentType commentType = (commentType) o;
                    temp.getSpecialsBefore().add(commentType.createCopy(copyComments));
                }
            }
        }
        if (this.specialsAfter != null && copyComments) {
            for (Object o : this.specialsAfter) {
                if (o instanceof commentType) {
                    commentType commentType = (commentType) o;
                    temp.getSpecialsAfter().add(commentType.createCopy(copyComments));
                }
            }
        }
        return temp;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer("With[");
        sb.append("with_item=");
        sb.append(dumpThis(this.with_item));
        sb.append(", ");
        sb.append("body=");
        sb.append(dumpThis(this.body));
        sb.append("]");
        return sb.toString();
    }

    public Object accept(VisitorIF visitor) throws Exception {
        return visitor.visitWith(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (with_item != null) {
            for (int i = 0; i < with_item.length; i++) {
                if (with_item[i] != null) {
                    with_item[i].accept(visitor);
                }
            }
        }
        if (body != null) {
            body.accept(visitor);
        }
    }

}