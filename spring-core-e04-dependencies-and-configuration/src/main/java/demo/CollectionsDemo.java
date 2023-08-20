package demo;

import main.Main;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionsDemo {

    private List<String> someStrings;
    private Set<Integer> someIntegers;
    private Map<String, Integer> someEntries;
    private Properties someProperties;

    public void setSomeStrings(List<String> someStrings) {
        this.someStrings = someStrings;
    }

    public void setSomeIntegers(Set<Integer> someIntegers) {
        this.someIntegers = someIntegers;
    }

    public void setSomeEntries(Map<String, Integer> someEntries) {
        this.someEntries = someEntries;
    }

    public void setSomeProperties(Properties someProperties) {
        this.someProperties = someProperties;
    }

    @Override
    public String toString() {
        return "CollectionsDemo{" +
                "\nsomeStrings=" + someStrings +
                ", \nsomeIntegers=" + someIntegers +
                ", \nsomeEntries=" + someEntries +
                ", \nsomeProperties=" + someProperties +
                "\n}";
    }
}
