package me.agnis.entity;

public class GroupElement {
    private int id;
    private LabelGroup labelGroupByGroupId;
    private LabelGroup labelGroupByGroupId_0;
    private Label label;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GroupElement that = (GroupElement) o;

        if (id != that.id) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id;
    }

    public LabelGroup getLabelGroupByGroupId() {
        return labelGroupByGroupId;
    }

    public void setLabelGroupByGroupId(LabelGroup labelGroupByGroupId) {
        this.labelGroupByGroupId = labelGroupByGroupId;
    }

    public LabelGroup getLabelGroupByGroupId_0() {
        return labelGroupByGroupId_0;
    }

    public void setLabelGroupByGroupId_0(LabelGroup labelGroupByGroupId_0) {
        this.labelGroupByGroupId_0 = labelGroupByGroupId_0;
    }

    public Label getLabel() {
        return label;
    }

    public void setLabel(Label label) {
        this.label = label;
    }
}
