package me.agnis.entity;

public class Record {
    private int id;
    private String accountName;
    private String operation;
    private Integer documentId;
    private String recordTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Integer getDocumentId() {
        return documentId;
    }

    public void setDocumentId(Integer documentId) {
        this.documentId = documentId;
    }

    public String getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(String recordTime) {
        this.recordTime = recordTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Record record = (Record) o;

        if (id != record.id) return false;
        if (accountName != null ? !accountName.equals(record.accountName) : record.accountName != null) return false;
        if (operation != null ? !operation.equals(record.operation) : record.operation != null) return false;
        if (documentId != null ? !documentId.equals(record.documentId) : record.documentId != null) return false;
        if (recordTime != null ? !recordTime.equals(record.recordTime) : record.recordTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (accountName != null ? accountName.hashCode() : 0);
        result = 31 * result + (operation != null ? operation.hashCode() : 0);
        result = 31 * result + (documentId != null ? documentId.hashCode() : 0);
        result = 31 * result + (recordTime != null ? recordTime.hashCode() : 0);
        return result;
    }
}
