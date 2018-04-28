package pl.sda.javastart.day4;

public interface FlatInfoHolder {

    String STREET_PREFIX = "ul. ";

    String getStreetPrefix();

    String getFlatInfo();

    default String getFlatInfoWithPrefix() {
        return STREET_PREFIX + getFlatInfo();
    }

}
