package ua.nure;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

//@Data
@Getter
@Setter
public class ExampleObjectOverride {
    private int id;
    private int id2;

    public ExampleObjectOverride(int id, int id2) {
        this.id = id;
        this.id2 = id2;
    }


    // Перевизначення методу toString()
    @Override
    public String toString() {
        return "ExampleObjectOverride [id=" + id + "]";
    }

    // Перевизначення методу equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExampleObjectOverride myClass = (ExampleObjectOverride) obj;
        return id == myClass.id;
    }

    // Перевизначення методу hashCode()
    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}
