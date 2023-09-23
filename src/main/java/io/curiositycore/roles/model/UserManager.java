package io.curiositycore.roles.model;

import io.curiositycore.roles.model.users.User;

import java.util.HashSet;
import java.util.Set;

public class UserManager {
    private static UserManager instance;
    public static UserManager getInstance(){
        if(instance == null){
            instance = new UserManager();
        }
        return instance;
    }
    private Set<User<?>> userSet = new HashSet<>();

    public void registerUser(User<?> userToRegister){
        this.userSet.add(userToRegister);
        applyUsersRole(userToRegister);
    }

    private<T> void applyUsersRole(T userId){
        User<?> userToApplyRoleTo = getUserFromId(userId);
        userToApplyRoleTo.
                applyPermission(PermissionManager.getInstance().
                        getHighestPriorityLinkedPermission(userToApplyRoleTo
                                .getPermissionIds()));
    }

    private<T> User<?> getUserFromId(T id){
        return this.userSet.stream().filter(user-> user.getId().equals(id)).findFirst().orElseThrow();
    }
}
