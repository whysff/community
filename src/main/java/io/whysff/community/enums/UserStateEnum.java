package io.whysff.community.enums;

/**
 * @author lxstart  Email:liuxuan1021@126.com
 * @create 2022/07/27
 */
public enum UserStateEnum {
    CHECK(0, "审核中"),
    OFFLINE(-1, "非法店铺"),
    SUCCESS(1, "操作成功"),
    PASS(2, "通过认证"),
    NULL_USERNAME(-1001, "账号不能为空！"),
    NULL_PASSWORD(-1002, "密码不能为空！"),
    NULL_EMAIL(-1003, "账号不能为空！") ,
    NULL_USER(-1004, "user信息为空"),
    USER_ALREADY_EXISTS(-1005, "该账号已存在");
    private int state;
    private String stateInfo;

    private UserStateEnum(int state, String stateInfo) {
        this.state = state;
        this.stateInfo = stateInfo;
    }

    /**
     * 依据传入的state返回相应的enum值
     */
    public static UserStateEnum stateOf(int state) {
        for (UserStateEnum stateEnum : values()) {
            if (stateEnum.getState() == state) {
                return stateEnum;
            }
        }
        return null;
    }

    public int getState() {
        return state;
    }

    public String getStateInfo() {
        return stateInfo;
    }
}
