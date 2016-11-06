package JavaOOP.Lesson10.courseproject.comparing;

import JavaOOP.Lesson10.courseproject.entity.Person;

import java.util.Comparator;

/**
 * Created by Anatoliy on 05.11.2016.
 */
public enum PersonComparator implements Comparator<Person>
{
    ID {
        @Override
        public int compare(Person a, Person b) {
            return Integer.compare(a.getId(), b.getId());
        }
    },
    NAME {
        @Override
        public int compare(Person a, Person b) {
            return a.getName().compareTo(b.getName());
        }
    },
    AGE {
        @Override
        public int compare(Person a, Person b) {
            return Integer.compare(a.getAge(), b.getAge());
        }
    }
}
