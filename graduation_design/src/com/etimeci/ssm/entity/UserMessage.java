package com.etimeci.ssm.entity;

import java.util.Arrays;

/**
 *
 * @author liji
 *@pramati.
 *   umId;//用户id  ==>u_id
      umPhone;//用户电话   ==>u_id
     umPassword;//用户密码  ==>u_phone
     umPasswordl;//确认密码  ==>无
     umVcode;//验证码 ==>无
     umName;//用户真实姓名  ==>u_name
     umIdentifyNum;//用户身份证号码   ==>u_identify_num
     umEmail;//用户邮箱   ==>u_email
     umCity;//所在城市   ==>u_city
     umLoginName;//用户名==>无
     umRoles;//角色   ==>u_role
     umPermissions;//权限  ==>u_permission
 */




public class UserMessage {
    private Integer umId;//用户id
    private String umPhone;//用户电话
    private String umPassword;//用户密码
    private String umPasswordl;//确认密码
    private String umVcode;//验证码
    private String umBirthday;//生日
    private String umName;//用户真实姓名nickname
    private String umNickName;//用户昵称
    private String umIdentifyNum;//用户身份证号码
    private String umEmail;//用户邮箱
    private String umAddress;//所在城市
    private Integer umLoginName;//用户名
    private String umPhotoPath;
    private String[] umRole;//角色
    private String[] umPermission;//权限s
    private String[] umRoles;//角色
    private String[] umPermissions;//权限s

    public UserMessage() {
        super();
    }




    public String getUmPhotoPath() {
        return umPhotoPath;
    }




    public void setUmPhotoPath(String umPhotoPath) {
        this.umPhotoPath = umPhotoPath;
    }




    public UserMessage(String umRole, String umPermission) {
            umRoles = umRole.split(",");
            umPermissions = umPermission.split(",");
    }

    public Integer getUmId() {
        return umId;
    }

    public void setUmId(Integer umId) {
        this.umId = umId;
    }

    public String getUmPhone() {
        return umPhone;
    }

    public void setUmPhone(String umPhone) {
        this.umPhone = umPhone;
    }

    public String getUmPassword() {
        return umPassword;
    }

    public void setUmPassword(String umPassword) {
        this.umPassword = umPassword;
    }

    public String getUmPasswordl() {
        return umPasswordl;
    }

    public void setUmPasswordl(String umPasswordl) {
        this.umPasswordl = umPasswordl;
    }

    public String getUmVcode() {
        return umVcode;
    }

    public void setUmVcode(String umVcode) {
        this.umVcode = umVcode;
    }

    public String getUmName() {
        return umName;
    }

    public void setUmName(String umName) {
        this.umName = umName;
    }

    public String getUmIdentifyNum() {
        return umIdentifyNum;
    }

    public void setUmIdentifyNum(String umIdentifyNum) {
        this.umIdentifyNum = umIdentifyNum;
    }

    public String getUmEmail() {
        return umEmail;
    }

    public void setUmEmail(String umEmail) {
        this.umEmail = umEmail;
    }

    public String getUmAddress() {
        return umAddress;
    }

    public void setUmAddress(String umAddress) {
        this.umAddress = umAddress;
    }

    public Integer getUmLoginName() {
        return umLoginName;
    }

    public void setUmLoginName(Integer umLoginName) {
        this.umLoginName = umLoginName;
    }

    public String[] getUmRoles() {
        return umRoles;
    }

    public void setUmRoles(String[] umRoles) {
        this.umRoles = umRoles;
    }

    public String[] getUmPermissions() {
        return umPermissions;
    }

    public void setUmPermissions(String[] umPermissions) {
        this.umPermissions = umPermissions;
    }



    public String[] getUmRole() {
        return umRole;
    }

    public void setUmRole(String[] umRole) {
        this.umRole = umRole;
    }

    public String[] getUmPermission() {
        return umPermission;
    }

    public void setUmPermission(String[] umPermission) {
        this.umPermission = umPermission;
    }

    public String getUmNickName() {
        return umNickName;
    }

    public void setUmNickName(String umNickName) {
        this.umNickName = umNickName;
    }


    public String getUmBirthday() {
        return umBirthday;
    }

    public void setUmBirthday(String umBirthday) {
        this.umBirthday = umBirthday;
    }

    @Override
    public String toString() {
        return "UserMessage [umId=" + umId + ", umPhone=" + umPhone + ", umPassword=" + umPassword + ", umPasswordl="
                + umPasswordl + ", umVcode=" + umVcode + ", umName=" + umName + ", umIdentifyNum=" + umIdentifyNum
                + ", umEmail=" + umEmail + ", umCity=" + umAddress + ", umLoginName=" + umLoginName + ", umRoles="
                + Arrays.toString(umRoles) + ", umPermissions=" + Arrays.toString(umPermissions) + "]";
    }
}
