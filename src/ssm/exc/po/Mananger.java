package ssm.exc.po;

public class Mananger {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mananger.account
     *
     * @mbggenerated Sat May 26 13:49:54 CST 2018
     */
    private String account;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mananger.password
     *
     * @mbggenerated Sat May 26 13:49:54 CST 2018
     */
    private String password;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mananger.account
     *
     * @return the value of mananger.account
     *
     * @mbggenerated Sat May 26 13:49:54 CST 2018
     */
    public String getAccount() {
        return account;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mananger.account
     *
     * @param account the value for mananger.account
     *
     * @mbggenerated Sat May 26 13:49:54 CST 2018
     */
    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mananger.password
     *
     * @return the value of mananger.password
     *
     * @mbggenerated Sat May 26 13:49:54 CST 2018
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mananger.password
     *
     * @param password the value for mananger.password
     *
     * @mbggenerated Sat May 26 13:49:54 CST 2018
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}