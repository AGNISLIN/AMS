package me.agnis.entity;

public class Permission {
    private int id;
    private String roleId;
    private byte owner;
    private String docType;
    private String curdOperation;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public byte getOwner() {
        return owner;
    }

    public void setOwner(byte owner) {
        this.owner = owner;
    }

    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public String getCurdOperation() {
        return curdOperation;
    }

    public void setCurdOperation(String curdOperation) {
        this.curdOperation = curdOperation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Permission that = (Permission) o;

        if (id != that.id) return false;
        if (owner != that.owner) return false;
        if (roleId != null ? !roleId.equals(that.roleId) : that.roleId != null) return false;
        if (docType != null ? !docType.equals(that.docType) : that.docType != null) return false;
        if (curdOperation != null ? !curdOperation.equals(that.curdOperation) : that.curdOperation != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (roleId != null ? roleId.hashCode() : 0);
        result = 31 * result + (int) owner;
        result = 31 * result + (docType != null ? docType.hashCode() : 0);
        result = 31 * result + (curdOperation != null ? curdOperation.hashCode() : 0);
        return result;
    }
}
