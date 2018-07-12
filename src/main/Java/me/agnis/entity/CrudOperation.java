package me.agnis.entity;

public class CrudOperation {
    private String curdCode;
    private byte read;
    private byte alter;
    private byte download;
    private byte upload;

    public String getCurdCode() {
        return curdCode;
    }

    public void setCurdCode(String curdCode) {
        this.curdCode = curdCode;
    }

    public byte getRead() {
        return read;
    }

    public void setRead(byte read) {
        this.read = read;
    }

    public byte getAlter() {
        return alter;
    }

    public void setAlter(byte alter) {
        this.alter = alter;
    }

    public byte getDownload() {
        return download;
    }

    public void setDownload(byte download) {
        this.download = download;
    }

    public byte getUpload() {
        return upload;
    }

    public void setUpload(byte upload) {
        this.upload = upload;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CrudOperation that = (CrudOperation) o;

        if (read != that.read) return false;
        if (alter != that.alter) return false;
        if (download != that.download) return false;
        if (upload != that.upload) return false;
        if (curdCode != null ? !curdCode.equals(that.curdCode) : that.curdCode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = curdCode != null ? curdCode.hashCode() : 0;
        result = 31 * result + (int) read;
        result = 31 * result + (int) alter;
        result = 31 * result + (int) download;
        result = 31 * result + (int) upload;
        return result;
    }
}
