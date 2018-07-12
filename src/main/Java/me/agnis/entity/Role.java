package me.agnis.entity;

public class Role {
    private String roleId;
    private int permissionId;
    private String roleName;
    private String description;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public int getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(int permissionId) {
        this.permissionId = permissionId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Role role = (Role) o;

        if (permissionId != role.permissionId) return false;
        if (roleId != null ? !roleId.equals(role.roleId) : role.roleId != null) return false;
        if (roleName != null ? !roleName.equals(role.roleName) : role.roleName != null) return false;
        if (description != null ? !description.equals(role.description) : role.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = roleId != null ? roleId.hashCode() : 0;
        result = 31 * result + permissionId;
        result = 31 * result + (roleName != null ? roleName.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
