package me.agnis.entity;

public class Account {
    private String accountName;
    private String passwordSha1;
    private String personalInfo;

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getPasswordSha1() {
        return passwordSha1;
    }

    public void setPasswordSha1(String passwordSha1) {
        this.passwordSha1 = passwordSha1;
    }

    public String getPersonalInfo() {
        return personalInfo;
    }

    public void setPersonalInfo(String personalInfo) {
        this.personalInfo = personalInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        if (accountName != null ? !accountName.equals(account.accountName) : account.accountName != null) return false;
        if (passwordSha1 != null ? !passwordSha1.equals(account.passwordSha1) : account.passwordSha1 != null)
            return false;
        if (personalInfo != null ? !personalInfo.equals(account.personalInfo) : account.personalInfo != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = accountName != null ? accountName.hashCode() : 0;
        result = 31 * result + (passwordSha1 != null ? passwordSha1.hashCode() : 0);
        result = 31 * result + (personalInfo != null ? personalInfo.hashCode() : 0);
        return result;
    }
}
