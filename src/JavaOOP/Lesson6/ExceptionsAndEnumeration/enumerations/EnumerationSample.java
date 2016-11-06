package ua.kiev.prog.javaoop.enumerations;

/**
 * @author Bohdan Vanchuhov
 */
public class EnumerationSample {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        ITEmployee john = new ITEmployee("John", Position.JUNIOR_DEVELOPER);
        System.out.println(john);

        System.out.println(Position.ARCHITECT == Position.ARCHITECT);
    }
}

class ITEmployee {
    private String name;
    private final Position position;

    public ITEmployee(String name, Position position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public String toString() {
        return name + ", " + position.getName();
    }

    public Position getPosition() {
        return position;
    }
}

enum Position {
    JUNIOR_DEVELOPER("Junior", 600_00),
    MIDDLE_DEVELOPER("Middle", 1_500_00),
    SENIOR_DEVELOPER("Senior", 4_000_00),
    TEAM_LEAD("Team Lead", 5_000_00),
    ARCHITECT("Architect", 8_000_00);

    public static Position byName(String name) {
        if (name == null) return null;

        Position[] positions = Position.values();
        for (Position position : positions) {
            if (name.equals(position.name)) return position;
        }
        return null;
    }

    private final String name;
    private final long salary;

    Position(String name, long salary) {
        System.out.println(this.name() + " " + this.ordinal());

        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public long getSalary() {
        return salary;
    }
}
