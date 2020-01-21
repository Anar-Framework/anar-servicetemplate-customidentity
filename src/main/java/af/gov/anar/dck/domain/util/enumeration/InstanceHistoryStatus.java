package af.gov.anar.dck.domain.util.enumeration;


public enum InstanceHistoryStatus {

    UNVIEWED("UNVIEWD"),
    VIEWED("VIEWED");

    private String text;

    private InstanceHistoryStatus(String text){
        this.text =text;
    }

    public String toString()
    {
        return text;
    }
}