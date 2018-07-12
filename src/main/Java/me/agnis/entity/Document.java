package me.agnis.entity;

public class Document {
    private String documentId;
    private String documentName;
    private String author;
    private String suffix;
    private Double size;
    private String uploadTime;
    private String description;
    private String type;
    private String path;

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public String getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(String uploadTime) {
        this.uploadTime = uploadTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Document document = (Document) o;

        if (documentId != null ? !documentId.equals(document.documentId) : document.documentId != null) return false;
        if (documentName != null ? !documentName.equals(document.documentName) : document.documentName != null)
            return false;
        if (author != null ? !author.equals(document.author) : document.author != null) return false;
        if (suffix != null ? !suffix.equals(document.suffix) : document.suffix != null) return false;
        if (size != null ? !size.equals(document.size) : document.size != null) return false;
        if (uploadTime != null ? !uploadTime.equals(document.uploadTime) : document.uploadTime != null) return false;
        if (description != null ? !description.equals(document.description) : document.description != null)
            return false;
        if (type != null ? !type.equals(document.type) : document.type != null) return false;
        if (path != null ? !path.equals(document.path) : document.path != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = documentId != null ? documentId.hashCode() : 0;
        result = 31 * result + (documentName != null ? documentName.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (suffix != null ? suffix.hashCode() : 0);
        result = 31 * result + (size != null ? size.hashCode() : 0);
        result = 31 * result + (uploadTime != null ? uploadTime.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (path != null ? path.hashCode() : 0);
        return result;
    }
}
