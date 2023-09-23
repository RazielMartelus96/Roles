package io.curiositycore.roles.model;

import io.curiositycore.roles.model.permissions.Permission;

import java.util.*;

public class PermissionManager {
    private static PermissionManager instance;
    public static PermissionManager getInstance(){
        if(instance == null){
            instance = new PermissionManager();
        }
        return instance;
    }
    private Set<Permission<?>> permissionSet = new HashSet<>();

    public void registerPermission(Permission<?> permissionToSet){
        this.permissionSet.add(permissionToSet);
    }

    public void unregisterPermission(String permissionToRemoveId) throws NoSuchElementException {
        this.permissionSet.remove(findPermissionFromId(permissionToRemoveId));
    }

    public Permission<?> getHighestPriorityLinkedPermission(String[] permissionIds){
        Set<Permission<?>> linkedPermissionsSet = new HashSet<>();
        for(String permissionId : permissionIds){
            linkedPermissionsSet
                    .add(findHighestPriorityPermission(findPermissionFromId(permissionId)
                            .getLinkedPermissions())
                    );
        }
        return linkedPermissionsSet.
                stream().
                min(Comparator.comparingInt(Permission::getPriority))
                .orElseThrow();
    }

    private Permission<?> findHighestPriorityPermission(Permission<?>[] permissionsToCheck) throws NullPointerException{
        int highestPriority = -1;
        Permission<?> highestPriorityPermission = null;
        for(Permission<?> permission : permissionsToCheck){
            if(highestPriority == -1 || permission.getPriority() < highestPriority){
                highestPriority = permission.getPriority();
                highestPriorityPermission = permission;
            }
        }
        if(highestPriorityPermission == null){
            throw new NullPointerException("The permission array checked does not have a highest priority!");
        }
        return highestPriorityPermission;
    }
    private Permission<?> findPermissionFromId(String permissionId){
        return this.permissionSet
                .stream()
                .filter(permission-> permission.getId()
                        .equals(permissionId))
                .findFirst()
                .orElseThrow();
    }
}
