package io.curiositycore.roles.model.permissions;

public interface Permission<T extends Permission<?>> {
    String getId();
    int getPriority();
    T[] getLinkedPermissions();
}
