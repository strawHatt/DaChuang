package ssm.exc.po;

public class ExamItemWithBLOBs extends ExamItem {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam_item.ownerDescribe
     *
     * @mbggenerated Sat May 26 13:49:54 CST 2018
     */
    private String ownerdescribe;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam_item.ownerExpect
     *
     * @mbggenerated Sat May 26 13:49:54 CST 2018
     */
    private String ownerexpect;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam_item.ownerDescribe
     *
     * @return the value of exam_item.ownerDescribe
     *
     * @mbggenerated Sat May 26 13:49:54 CST 2018
     */
    public String getOwnerdescribe() {
        return ownerdescribe;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam_item.ownerDescribe
     *
     * @param ownerdescribe the value for exam_item.ownerDescribe
     *
     * @mbggenerated Sat May 26 13:49:54 CST 2018
     */
    public void setOwnerdescribe(String ownerdescribe) {
        this.ownerdescribe = ownerdescribe == null ? null : ownerdescribe.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam_item.ownerExpect
     *
     * @return the value of exam_item.ownerExpect
     *
     * @mbggenerated Sat May 26 13:49:54 CST 2018
     */
    public String getOwnerexpect() {
        return ownerexpect;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam_item.ownerExpect
     *
     * @param ownerexpect the value for exam_item.ownerExpect
     *
     * @mbggenerated Sat May 26 13:49:54 CST 2018
     */
    public void setOwnerexpect(String ownerexpect) {
        this.ownerexpect = ownerexpect == null ? null : ownerexpect.trim();
    }
}