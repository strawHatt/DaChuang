package ssm.exc.po;

public class Type {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column type.id
     *
     * @mbggenerated Sat May 26 13:49:54 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column type.name
     *
     * @mbggenerated Sat May 26 13:49:54 CST 2018
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column type.id
     *
     * @return the value of type.id
     *
     * @mbggenerated Sat May 26 13:49:54 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column type.id
     *
     * @param id the value for type.id
     *
     * @mbggenerated Sat May 26 13:49:54 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column type.name
     *
     * @return the value of type.name
     *
     * @mbggenerated Sat May 26 13:49:54 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column type.name
     *
     * @param name the value for type.name
     *
     * @mbggenerated Sat May 26 13:49:54 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}