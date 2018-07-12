package me.agnis.entity;

public class LabelGroup {
    private int id;
    private String ownerAccountName;
    private String groupName;
    private String groupValue;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOwnerAccountName() {
        return ownerAccountName;
    }

    public void setOwnerAccountName(String ownerAccountName) {
        this.ownerAccountName = ownerAccountName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupValue() {
        return groupValue;
    }

    public void setGroupValue(String groupValue) {
        this.groupValue = groupValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LabelGroup that = (LabelGroup) o;

        if (id != that.id) return false;
        if (ownerAccountName != null ? !ownerAccountName.equals(that.ownerAccountName) : that.ownerAccountName != null)
            return false;
        if (groupName != null ? !groupName.equals(that.groupName) : that.groupName != null) return false;
        if (groupValue != null ? !groupValue.equals(that.groupValue) : that.groupValue != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (ownerAccountName != null ? ownerAccountName.hashCode() : 0);
        result = 31 * result + (groupName != null ? groupName.hashCode() : 0);
        result = 31 * result + (groupValue != null ? groupValue.hashCode() : 0);
        return result;
    }
}
