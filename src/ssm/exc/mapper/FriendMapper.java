package ssm.exc.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import ssm.exc.po.FriendExample;
import ssm.exc.po.FriendKey;

public interface FriendMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friend
     *
     * @mbggenerated Sat May 26 13:49:54 CST 2018
     */
    int countByExample(FriendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friend
     *
     * @mbggenerated Sat May 26 13:49:54 CST 2018
     */
    int deleteByExample(FriendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friend
     *
     * @mbggenerated Sat May 26 13:49:54 CST 2018
     */
    int deleteByPrimaryKey(FriendKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friend
     *
     * @mbggenerated Sat May 26 13:49:54 CST 2018
     */
    int insert(FriendKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friend
     *
     * @mbggenerated Sat May 26 13:49:54 CST 2018
     */
    int insertSelective(FriendKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friend
     *
     * @mbggenerated Sat May 26 13:49:54 CST 2018
     */
    List<FriendKey> selectByExample(FriendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friend
     *
     * @mbggenerated Sat May 26 13:49:54 CST 2018
     */
    int updateByExampleSelective(@Param("record") FriendKey record, @Param("example") FriendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friend
     *
     * @mbggenerated Sat May 26 13:49:54 CST 2018
     */
    int updateByExample(@Param("record") FriendKey record, @Param("example") FriendExample example);
}