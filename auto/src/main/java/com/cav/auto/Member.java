package com.cav.auto;

public class Member {
    enum MemberType {
        BASIC,
        PRO,
        STORAGE;
    }

    private String username;
    private String password;
    private String fullName;
    private MemberType memberType;

    public Member(String username, String password, String fullName, MemberType memberType) {
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.memberType = memberType;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public MemberType getMemberType() {
        return memberType;
    }

    public void setMemberType(MemberType memberType) {
        this.memberType = memberType;
    }
}