package ssm.exc.po;

public class Advertisement {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column advertisement.id
     *
     * @mbggenerated Sat May 26 13:49:54 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column advertisement.picture
     *
     * @mbggenerated Sat May 26 13:49:54 CST 2018
     */
    private String picture;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column advertisement.url
     *
     * @mbggenerated Sat May 26 13:49:54 CST 2018
     */
    private String url;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column advertisement.name
     *
     * @mbggenerated Sat May 26 13:49:54 CST 2018
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column advertisement.id
     *
     * @return the value of advertisement.id
     *
     * @mbggenerated Sat May 26 13:49:54 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column advertisement.id
     *
     * @param id the value for advertisement.id
     *
     * @mbggenerated Sat May 26 13:49:54 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column advertisement.picture
     *
     * @return the value of advertisement.picture
     *
     * @mbggenerated Sat May 26 13:49:54 CST 2018
     */
    public String getPicture() {
        return picture;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column advertisement.picture
     *
     * @param picture the value for advertisement.picture
     *
     * @mbggenerated Sat May 26 13:49:54 CST 2018
     */
    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column advertisement.url
     *
     * @return the value of advertisement.url
     *
     * @mbggenerated Sat May 26 13:49:54 CST 2018
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column advertisement.url
     *
     * @param url the value for advertisement.url
     *
     * @mbggenerated Sat May 26 13:49:54 CST 2018
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column advertisement.name
     *
     * @return the value of advertisement.name
     *
     * @mbggenerated Sat May 26 13:49:54 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column advertisement.name
     *
     * @param name the value for advertisement.name
     *
     * @mbggenerated Sat May 26 13:49:54 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}